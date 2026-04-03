/*
 * Copyright 2024-2026 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.cloud.ai.dashscope.image;

import java.util.Arrays;

import com.alibaba.cloud.ai.dashscope.spec.DashScopeApiSpec.InvokeMode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.Nullable;
import org.springframework.ai.image.ImageOptions;

/**
 * @author nuocheng.lxm
 * @author yuluo
 * @author Polaris
 * @since 2024/8/16 11:29
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashScopeImageOptions implements ImageOptions {

    /**
     * The model to use for image generation.
     */
    @JsonProperty("model")
    private @Nullable String model;

    /**
     * The number of images to generate. Must be between 1 and 4.
     */
    @JsonProperty("n")
    private @Nullable Integer n;

    /**
     * The width of the generated images. Must be one of 720, 1024, 1280
     */
    @JsonProperty("width")
    private @Nullable Integer width;

    /**
     * The height of the generated images. Must be one of 720, 1024, 1280
     */
    @JsonProperty("height")
    private @Nullable Integer height;

    /**
     * The size of the generated images. Must be one of 1024*1024, 720*1280, 1280*720
     */
    @JsonProperty("size")
    private @Nullable String size;

    /**
     * The style of the generated images.Must be one of <photography>,<portrait>,<3d cartoon>,<anime>,
     * <oil painting>,<watercolor>,<sketch>,<chinese painting> <flat illustration>,<auto>
     */
    @JsonProperty("style")
    private @Nullable String style;

    /**
     * Sets the random number seed to use for generation. Must be between 0 and 4294967290.
     */
    @JsonProperty("seed")
    private @Nullable Integer seed;

    /**
     * refer image,Support jpg, png, tiff, webp
     */
    @JsonProperty("ref_img")
    private @Nullable String refImg;

    /**
     * refer strength,Must be between 0.0 and 1.0
     */
    @JsonProperty("ref_strength")
    private @Nullable Float refStrength;

    /**
     * The format in which the generated images are returned. Must be one of url or b64_json.
     */
    @JsonProperty("response_format")
    private @Nullable String responseFormat;

    /**
     * refer mode,Must be one of repaint,refonly
     */
    @JsonProperty("ref_mode")
    private @Nullable String refMode;

    @JsonProperty("negative_prompt")
    private @Nullable String negativePrompt;

    @JsonProperty("prompt_extend")
    private @Nullable Boolean promptExtend;

    @JsonProperty("watermark")
    private @Nullable Boolean watermark;

    @JsonProperty("function")
    private @Nullable String function;

    @JsonProperty("base_image_url")
    private @Nullable String baseImageUrl;

    @JsonProperty("mask_image_url")
    private @Nullable String maskImageUrl;

    @JsonProperty("sketch_image_url")
    private @Nullable String sketchImageUrl;

    @JsonProperty("sketch_weight")
    private @Nullable Integer sketchWeight;

    @JsonProperty("sketch_extraction")
    private @Nullable Boolean sketchExtraction;

    @JsonProperty("sketch_color")
    private Integer @Nullable [][] sketchColor;

    @JsonProperty("mask_color")
    private Integer @Nullable [][] maskColor;

    @JsonProperty("max_images")
    private @Nullable Integer maxImages;

    @JsonProperty("enable_interleave")
    private @Nullable Boolean enableInterleave;

    /**
     * Invocation mode for the API call.
     * - AUTO: automatically choose based on model defaults (backward compatible)
     * - SYNC: synchronous call (no async header)
     * - ASYNC: asynchronous call (with async header, returns task_id for polling)
     * Note: If model doesn't support sync, will auto-downgrade to async with WARN log.
     */
    @JsonIgnore
    private InvokeMode invokeMode = InvokeMode.AUTO;

    /**
     * Output aspect ratio for out-painting, e.g. "4:3".
     */
    @JsonProperty("output_ratio")
    private @Nullable String outputRatio;

    /**
     * Horizontal expansion scale for out-painting.
     */
    @JsonProperty("x_scale")
    private @Nullable Float xScale;

    /**
     * Vertical expansion scale for out-painting.
     */
    @JsonProperty("y_scale")
    private @Nullable Float yScale;

    /**
     * Rotation angle in degrees for out-painting.
     */
    @JsonProperty("angle")
    private @Nullable Integer angle;

    /**
     * Left expansion in pixels for out-painting.
     */
    @JsonProperty("left_offset")
    private @Nullable Integer leftOffset;

    /**
     * Right expansion in pixels for out-painting.
     */
    @JsonProperty("right_offset")
    private @Nullable Integer rightOffset;

    /**
     * Top expansion in pixels for out-painting.
     */
    @JsonProperty("top_offset")
    private @Nullable Integer topOffset;

    /**
     * Bottom expansion in pixels for out-painting.
     */
    @JsonProperty("bottom_offset")
    private @Nullable Integer bottomOffset;

    /**
     * Whether to use best quality mode for out-painting.
     */
    @JsonProperty("best_quality")
    private @Nullable Boolean bestQuality;

    /**
     * Whether to limit output image size for out-painting.
     */
    @JsonProperty("limit_image_size")
    private @Nullable Boolean limitImageSize;

    public @Nullable Boolean getPromptExtend() {
        return promptExtend;
    }

    public void setPromptExtend(@Nullable Boolean promptExtend) {
        this.promptExtend = promptExtend;
    }

    public @Nullable Boolean getWatermark() {
        return watermark;
    }

    public void setWatermark(@Nullable Boolean watermark) {
        this.watermark = watermark;
    }

    public @Nullable String getFunction() {
        return function;
    }

    public void setFunction(@Nullable String function) {
        this.function = function;
    }

    public @Nullable String getBaseImageUrl() {
        return baseImageUrl;
    }

    public void setBaseImageUrl(@Nullable String baseImageUrl) {
        this.baseImageUrl = baseImageUrl;
    }

    public @Nullable String getMaskImageUrl() {
        return maskImageUrl;
    }

    public void setMaskImageUrl(@Nullable String maskImageUrl) {
        this.maskImageUrl = maskImageUrl;
    }

    public @Nullable String getSketchImageUrl() {
        return sketchImageUrl;
    }

    public void setSketchImageUrl(@Nullable String sketchImageUrl) {
        this.sketchImageUrl = sketchImageUrl;
    }

    public @Nullable Integer getSketchWeight() {
        return sketchWeight;
    }

    public void setSketchWeight(@Nullable Integer sketchWeight) {
        this.sketchWeight = sketchWeight;
    }

    public @Nullable Boolean getSketchExtraction() {
        return sketchExtraction;
    }

    public void setSketchExtraction(@Nullable Boolean sketchExtraction) {
        this.sketchExtraction = sketchExtraction;
    }

    public Integer @Nullable [][] getSketchColor() {
        return sketchColor;
    }

    public void setSketchColor(Integer @Nullable [][] sketchColor) {
        this.sketchColor = sketchColor;
    }

    public Integer @Nullable [][] getMaskColor() {
        return maskColor;
    }

    public void setMaskColor(Integer @Nullable [][] maskColor) {
        this.maskColor = maskColor;
    }

    public void setMaxImages(@Nullable Integer maxImages) {
        this.maxImages = maxImages;
    }

    public @Nullable Integer getMaxImages() {
        return maxImages;
    }

    public @Nullable Boolean getEnableInterleave() {
        return enableInterleave;
    }

    public void setEnableInterleave(@Nullable Boolean enableInterleave) {
        this.enableInterleave = enableInterleave;
    }

    public InvokeMode getInvokeMode() {
        return invokeMode;
    }

    public void setInvokeMode(InvokeMode invokeMode) {
        this.invokeMode = invokeMode;
    }

    public @Nullable String getOutputRatio() {
        return outputRatio;
    }

    public void setOutputRatio(String outputRatio) {
        this.outputRatio = outputRatio;
    }

    public @Nullable Float getXScale() {
        return xScale;
    }

    public void setXScale(@Nullable Float xScale) {
        this.xScale = xScale;
    }

    public @Nullable Float getYScale() {
        return yScale;
    }

    public void setYScale(@Nullable Float yScale) {
        this.yScale = yScale;
    }

    public @Nullable Integer getAngle() {
        return angle;
    }

    public void setAngle(@Nullable Integer angle) {
        this.angle = angle;
    }

    public @Nullable Integer getLeftOffset() {
        return leftOffset;
    }

    public void setLeftOffset(@Nullable Integer leftOffset) {
        this.leftOffset = leftOffset;
    }

    public @Nullable Integer getRightOffset() {
        return rightOffset;
    }

    public void setRightOffset(@Nullable Integer rightOffset) {
        this.rightOffset = rightOffset;
    }

    public @Nullable Integer getTopOffset() {
        return topOffset;
    }

    public void setTopOffset(@Nullable Integer topOffset) {
        this.topOffset = topOffset;
    }

    public @Nullable Integer getBottomOffset() {
        return bottomOffset;
    }

    public void setBottomOffset(@Nullable Integer bottomOffset) {
        this.bottomOffset = bottomOffset;
    }

    public @Nullable Boolean getBestQuality() {
        return bestQuality;
    }

    public void setBestQuality(@Nullable Boolean bestQuality) {
        this.bestQuality = bestQuality;
    }

    public @Nullable Boolean getLimitImageSize() {
        return limitImageSize;
    }

    public void setLimitImageSize(@Nullable Boolean limitImageSize) {
        this.limitImageSize = limitImageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public @Nullable Integer getN() {
        return this.n;
    }

    public void setN(@Nullable Integer n) {
        this.n = n;
    }

    @Override
    public @Nullable String getModel() {
        return this.model;
    }

    public void setModel(@Nullable String model) {
        this.model = model;
    }

    @Override
    public @Nullable Integer getWidth() {
        return this.width;
    }

    public void setWidth(@Nullable Integer width) {
        this.width = width;
        this.size = this.width != null && this.height != null ? this.width + "*" + this.height : null;
    }

    @Override
    public @Nullable Integer getHeight() {
        return this.height;
    }

    public void setHeight(@Nullable Integer height) {
        this.height = height;
        this.size = this.width != null && this.height != null ? this.width + "*" + this.height : null;
    }

    @Override
    public @Nullable String getResponseFormat() {
        return this.responseFormat;
    }

    @Override
    public @Nullable String getStyle() {
        return this.style;
    }

    public void setStyle(@Nullable String style) {
        this.style = style;
    }

    public @Nullable String getSize() {

        if (this.size != null) {
            return this.size;
        }
        return (this.width != null && this.height != null) ? this.width + "*" + this.height : null;
    }

    @Deprecated
    public void setSize(@Nullable String size) {
        this.size = size;
    }

    public @Nullable Integer getSeed() {
        return seed;
    }

    public void setSeed(@Nullable Integer seed) {
        this.seed = seed;
    }

    public @Nullable String getRefImg() {
        return refImg;
    }

    public void setRefImg(@Nullable String refImg) {
        this.refImg = refImg;
    }

    public @Nullable Float getRefStrength() {
        return refStrength;
    }

    public void setRefStrength(@Nullable Float refStrength) {
        this.refStrength = refStrength;
    }

    public @Nullable String getRefMode() {
        return refMode;
    }

    public void setRefMode(@Nullable String refMode) {
        this.refMode = refMode;
    }

    public @Nullable String getNegativePrompt() {
        return negativePrompt;
    }

    public void setNegativePrompt(@Nullable String negativePrompt) {
        this.negativePrompt = negativePrompt;
    }

    @Override
    public String toString() {
        return "DashScopeImageOptions{" + "model='" + this.model + '\'' + ", n=" + this.n + ", width=" + this.width
                + ", height=" + this.height + ", size='" + this.size + '\'' + ", style='" + this.style + '\''
                + ", seed=" + this.seed + ", refImg='" + this.refImg + '\'' + ", refStrength=" + this.refStrength
                + ", responseFormat='" + this.responseFormat + '\'' + ", refMode='" + this.refMode + '\''
                + ", negativePrompt='" + this.negativePrompt + '\'' + ", promptExtend=" + this.promptExtend
                + ", watermark=" + this.watermark + ", function='" + this.function + '\'' + ", baseImageUrl='"
                + this.baseImageUrl + '\'' + ", maskImageUrl='" + this.maskImageUrl + '\'' + ", sketchImageUrl='"
                + this.sketchImageUrl + '\'' + ", sketchWeight=" + this.sketchWeight + ", sketchExtraction="
                + this.sketchExtraction + ", sketchColor=" + Arrays.toString(this.sketchColor) + ", maskColor="
                + Arrays.toString(this.maskColor) + ", maxImages=" + this.maxImages + ", enableInterleave="
                + this.enableInterleave + ", invokeMode=" + this.invokeMode + ", outputRatio='" + this.outputRatio
                + '\'' + ", xScale=" + this.xScale + ", yScale=" + this.yScale + ", angle=" + this.angle
                + ", leftOffset=" + this.leftOffset + ", rightOffset=" + this.rightOffset + ", topOffset="
                + this.topOffset + ", bottomOffset=" + this.bottomOffset + ", bestQuality=" + this.bestQuality
                + ", limitImageSize=" + this.limitImageSize + '}';
    }

    public static class Builder {

        private final DashScopeImageOptions options;

        private Builder() {
            this.options = new DashScopeImageOptions();
        }

        public Builder n(@Nullable Integer n) {
            options.setN(n);
            return this;
        }

        public Builder model(@Nullable String model) {
            options.setModel(model);
            return this;
        }

        public Builder width(@Nullable Integer width) {
            options.setWidth(width);
            return this;
        }

        public Builder height(@Nullable Integer height) {
            options.setHeight(height);
            return this;
        }

        public Builder style(@Nullable String style) {
            options.setStyle(style);
            return this;
        }

        public Builder seed(@Nullable Integer seed) {
            options.setSeed(seed);
            return this;
        }

        public Builder refImg(@Nullable String refImg) {
            options.setRefImg(refImg);
            return this;
        }

        public Builder refStrength(@Nullable Float refStrength) {
            options.setRefStrength(refStrength);
            return this;
        }

        public Builder refMode(@Nullable String refMode) {
            options.setRefMode(refMode);
            return this;
        }

        public Builder negativePrompt(@Nullable String negativePrompt) {
            options.setNegativePrompt(negativePrompt);
            return this;
        }

        public Builder promptExtend(@Nullable Boolean promptExtend) {
            this.options.promptExtend = promptExtend;
            return this;
        }

        public Builder watermark(@Nullable Boolean watermark) {
            this.options.watermark = watermark;
            return this;
        }

        public Builder function(@Nullable String function) {
            this.options.function = function;
            return this;
        }

        public Builder baseImageUrl(@Nullable String baseImageUrl) {
            this.options.baseImageUrl = baseImageUrl;
            return this;
        }

        public Builder maskImageUrl(@Nullable String maskImageUrl) {
            this.options.maskImageUrl = maskImageUrl;
            return this;
        }

        public Builder sketchImageUrl(@Nullable String sketchImageUrl) {
            this.options.sketchImageUrl = sketchImageUrl;
            return this;
        }

        public Builder sketchWeight(@Nullable Integer sketchWeight) {
            this.options.sketchWeight = sketchWeight;
            return this;
        }

        public Builder sketchExtraction(@Nullable Boolean sketchExtraction) {
            this.options.sketchExtraction = sketchExtraction;
            return this;
        }

        public Builder sketchColor(Integer @Nullable [][] sketchColor) {
            this.options.sketchColor = sketchColor;
            return this;
        }

        public Builder maskColor(Integer @Nullable [][] maskColor) {
            this.options.maskColor = maskColor;
            return this;
        }

        public Builder responseFormat(@Nullable String responseFormat) {
            this.options.responseFormat = responseFormat;
            return this;
        }

        public Builder maxImages(@Nullable Integer maxImages) {
            this.options.maxImages = maxImages;
            return this;
        }

        public Builder enableInterleave(@Nullable Boolean enableInterleave) {
            this.options.enableInterleave = enableInterleave;
            return this;
        }

        public Builder invokeMode(InvokeMode invokeMode) {
            this.options.invokeMode = invokeMode;
            return this;
        }

        public Builder outputRatio(@Nullable String outputRatio) {
            this.options.outputRatio = outputRatio;
            return this;
        }

        public Builder xScale(@Nullable Float xScale) {
            this.options.xScale = xScale;
            return this;
        }

        public Builder yScale(@Nullable Float yScale) {
            this.options.yScale = yScale;
            return this;
        }

        public Builder angle(@Nullable Integer angle) {
            this.options.angle = angle;
            return this;
        }

        public Builder leftOffset(@Nullable Integer leftOffset) {
            this.options.leftOffset = leftOffset;
            return this;
        }

        public Builder rightOffset(@Nullable Integer rightOffset) {
            this.options.rightOffset = rightOffset;
            return this;
        }

        public Builder topOffset(@Nullable Integer topOffset) {
            this.options.topOffset = topOffset;
            return this;
        }

        public Builder bottomOffset(@Nullable Integer bottomOffset) {
            this.options.bottomOffset = bottomOffset;
            return this;
        }

        public Builder bestQuality(@Nullable Boolean bestQuality) {
            this.options.bestQuality = bestQuality;
            return this;
        }

        public Builder limitImageSize(@Nullable Boolean limitImageSize) {
            this.options.limitImageSize = limitImageSize;
            return this;
        }

        public DashScopeImageOptions build() {
            return options;
        }
    }
}
