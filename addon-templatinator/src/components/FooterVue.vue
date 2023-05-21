<template>
    <article class="site-footer full-width">
        <section v-for="section in sections" class="site-footer-section">
            <h3 class="site-footer-section-title"> 
                {{ section.title }} 
            </h3>
            <p class="site-footer-section-body" v-html="section.body"/>
        </section>
    </article>
</template>

<script lang="ts">
export default {
    name: "Footer",
    data() {
        return {
            sections: [
                    {
                        title: "About Us",
                        body: "This project is open source you can find the source code <a href='https://github.com/Rabbitminers/Create-Mod-Addon-Template'>here</a>, and maintained by Rabbitminers' development team if you want to contact us, find any issues or would like a new feature you can contact us on Discord here"
                    },
                    {
                        title: "Where From Here?",
                        body: "Documentation about making create addons is limited to non-existent, but we reccomend reading through existing addon's source code aswell as create's"
                    }
                ]
            }
    }
}
</script>

<style lang="scss">
.site-footer {
    background-color: var(--colour-primary);
    color: var(--colour-off-white);
    height: fit-content;
    display: flex;
    flex-wrap: wrap;
    gap: 1em;

    > * {
        box-sizing: border-box;
        padding: 10px;
    }

    &-section {
        padding: 10px;
        flex: 1 1;
        margin-right: 10px;
        min-width: 20em;

        &-title {
            text-decoration: underline;
        }

        &-body {
            color: var(--colour-off-white-dimmed);
        }
    }
}

a {
    color: var(--colour-primary-dark);
}

</style>