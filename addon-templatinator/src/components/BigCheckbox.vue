<template>
    <div class="checkbox">
        <label class="checkbox-wrapper">
            <input 
				class="checkbox-input"
				:name="name"
				:type="type" 
				v-model="isChecked" />
            <span class="checkbox-tile">
                <span class="checkbox-icon">
                    <slot/>
                </span>
                <span class="checkbox-label">{{ label }}</span>
            </span>
        </label>
    </div>
</template>

<script lang="ts">
export default {
    name: "BigCheckbox",
    props: {
        label: {
            type: String,
            default: ""
        },
		type: {
			type: String,
			default: "checkbox"
		},
		name: {
			type: String,
		} 
    },
	data() {
		return {
			isChecked: false
		}
	}
}
</script>

<style lang="scss">

@font-face {
    font-family: 'outlined';
    src: url('/public/fonts/kg-red-hands.outline.ttf') format('truetype');
}

.checkbox-input {
	clip: rect(0 0 0 0);
	clip-path: inset(100%);
	height: 1px;
	overflow: hidden;
	position: absolute;
	white-space: nowrap;
	width: 1px;

	&:checked + .checkbox-tile {
		border-color: var(--colour-primary);;
		box-shadow: 0 5px 10px rgba(#000, 0.1);
		color: var(--colour-primary);;
		&:before {
			transform: scale(1);
			opacity: 1;
			background-color: var(--colour-primary);;
			border-color: var(--colour-primary);;
		}
		
		.checkbox-icon, .checkbox-label {
			color: var(--colour-primary);
		}

        path {
            fill: var(--colour-primary);
        }
	}

}

.checkbox-tile {
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	width: 7rem;
	min-height: 7rem;
	border-radius: 0.5rem;
	border: 3px solid #b5bfd9;
	box-shadow: 0 5px 10px rgba(#000, 0.1);
	transition: 0.15s ease;
	cursor: pointer;
	position: relative;

	&:before {
		content: "";
		position: absolute;
		display: block;
		width: 1.25rem;
		height: 1.25rem;
		border: 2px solid #b5bfd9;
		border-radius: 50%;
		top: 0.25rem;
		left: 0.25rem;
		opacity: 0;
		transform: scale(0);
		transition: 0.25s ease;
		background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='192' height='192' fill='%23FFFFFF' viewBox='0 0 256 256'%3E%3Crect width='256' height='256' fill='none'%3E%3C/rect%3E%3Cpolyline points='216 72.005 104 184 48 128.005' fill='none' stroke='%23FFFFFF' stroke-linecap='round' stroke-linejoin='round' stroke-width='32'%3E%3C/polyline%3E%3C/svg%3E");
		background-size: 12px;
		background-repeat: no-repeat;
		background-position: 50% 50%;
	}

	&:hover {
        color: var(--colour-primary);;
		border-color: var(--colour-primary);

		&:before {
			transform: scale(1);
			opacity: 1;
		}

        path {
            fill: var(--colour-primary);
        }
	}
}

.checkbox-icon {
	transition: .375s ease;
	color: var(--color-text);
    font-family: 'Courier New', Courier, monospace;

    h1 {
        font-size: 2.75em;
        font-family: 'outlined';
    }

	h2 {
		font-family: 'outlined';
		font-size: 2.25em;
		padding-bottom: 0.15em;
		border-bottom: 1px solid #777;
	}

    svg {
        width: 3rem;
        height: 3rem;

    }
    
}

.checkbox-label {
	color: var(--color-text);
	transition: .375s ease;
    font-size: x-small;
	text-align: center;
}

</style>