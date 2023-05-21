<template>
	<form id="content">
		<ul class="timeline">
			<FormSection title="Project Structure" timeline="General Settings" :open_by_default="true">
				<h3 class="form-section-subheading">Mod Platform</h3>

				<a class="form-section-summary">Please note that features not available to your platform will be hidden, i.e in a forge mod Porting lib will not be made available</a>

				<br/> <br/>

				<section class="horizontal-spaced-row">
					<BigCheckbox label="Architectury" name="platform" type="radio" ref="arch">
						<ArchitecturyLogo/>
					</BigCheckbox>
					<BigCheckbox label="Forge" name="platform" type="radio" ref="forge">
						<ForgeLogo/>
					</BigCheckbox>
					<BigCheckbox label="Fabric" name="platform" type="radio" ref="fabric">
						<FabricLogo/>
					</BigCheckbox>
				</section>

				<br/>

				<p class="form-section-summary">Only one platform can be picked, Forge and Fabric will allow you to build to those respective platforms and architectury will allow you to build to both simultaneously, however keep in mind this can add additional complexity to the project especially when utilising platform specific features such as fluids or networking</p>
				
				<h3 class="form-section-subheading">Mod Version</h3>

				<a class="form-section-summary">More versions will be added as availabe, there are currently no plans to backport these templates prior to 1.18.2, if you would like to port them yourself we would appreciate the help</a>

				<br/> <br/>

				<section class="horizontal-spaced-row">
					<BigCheckbox label="Caves & Cliffs" name="version" type="radio" ref="arch">
						<h2>1.18.2</h2>
					</BigCheckbox>
					<BigCheckbox label="Wild Update" name="version" type="radio" ref="forge">
						<h2>1.19.2</h2>
					</BigCheckbox>
					<BigCheckbox label="Tales & Trails" name="version" type="radio" ref="forge">
						<h2>1.20</h2>
					</BigCheckbox>
				</section>

				<br/>

				<p class="form-section-summary">We reccomend you develop on 1.18.2 first then porting to future versions later in development to stay in parity with other addons and official development</p>

				<h3 class="form-section-subheading">Mod Details</h3>

				<a class="form-section-summary">These will automatically be used across your project saving you time refactoring, especially in architectury projects.</a>

				<br/> <br/>

				<section class="mod-details">
					<label>
						<h4> Mod Name</h4>
						<input 
							type="text"
							placeholder="Some Mod Name"
						/>
					</label>

					<label>
						<h4> Package Name </h4>
						<input 
							type="text"
							placeholder="com.yourname"
						/>
					</label>
				</section>

				<br/>

				<p class="form-section-summary">Your mods name will automatically be converted to a valid mod id, for example "Example Mod" will be converted to "example-mod"</p>

			</FormSection>

			<FormSection title="Recipe Browsers" timeline="Development QOL">
				<a class="form-section-summary">You can select as many recipe browsers as you like, they will all be added to the buildscript and can be switched between by changing the recipe_browser entry in gradle.properties</a>

				<br/> <br/>

				<section class="horizontal-spaced-row">
					<BigCheckbox label="Just enough items">
						<h1>JEI</h1>
					</BigCheckbox>
					<BigCheckbox label="Roughly enough items">
						<h1>REI</h1>
					</BigCheckbox>
					<BigCheckbox label="There's no acronym">
						<h1>EMI</h1>
					</BigCheckbox>
				</section>
				
				<br/>

				<p>Note EMI is only available for fabric (and quilt), and some builds of REI have had crashes with specific recipe types from create, this is not a bug with your recipes and is safe in production</p>
			</FormSection>

			<FormSection title="Development Features">
				<a class="form-section-summary">These are tools to help speed up development by making some tasks easier or removing repatative jobs</a>

				<br/> <br/>

				<section class="horizontal-spaced-row">
					<BigCheckbox label="Datagen">
						<DatagenIcon/>
					</BigCheckbox>
					<BigCheckbox label="Quiltflower">
						<QuiltflowerIcon/>
					</BigCheckbox>
				</section>

				<br/>

				<p>Quiltflower is a modern, general purpose decompiler focused on improving code quality, speed, and usability. Quiltflower is a fork of Fernflower and Forgeflower.</p>
			</FormSection>
		</ul>

		<ul class="timeline">
			<input class="event" type="submit" value="Download!"/>
		</ul>
	</form>
</template>

<script lang="ts">
import BigCheckbox from './BigCheckbox.vue';
import FormSection from './FormSection.vue';
import ArchitecturyLogo from './icons/ArchitecturyLogo.vue'
import ForgeLogo from './icons/ForgeLogo.vue';
import FabricLogo from './icons/FabricLogo.vue'
import DatagenIcon from './icons/DatagenIcon.vue';
import QuiltflowerIcon from './icons/QuiltflowerIcon.vue'

export default {
	name: "Form",
	components: {
		BigCheckbox,
		FormSection,
		ArchitecturyLogo,
		ForgeLogo,
		FabricLogo,
		DatagenIcon,
		QuiltflowerIcon
	},
}
</script>

<style lang="scss">
@import url('https://fonts.googleapis.com/css?family=Raleway');
@import url('http://weloveiconfonts.com/api/?family=entypo');

[class*="entypo-"]:before {
font-family: 'entypo', sans-serif;
}

[class*="entypo-"] {
width: 1em;
height: 1em;
}

$primary-color: var(--colour-primary);
$secondary-color: #777;
$background-color: var(--color-background-mute);
$text-color: var(--colour-text);
$highlight-color:  var(--color-background-mute);
$light-color: rgba(255, 255, 255, 0.8);

body {
	font-family: 'Raleway', sans-serif;
}

a,
span,
h1,
h2,
h3,
span {
text-decoration: none;
color: $text-color;
}

a:hover {
color: $secondary-color;
}

h1,
h2 {
font-family: 'Raleway', sans-serif;
letter-spacing: 1.5px;
color: $text-color;
font-weight: 100;
}

h1 {
font-size: 2.4em;
margin: 0;
border-bottom: 1px solid $secondary-color;
padding-bottom: 0.2em;
}

h2 {
font-size: 1.0em;
}

#content {
	flex-grow: 1;
	margin-top: 50px;
	margin: auto;
	text-align: center;
}

.timeline {
	border-left: 0.25em solid $primary-color;
	background: $background-color;
	margin: 2em auto;
	line-height: 1.4em;
	padding: 1em;
	padding-left: 3em;
	list-style: none;
	text-align: left;
	margin-left: 10em;
	margin-right: 3em;
	border-radius: 0.5em;
	min-width: 22em;
	max-width: 50em;

	.event {
		min-width: 20em;
		width: 100%;
		vertical-align: middle;
		box-sizing: border-box;
		position: relative;

		&:before,
		&:after {
			position: absolute;
			display: block;
			top: 1em;
		}

		&:before {
			left: -15em;
			color: $text-color;
			content: attr(data-date);
			text-align: right;
			font-weight: 100;
			font-size: 0.9em;
			min-width: 9em;
		}

		&:after {
			box-shadow: 0 0 0 0.2em $primary-color;
			left: -3.5em;
			background: $highlight-color;
			border-radius: 50%;
			height: 0.75em;
			width: 0.75em;
			content: "";
		}

		.member-location,
		.member-parameters {
		  max-height: 0;
		  overflow: hidden;
		  transition: max-height 0.9s ease;
		}
		
		.open {
		  max-height: 60em;
		}
	}
}

.member-infos {
	padding: 10px;
	text-align: left;
	position: relative;

	> h1 {
		font-weight: bold;
		font-size: 1.4em;
	}
}

.member-location a:before {
	margin-right: 5px;
}

.member-location {
	text-indent: 2px;
}

.follow,
.options {
	width: 30px;
	height: 30px;
	text-align: center;
	line-height: 30px;
	background: #D3D3D3;
	text-shadow: 0 1px 0 rgba(255, 255, 255, 0.4);
	box-shadow: 0 2px 0 0 #C0C0C0;
	border-radius: 3px;
	display: inline-block;

	&:hover {
		box-shadow: 0 1px 0 0 #C0C0C0;
		box-sizing: border-box;
		vertical-align: bottom;
		margin-bottom: -1px;
	}
}

.member-socials {
	display: inline-block;
	font-weight: bold;
	vertical-align: bottom;
	line-height: 8px;
	float: right;

	li {
		display: inline-block;
	}
}

.shots-number,
.followers {
	font-weight: normal;
	display: block;
	margin-top: 10px;
	font-size: 0.9em;
}

.member-contact {
position: absolute;
right: 10px;
top: 10px;

	li {
		display: inline-block;
		margin-left: 10px;
	}
}

.member-input {
	display: flex;
	color: $primary-color;

	input[type="checkbox"] {
		display: grid;
		place-content: center;
	}
	  
	input[type="checkbox"]::before {
		content: "";
		width: 0.65em;
		height: 0.65em;
		transform: scale(0);
		transition: 120ms transform ease-in-out;
		box-shadow: inset 1em 1em $primary-color;
	}
	
	input[type="checkbox"]:checked::before {
		transform: scale(1);
	}
}

.member-shots-number {
	padding-right: 6px;
	border-right: 1px solid rgba(0, 0, 0, 0.06);
	margin-right: 6px;
	margin-left: 6px;
}

.form-section {
	&-summary {
		padding-bottom: 1em;
	}

	&-subheading {
		font-size: x-large;
		font-weight: 500;
		text-align: center;
		padding-bottom: 0.7em;
	}
}

.mod-details {
	flex-direction: row;
	width: 100%;
	display: flex;
	gap: 2em;

	label {
		width: 50%;

		> h4 {
			margin-bottom: 0.3em;
		}
	}

	input[type="text"] {
		width: 100%;
		background-color: transparent;
		border-radius: 2em;
		border-radius: 0.5rem;
		border: 3px solid #b5bfd9;
		padding: 10px;
		color: var(--colour-primary);
		transition: 0.25s ease;
	
		&::placeholder {
			color: var(--colour-text-light);
		}
	
		&:hover {
			border-color: var(--colour-primary);
		}
	}
}

input[type="submit"] {
	font-family: 'Raleway', sans-serif;
	font-weight: 800;
	background-color: transparent;
	border: none;
	text-align: left;
	font-size: 1.5em;
	color: var(--colour-text);
	margin: 0;
	padding-bottom: 0.2em;
	transition: 0.25s ease;
	

	&:hover {
		color: var(--colour-primary);
		border-color: var(--colour-primary);
	}
}

</style>