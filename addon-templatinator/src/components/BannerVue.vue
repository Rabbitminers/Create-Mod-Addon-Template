<template>
    <article class="site-header full-width">
        <section class="site-header-icon">
            <img 
                class="site-header-icon-image" 
                src="images/create-logo.png" 
                alt="logo"
            />
        </section>
        <section class="site-header-title">
            Create Addon Template-intator
        </section>
    </article>
</template>

<script lang="ts">
export default {
    name: "Header"
}
</script>

<style lang="scss">
$header-height: 7em;
$header-border-radius: 2em;

.site-header {
    background-color: var(--colour-primary);
    justify-content: left;
    display: flex;
    height: $header-height;
    margin-bottom: 3em;

    > * {
        box-sizing: border-box;
        border-radius: $header-border-radius;
    }

    &-icon-image {
        width: $header-height;
        height: $header-height;
        padding: 10px;
        position: relative;

        &:hover {
            border-radius: 100%;
            box-shadow: 10px 10px 10px black;
        }
    }

    &-title {
        font-size: 1.5em;
        text-align: left;
        font-weight: 800;
        padding: 10px;
        color: var(--colour-off-white);
    }
}
</style>