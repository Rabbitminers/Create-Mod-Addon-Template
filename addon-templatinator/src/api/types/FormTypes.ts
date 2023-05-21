import { Component } from "vue";

export interface Section {
    title: string,
    timeline?: string,
    description?: string,
    icon: string,
    body: Component
    open: boolean
};

export interface Input {
    type: InputType,
    label: string,
    platform: Platform
    icon?: string,
    placeholder?: string,
    description?: string,
    id: string
};

export type Platform = "forge" | "fabric" | "architectury" | "all";

export type InputType = "text" | "textarea" | "radio" | "checkbox";