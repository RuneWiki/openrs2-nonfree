package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!app")
public class Class77_Sub11_Sub1 extends Class77_Sub11 {

	@OriginalMember(owner = "client!app", name = "j", descriptor = "Ljava/lang/String;")
	static final String aString68 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!app", name = "d", descriptor = "Ljava/lang/String;")
	static final String aString69 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";

	@OriginalMember(owner = "client!app", name = "g", descriptor = "Ljava/lang/String;")
	static final String aString70 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!app", name = "s", descriptor = "Ljava/lang/String;")
	static final String aString71 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!app", name = "r", descriptor = "Ljava/lang/String;")
	static final String aString72 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!app", name = "k", descriptor = "Ljava/lang/String;")
	static final String aString73 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!app", name = "i", descriptor = "Ljava/lang/String;")
	static final String aString74 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!app", name = "z", descriptor = "Ljava/lang/String;")
	static final String aString75 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";

	@OriginalMember(owner = "client!app", name = "w", descriptor = "[F")
	static float[] aFloatArray69 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!app", name = "t", descriptor = "F")
	static float aFloat190 = 1.0F;

	@OriginalMember(owner = "client!app", name = "q", descriptor = "I")
	static int anInt2765 = 1;

	@OriginalMember(owner = "client!app", name = "x", descriptor = "[Lclient!aei;")
	static Class85_Sub2[] aClass85_Sub2Array1 = new Class85_Sub2[] { null, null, null };

	@OriginalMember(owner = "client!app", name = "u", descriptor = "[Lclient!bd;")
	Class166[] aClass166Array1 = null;

	@OriginalMember(owner = "client!app", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 24)
	Class77_Sub11_Sub1(@OriginalArg(0) Class86_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!app", name = "bc", descriptor = "()Z", line = 28)
	boolean method19897() {
		return this.aClass86_Sub3_38.aBoolean133;
	}

	@OriginalMember(owner = "client!app", name = "p", descriptor = "()Z", line = 32)
	@Override
	boolean method21286() {
		return this.aClass166Array1 != null;
	}

	@OriginalMember(owner = "client!app", name = "z", descriptor = "()Z", line = 32)
	@Override
	boolean method21296() {
		return this.aClass166Array1 != null;
	}

	@OriginalMember(owner = "client!app", name = "g", descriptor = "()Z", line = 32)
	@Override
	boolean method21295() {
		return this.aClass166Array1 != null;
	}

	@OriginalMember(owner = "client!app", name = "j", descriptor = "()Z", line = 32)
	@Override
	boolean method21297() {
		return this.aClass166Array1 != null;
	}

	@OriginalMember(owner = "client!app", name = "n", descriptor = "()Z", line = 32)
	@Override
	boolean method21298() {
		return this.aClass166Array1 != null;
	}

	@OriginalMember(owner = "client!app", name = "b", descriptor = "()Z", line = 32)
	@Override
	boolean method21287() {
		return this.aClass166Array1 != null;
	}

	@OriginalMember(owner = "client!app", name = "h", descriptor = "()Z", line = 36)
	@Override
	boolean method21300() {
		if (!this.aClass86_Sub3_38.aBoolean133) {
			return false;
		}
		this.aClass166Array1 = new Class166[3];
		@Pc(70) int local70;
		if (this.aClass86_Sub3_38.aBoolean139) {
			this.aClass166Array1[0] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[1] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[2] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass166Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass166Array1[0] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[1] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[2] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass166Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass166Array1 != null;
	}

	@OriginalMember(owner = "client!app", name = "a", descriptor = "()Z", line = 36)
	@Override
	boolean method21299() {
		if (!this.aClass86_Sub3_38.aBoolean133) {
			return false;
		}
		this.aClass166Array1 = new Class166[3];
		@Pc(70) int local70;
		if (this.aClass86_Sub3_38.aBoolean139) {
			this.aClass166Array1[0] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[1] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[2] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass166Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass166Array1[0] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[1] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[2] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass166Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass166Array1 != null;
	}

	@OriginalMember(owner = "client!app", name = "m", descriptor = "()Z", line = 36)
	@Override
	boolean method21316() {
		if (!this.aClass86_Sub3_38.aBoolean133) {
			return false;
		}
		this.aClass166Array1 = new Class166[3];
		@Pc(70) int local70;
		if (this.aClass86_Sub3_38.aBoolean139) {
			this.aClass166Array1[0] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[1] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[2] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass166Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass166Array1[0] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[1] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[2] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass166Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass166Array1 != null;
	}

	@OriginalMember(owner = "client!app", name = "c", descriptor = "()Z", line = 36)
	@Override
	boolean method21285() {
		if (!this.aClass86_Sub3_38.aBoolean133) {
			return false;
		}
		this.aClass166Array1 = new Class166[3];
		@Pc(70) int local70;
		if (this.aClass86_Sub3_38.aBoolean139) {
			this.aClass166Array1[0] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[1] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[2] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass166Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass166Array1[0] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[1] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass166Array1[2] = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass166Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass166Array1 != null;
	}

	@OriginalMember(owner = "client!app", name = "l", descriptor = "(II)V", line = 55)
	@Override
	void method21288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!app", name = "ao", descriptor = "(II)V", line = 55)
	@Override
	void method21304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!app", name = "al", descriptor = "(II)V", line = 55)
	@Override
	void method21308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!app", name = "ak", descriptor = "(II)V", line = 55)
	@Override
	void method21305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!app", name = "ag", descriptor = "(II)V", line = 55)
	@Override
	void method21303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!app", name = "v", descriptor = "()V", line = 58)
	@Override
	void method21311() {
		if (this.aClass166Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass166Array1.length; local4++) {
				this.aClass166Array1[local4] = null;
			}
			this.aClass166Array1 = null;
		}
	}

	@OriginalMember(owner = "client!app", name = "ai", descriptor = "()V", line = 58)
	@Override
	void method21302() {
		if (this.aClass166Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass166Array1.length; local4++) {
				this.aClass166Array1[local4] = null;
			}
			this.aClass166Array1 = null;
		}
	}

	@OriginalMember(owner = "client!app", name = "aj", descriptor = "()V", line = 58)
	@Override
	void method21301() {
		if (this.aClass166Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass166Array1.length; local4++) {
				this.aClass166Array1[local4] = null;
			}
			this.aClass166Array1 = null;
		}
	}

	@OriginalMember(owner = "client!app", name = "y", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 65)
	@Override
	void method21312(@OriginalArg(0) int arg0, @OriginalArg(1) Class78_Sub2 arg1, @OriginalArg(2) Class78_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt2765 < 1 || anInt2765 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass166Array1[anInt2765 - 1].anInt3284;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat190, aFloatArray69[0], aFloatArray69[1], aFloatArray69[2]);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg1);
		for (@Pc(47) int local47 = anInt2765 - 1; local47 >= 0; local47--) {
			if (aClass85_Sub2Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass86_Sub3_38.method6190(local47 + 1);
				@Pc(87) Class78 local87 = aClass85_Sub2Array1[local47].method4910();
				if (local87 != null) {
					this.aClass86_Sub3_38.method6195(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "ap", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 65)
	@Override
	void method21315(@OriginalArg(1) Class78_Sub2 arg0, @OriginalArg(2) Class78_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anInt2765 < 1 || anInt2765 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass166Array1[anInt2765 - 1].anInt3284;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat190, aFloatArray69[0], aFloatArray69[1], aFloatArray69[2]);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg0);
		for (@Pc(47) int local47 = anInt2765 - 1; local47 >= 0; local47--) {
			if (aClass85_Sub2Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass86_Sub3_38.method6190(local47 + 1);
				@Pc(87) Class78 local87 = aClass85_Sub2Array1[local47].method4910();
				if (local87 != null) {
					this.aClass86_Sub3_38.method6195(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "aw", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 65)
	@Override
	void method21291(@OriginalArg(1) Class78_Sub2 arg0, @OriginalArg(2) Class78_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anInt2765 < 1 || anInt2765 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass166Array1[anInt2765 - 1].anInt3284;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat190, aFloatArray69[0], aFloatArray69[1], aFloatArray69[2]);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg0);
		for (@Pc(47) int local47 = anInt2765 - 1; local47 >= 0; local47--) {
			if (aClass85_Sub2Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass86_Sub3_38.method6190(local47 + 1);
				@Pc(87) Class78 local87 = aClass85_Sub2Array1[local47].method4910();
				if (local87 != null) {
					this.aClass86_Sub3_38.method6195(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "az", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 65)
	@Override
	void method21317(@OriginalArg(1) Class78_Sub2 arg0, @OriginalArg(2) Class78_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anInt2765 < 1 || anInt2765 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass166Array1[anInt2765 - 1].anInt3284;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat190, aFloatArray69[0], aFloatArray69[1], aFloatArray69[2]);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg0);
		for (@Pc(47) int local47 = anInt2765 - 1; local47 >= 0; local47--) {
			if (aClass85_Sub2Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass86_Sub3_38.method6190(local47 + 1);
				@Pc(87) Class78 local87 = aClass85_Sub2Array1[local47].method4910();
				if (local87 != null) {
					this.aClass86_Sub3_38.method6195(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "au", descriptor = "(I)V", line = 88)
	@Override
	void method21306() {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2765; local3 >= 0; local3--) {
			this.aClass86_Sub3_38.method6190(local3);
			this.aClass86_Sub3_38.method6195(null);
		}
	}

	@OriginalMember(owner = "client!app", name = "w", descriptor = "(I)V", line = 88)
	@Override
	void method21289(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2765; local3 >= 0; local3--) {
			this.aClass86_Sub3_38.method6190(local3);
			this.aClass86_Sub3_38.method6195(null);
		}
	}

	@OriginalMember(owner = "client!app", name = "d", descriptor = "()Lclient!dl;", line = 96)
	@Override
	Class206 method21278() {
		return Class206.aClass206_23;
	}

	@OriginalMember(owner = "client!app", name = "as", descriptor = "()Lclient!dl;", line = 96)
	@Override
	Class206 method21280() {
		return Class206.aClass206_23;
	}

	@OriginalMember(owner = "client!app", name = "ay", descriptor = "()Lclient!dl;", line = 96)
	@Override
	Class206 method21282() {
		return Class206.aClass206_23;
	}

	@OriginalMember(owner = "client!app", name = "aq", descriptor = "()Lclient!dl;", line = 96)
	@Override
	Class206 method21279() {
		return Class206.aClass206_23;
	}

	@OriginalMember(owner = "client!app", name = "am", descriptor = "()Lclient!dl;", line = 96)
	@Override
	Class206 method21281() {
		return Class206.aClass206_23;
	}

	@OriginalMember(owner = "client!app", name = "q", descriptor = "()I", line = 100)
	@Override
	int method21292() {
		return 2;
	}

	@OriginalMember(owner = "client!app", name = "ad", descriptor = "()I", line = 100)
	@Override
	int method21293() {
		return 2;
	}

	@OriginalMember(owner = "client!app", name = "ar", descriptor = "()I", line = 100)
	@Override
	int method21307() {
		return 2;
	}

	@OriginalMember(owner = "client!app", name = "ac", descriptor = "()I", line = 100)
	@Override
	int method21309() {
		return 2;
	}

	@OriginalMember(owner = "client!app", name = "av", descriptor = "()I", line = 100)
	@Override
	int method21310() {
		return 2;
	}

	@OriginalMember(owner = "client!app", name = "r", descriptor = "()Z", line = 104)
	@Override
	boolean method21294() {
		return aFloat190 == 1.0F || aFloatArray69[0] + aFloatArray69[1] + aFloatArray69[2] == 0.0F || aClass85_Sub2Array1[0] == null && aClass85_Sub2Array1[1] == null && aClass85_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!app", name = "an", descriptor = "()Z", line = 104)
	@Override
	boolean method21290() {
		return aFloat190 == 1.0F || aFloatArray69[0] + aFloatArray69[1] + aFloatArray69[2] == 0.0F || aClass85_Sub2Array1[0] == null && aClass85_Sub2Array1[1] == null && aClass85_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!app", name = "ab", descriptor = "()Z", line = 104)
	@Override
	boolean method21313() {
		return aFloat190 == 1.0F || aFloatArray69[0] + aFloatArray69[1] + aFloatArray69[2] == 0.0F || aClass85_Sub2Array1[0] == null && aClass85_Sub2Array1[1] == null && aClass85_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!app", name = "aa", descriptor = "()Z", line = 104)
	@Override
	boolean method21314() {
		return aFloat190 == 1.0F || aFloatArray69[0] + aFloatArray69[1] + aFloatArray69[2] == 0.0F || aClass85_Sub2Array1[0] == null && aClass85_Sub2Array1[1] == null && aClass85_Sub2Array1[2] == null;
	}
}
