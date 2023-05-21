<template>
    <li :key="title" class="event" :data-date="timeline">
        <div class="member-infos">
        <h1 class="member-title" @click="expand()">{{ title }}</h1>
        
        <ul class="member-contact">
            <li v-if="icon" class="member-website">
                <a :class="icon" target="_blank" :href="icon"></a>
            </li>
        </ul>

        
        <div class="member-parameters" :class="{ open: open }">
            <br/>
            <slot></slot>
        </div>
        </div>
    </li>
</template>

<script lang="ts">
export default {
    name: "FormSection",
    props: {
        title: {
            type: String,
            default: "Invalid title"
        },
        timeline: {
            type: String,
            default: ""
        },
        icon: {
            type: String,
            default: "entypo-globe"
        },
        open_by_default: {
            type: Boolean,
            default: false,
        }
    },
    data() {
        return {
            open: this.open_by_default
        }
    },
    methods: {
        expand: function (): void {
            this.open = !this.open;
        }
    }
}
</script>

