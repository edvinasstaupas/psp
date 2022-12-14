package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Objects;

/**
 * TokenDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class TokenDTO {
    @JsonProperty("token")
    private JsonNullable<String> token = JsonNullable.undefined();

    @JsonProperty("tenantId")
    private Integer tenantId;

    public TokenDTO token(String token) {
        this.token = JsonNullable.of(token);
        return this;
    }

    /**
     * Get token
     *
     * @return token
     */
    @ApiModelProperty(value = "")


    public JsonNullable<String> getToken() {
        return token;
    }

    public void setToken(JsonNullable<String> token) {
        this.token = token;
    }

    public TokenDTO tenantId(Integer tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get tenantId
     *
     * @return tenantId
     */
    @ApiModelProperty(value = "")


    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenDTO tokenDTO = (TokenDTO) o;
        return Objects.equals(this.token, tokenDTO.token) &&
                Objects.equals(this.tenantId, tokenDTO.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenDTO {\n");

        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

