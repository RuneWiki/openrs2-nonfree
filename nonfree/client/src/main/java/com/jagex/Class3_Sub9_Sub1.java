package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alv")
public class Class3_Sub9_Sub1 extends Class3_Sub9 {

	@OriginalMember(owner = "client!alv", name = "e", descriptor = "Ljava/lang/String;")
	static final String aString88 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!alv", name = "c", descriptor = "Ljava/lang/String;")
	static final String aString89 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!alv", name = "b", descriptor = "Ljava/lang/String;")
	static final String aString90 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";

	@OriginalMember(owner = "client!alv", name = "j", descriptor = "Ljava/lang/String;")
	static final String aString91 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!alv", name = "z", descriptor = "Ljava/lang/String;")
	static final String aString92 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!alv", name = "n", descriptor = "Ljava/lang/String;")
	static final String aString93 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";

	@OriginalMember(owner = "client!alv", name = "r", descriptor = "Ljava/lang/String;")
	static final String aString94 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!alv", name = "d", descriptor = "Ljava/lang/String;")
	static final String aString95 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!alv", name = "x", descriptor = "[F")
	static float[] aFloatArray81 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!alv", name = "s", descriptor = "F")
	static float aFloat201 = 1.0F;

	@OriginalMember(owner = "client!alv", name = "u", descriptor = "I")
	static int anInt2613 = 1;

	@OriginalMember(owner = "client!alv", name = "y", descriptor = "[Lclient!abe;")
	static Class16_Sub1[] aClass16_Sub1Array1 = new Class16_Sub1[] { null, null, null };

	@OriginalMember(owner = "client!alv", name = "q", descriptor = "[Lclient!bs;")
	Class100[] aClass100Array1 = null;

	@OriginalMember(owner = "client!alv", name = "<init>", descriptor = "(Lclient!abt;)V", line = 24)
	Class3_Sub9_Sub1(@OriginalArg(0) Class21_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alv", name = "ac", descriptor = "()Z", line = 28)
	boolean method18493() {
		return this.aClass21_Sub2_37.aBoolean89;
	}

	@OriginalMember(owner = "client!alv", name = "p", descriptor = "()Z", line = 32)
	@Override
	boolean method18586() {
		return this.aClass100Array1 != null;
	}

	@OriginalMember(owner = "client!alv", name = "j", descriptor = "()Z", line = 32)
	@Override
	boolean method18598() {
		return this.aClass100Array1 != null;
	}

	@OriginalMember(owner = "client!alv", name = "n", descriptor = "()Z", line = 32)
	@Override
	boolean method18624() {
		return this.aClass100Array1 != null;
	}

	@OriginalMember(owner = "client!alv", name = "i", descriptor = "()Z", line = 36)
	@Override
	boolean method18600() {
		if (!this.aClass21_Sub2_37.aBoolean89) {
			return false;
		}
		this.aClass100Array1 = new Class100[3];
		@Pc(70) int local70;
		if (this.aClass21_Sub2_37.aBoolean83) {
			this.aClass100Array1[0] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[1] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[2] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass100Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass100Array1[0] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[1] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[2] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass100Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass100Array1 != null;
	}

	@OriginalMember(owner = "client!alv", name = "k", descriptor = "()Z", line = 36)
	@Override
	boolean method18602() {
		if (!this.aClass21_Sub2_37.aBoolean89) {
			return false;
		}
		this.aClass100Array1 = new Class100[3];
		@Pc(70) int local70;
		if (this.aClass21_Sub2_37.aBoolean83) {
			this.aClass100Array1[0] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[1] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[2] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass100Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass100Array1[0] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[1] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[2] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass100Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass100Array1 != null;
	}

	@OriginalMember(owner = "client!alv", name = "a", descriptor = "()Z", line = 36)
	@Override
	boolean method18605() {
		if (!this.aClass21_Sub2_37.aBoolean89) {
			return false;
		}
		this.aClass100Array1 = new Class100[3];
		@Pc(70) int local70;
		if (this.aClass21_Sub2_37.aBoolean83) {
			this.aClass100Array1[0] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[1] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[2] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass100Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass100Array1[0] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[1] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[2] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass100Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass100Array1 != null;
	}

	@OriginalMember(owner = "client!alv", name = "f", descriptor = "()Z", line = 36)
	@Override
	boolean method18601() {
		if (!this.aClass21_Sub2_37.aBoolean89) {
			return false;
		}
		this.aClass100Array1 = new Class100[3];
		@Pc(70) int local70;
		if (this.aClass21_Sub2_37.aBoolean83) {
			this.aClass100Array1[0] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[1] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[2] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass100Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass100Array1[0] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[1] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass100Array1[2] = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass100Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass100Array1 != null;
	}

	@OriginalMember(owner = "client!alv", name = "l", descriptor = "(II)V", line = 55)
	@Override
	void method18613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!alv", name = "ah", descriptor = "(II)V", line = 55)
	@Override
	void method18606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!alv", name = "g", descriptor = "()V", line = 58)
	@Override
	void method18588() {
		if (this.aClass100Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass100Array1.length; local4++) {
				this.aClass100Array1[local4] = null;
			}
			this.aClass100Array1 = null;
		}
	}

	@OriginalMember(owner = "client!alv", name = "at", descriptor = "()V", line = 58)
	@Override
	void method18603() {
		if (this.aClass100Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass100Array1.length; local4++) {
				this.aClass100Array1[local4] = null;
			}
			this.aClass100Array1 = null;
		}
	}

	@OriginalMember(owner = "client!alv", name = "af", descriptor = "()V", line = 58)
	@Override
	void method18608() {
		if (this.aClass100Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass100Array1.length; local4++) {
				this.aClass100Array1[local4] = null;
			}
			this.aClass100Array1 = null;
		}
	}

	@OriginalMember(owner = "client!alv", name = "ak", descriptor = "()V", line = 58)
	@Override
	void method18589() {
		if (this.aClass100Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass100Array1.length; local4++) {
				this.aClass100Array1[local4] = null;
			}
			this.aClass100Array1 = null;
		}
	}

	@OriginalMember(owner = "client!alv", name = "aa", descriptor = "()V", line = 58)
	@Override
	void method18599() {
		if (this.aClass100Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass100Array1.length; local4++) {
				this.aClass100Array1[local4] = null;
			}
			this.aClass100Array1 = null;
		}
	}

	@OriginalMember(owner = "client!alv", name = "h", descriptor = "(ILclient!aab;Lclient!aab;)V", line = 65)
	@Override
	void method18590(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class4_Sub1 arg2) {
		if (anInt2613 < 1 || anInt2613 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass100Array1[anInt2613 - 1].anInt2963;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat201, aFloatArray81[0], aFloatArray81[1], aFloatArray81[2]);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(arg1);
		for (@Pc(47) int local47 = anInt2613 - 1; local47 >= 0; local47--) {
			if (aClass16_Sub1Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass21_Sub2_37.method4073(local47 + 1);
				@Pc(87) Class4 local87 = aClass16_Sub1Array1[local47].method1604();
				if (local87 != null) {
					this.aClass21_Sub2_37.method4074(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!alv", name = "an", descriptor = "(ILclient!aab;Lclient!aab;)V", line = 65)
	@Override
	void method18607(@OriginalArg(1) Class4_Sub1 arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		if (anInt2613 < 1 || anInt2613 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass100Array1[anInt2613 - 1].anInt2963;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat201, aFloatArray81[0], aFloatArray81[1], aFloatArray81[2]);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(arg0);
		for (@Pc(47) int local47 = anInt2613 - 1; local47 >= 0; local47--) {
			if (aClass16_Sub1Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass21_Sub2_37.method4073(local47 + 1);
				@Pc(87) Class4 local87 = aClass16_Sub1Array1[local47].method1604();
				if (local87 != null) {
					this.aClass21_Sub2_37.method4074(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!alv", name = "x", descriptor = "(I)V", line = 88)
	@Override
	void method18591(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2613; local3 >= 0; local3--) {
			this.aClass21_Sub2_37.method4073(local3);
			this.aClass21_Sub2_37.method4074(null);
		}
	}

	@OriginalMember(owner = "client!alv", name = "as", descriptor = "(I)V", line = 88)
	@Override
	void method18615() {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2613; local3 >= 0; local3--) {
			this.aClass21_Sub2_37.method4073(local3);
			this.aClass21_Sub2_37.method4074(null);
		}
	}

	@OriginalMember(owner = "client!alv", name = "ai", descriptor = "(I)V", line = 88)
	@Override
	void method18610() {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2613; local3 >= 0; local3--) {
			this.aClass21_Sub2_37.method4073(local3);
			this.aClass21_Sub2_37.method4074(null);
		}
	}

	@OriginalMember(owner = "client!alv", name = "aq", descriptor = "(I)V", line = 88)
	@Override
	void method18611() {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2613; local3 >= 0; local3--) {
			this.aClass21_Sub2_37.method4073(local3);
			this.aClass21_Sub2_37.method4074(null);
		}
	}

	@OriginalMember(owner = "client!alv", name = "aj", descriptor = "(I)V", line = 88)
	@Override
	void method18592() {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2613; local3 >= 0; local3--) {
			this.aClass21_Sub2_37.method4073(local3);
			this.aClass21_Sub2_37.method4074(null);
		}
	}

	@OriginalMember(owner = "client!alv", name = "ab", descriptor = "()Lclient!dj;", line = 96)
	@Override
	Class127 method18617() {
		return Class127.aClass127_23;
	}

	@OriginalMember(owner = "client!alv", name = "b", descriptor = "()Lclient!dj;", line = 96)
	@Override
	Class127 method18625() {
		return Class127.aClass127_23;
	}

	@OriginalMember(owner = "client!alv", name = "au", descriptor = "()Lclient!dj;", line = 96)
	@Override
	Class127 method18619() {
		return Class127.aClass127_23;
	}

	@OriginalMember(owner = "client!alv", name = "ay", descriptor = "()Lclient!dj;", line = 96)
	@Override
	Class127 method18620() {
		return Class127.aClass127_23;
	}

	@OriginalMember(owner = "client!alv", name = "ag", descriptor = "()Lclient!dj;", line = 96)
	@Override
	Class127 method18621() {
		return Class127.aClass127_23;
	}

	@OriginalMember(owner = "client!alv", name = "u", descriptor = "()I", line = 100)
	@Override
	int method18593() {
		return 2;
	}

	@OriginalMember(owner = "client!alv", name = "aw", descriptor = "()I", line = 100)
	@Override
	int method18622() {
		return 2;
	}

	@OriginalMember(owner = "client!alv", name = "ar", descriptor = "()Z", line = 104)
	@Override
	boolean method18623() {
		return aFloat201 == 1.0F || aFloatArray81[0] + aFloatArray81[1] + aFloatArray81[2] == 0.0F || aClass16_Sub1Array1[0] == null && aClass16_Sub1Array1[1] == null && aClass16_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!alv", name = "z", descriptor = "()Z", line = 104)
	@Override
	boolean method18597() {
		return aFloat201 == 1.0F || aFloatArray81[0] + aFloatArray81[1] + aFloatArray81[2] == 0.0F || aClass16_Sub1Array1[0] == null && aClass16_Sub1Array1[1] == null && aClass16_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!alv", name = "ae", descriptor = "()Z", line = 104)
	@Override
	boolean method18587() {
		return aFloat201 == 1.0F || aFloatArray81[0] + aFloatArray81[1] + aFloatArray81[2] == 0.0F || aClass16_Sub1Array1[0] == null && aClass16_Sub1Array1[1] == null && aClass16_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!alv", name = "ad", descriptor = "()Z", line = 104)
	@Override
	boolean method18609() {
		return aFloat201 == 1.0F || aFloatArray81[0] + aFloatArray81[1] + aFloatArray81[2] == 0.0F || aClass16_Sub1Array1[0] == null && aClass16_Sub1Array1[1] == null && aClass16_Sub1Array1[2] == null;
	}
}
