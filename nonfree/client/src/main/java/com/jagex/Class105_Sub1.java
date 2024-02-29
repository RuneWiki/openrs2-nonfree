package com.jagex;

import jaggl.OpenGL;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agj")
public class Class105_Sub1 extends Class105 {

	@OriginalMember(owner = "client!agj", name = "y", descriptor = "I")
	static final int anInt1011 = 35632;

	@OriginalMember(owner = "client!agj", name = "l", descriptor = "I")
	static final int anInt1013 = 35633;

	@OriginalMember(owner = "client!agj", name = "w", descriptor = "I")
	static final int anInt1015 = 13;

	@OriginalMember(owner = "client!agj", name = "z", descriptor = "[I")
	static final int[] anIntArray118 = new int[2];

	@OriginalMember(owner = "client!agj", name = "j", descriptor = "[F")
	static final float[] aFloatArray42 = new float[16];

	@OriginalMember(owner = "client!agj", name = "r", descriptor = "Z")
	boolean aBoolean188;

	@OriginalMember(owner = "client!agj", name = "i", descriptor = "Ljava/util/Map;")
	final Map aMap6;

	@OriginalMember(owner = "client!agj", name = "o", descriptor = "Ljava/lang/String;")
	String aString34;

	@OriginalMember(owner = "client!agj", name = "x", descriptor = "I")
	int anInt1012;

	@OriginalMember(owner = "client!agj", name = "e", descriptor = "Ljava/util/Map;")
	final Map aMap7;

	@OriginalMember(owner = "client!agj", name = "d", descriptor = "I")
	int anInt1014;

	@OriginalMember(owner = "client!agj", name = "g", descriptor = "[I")
	int[] anIntArray117;

	@OriginalMember(owner = "client!agj", name = "k", descriptor = "Ljava/util/Map;")
	final Map aMap8;

	@OriginalMember(owner = "client!agj", name = "u", descriptor = "Ljava/util/Map;")
	final Map aMap9;

	@OriginalMember(owner = "client!agj", name = "f", descriptor = "Ljava/util/Map;")
	final Map aMap10;

	@OriginalMember(owner = "client!agj", name = "s", descriptor = "I")
	int anInt1016;

	@OriginalMember(owner = "client!agj", name = "b", descriptor = "Ljava/lang/String;")
	String aString35;

	@OriginalMember(owner = "client!agj", name = "q", descriptor = "Lclient!agy;")
	Class112_Sub2 aClass112_Sub2_1;

	@OriginalMember(owner = "client!agj", name = "t", descriptor = "Lclient!apr;")
	Class86_Sub1_Sub2 aClass86_Sub1_Sub2_1;

	@OriginalMember(owner = "client!agj", name = "<init>", descriptor = "(Lclient!apr;Lclient!agy;Lclient!hq;)V", line = 35)
	Class105_Sub1(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Class112_Sub2 arg1, @OriginalArg(2) Class307 arg2) {
		this(arg0, arg2);
		this.aClass112_Sub2_1 = arg1;
		this.aClass86_Sub1_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!agj", name = "<init>", descriptor = "(Lclient!apr;Lclient!hq;)V", line = 40)
	Class105_Sub1(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Class307 arg1) {
		this.anInt1012 = 0;
		this.anInt1014 = 0;
		this.anInt1016 = 0;
		this.aBoolean188 = false;
		this.anIntArray117 = new int[13];
		this.aMap6 = new HashMap();
		this.aMap8 = new HashMap();
		this.aMap9 = new HashMap();
		this.aMap7 = new HashMap();
		this.aMap10 = new HashMap();
		this.aString41 = arg1.aString195;
		@Pc(50) StringBuilder local50 = new StringBuilder();
		@Pc(63) Class306[] local63;
		@Pc(65) int local65;
		@Pc(73) Class306 local73;
		if (arg1.aString197 != null) {
			this.aString40 = arg1.aString197;
			if (arg1.aClass306Array2 != null) {
				local63 = arg1.aClass306Array2;
				for (local65 = 0; local65 < local63.length; local65++) {
					local73 = local63[local65];
					local50.append("#define " + local73.aString193 + " " + local73.aString194 + '\n');
				}
			}
			local50.append(new String(arg0.method20779(this.aString40)));
			this.aString34 = local50.toString();
		}
		if (arg1.aString196 != null) {
			this.aString39 = arg1.aString196;
			local50.setLength(0);
			if (arg1.aClass306Array1 != null) {
				local63 = arg1.aClass306Array1;
				for (local65 = 0; local65 < local63.length; local65++) {
					local73 = local63[local65];
					local50.append("#define " + local73.aString193 + " " + local73.aString194 + '\n');
				}
			}
			local50.append(new String(arg0.method20779(this.aString39)));
			this.aString35 = local50.toString();
		}
		Class684.method36269(this.anIntArray117, 0, this.anIntArray117.length, -1);
	}

	@OriginalMember(owner = "client!agj", name = "bi", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I", line = 80)
	int method8539(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray118, 0);
		if (anIntArray118[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agj", name = "bg", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I", line = 80)
	int method8540(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray118, 0);
		if (anIntArray118[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agj", name = "bs", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I", line = 80)
	int method8541(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray118, 0);
		if (anIntArray118[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agj", name = "bt", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I", line = 80)
	int method8542(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray118, 0);
		if (anIntArray118[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agj", name = "a", descriptor = "()Z", line = 95)
	@Override
	public boolean method9599() {
		if (this.aBoolean188) {
			return true;
		}
		this.aClass86_Sub1_Sub2_1.aClass105_Sub1_2 = null;
		this.anInt1014 = this.method8539(35633, this.aString34, this.aString40);
		this.anInt1016 = this.method8539(35632, this.aString35, this.aString39);
		if (this.anInt1014 == 0 || this.anInt1016 == 0) {
			if (this.anInt1014 != 0) {
				OpenGL.glDeleteShader(this.anInt1014);
			}
			if (this.anInt1016 != 0) {
				OpenGL.glDeleteShader(this.anInt1016);
			}
			return false;
		}
		this.anInt1012 = OpenGL.glCreateProgram();
		if (this.anInt1014 != 0) {
			OpenGL.glAttachShader(this.anInt1012, this.anInt1014);
		}
		if (this.anInt1016 != 0) {
			OpenGL.glAttachShader(this.anInt1012, this.anInt1016);
		}
		OpenGL.glLinkProgram(this.anInt1012);
		OpenGL.glGetProgramiv(this.anInt1012, 35714, anIntArray118, 0);
		if (anIntArray118[0] == 0) {
			if (this.anInt1014 != 0) {
				OpenGL.glDetachShader(this.anInt1012, this.anInt1014);
				OpenGL.glDeleteShader(this.anInt1014);
			}
			if (this.anInt1016 != 0) {
				OpenGL.glDetachShader(this.anInt1012, this.anInt1016);
				OpenGL.glDeleteShader(this.anInt1016);
			}
			OpenGL.glDeleteProgram(this.anInt1012);
			return false;
		}
		OpenGL.glUseProgram(this.anInt1012);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass112_Sub2_1.method9460(); local112++) {
			if (this.aClass112_Sub2_1.method9461(local112) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class77_Sub12_Sub1 local149;
		for (local112 = 0; local112 < this.aClass112_Sub2_1.method9534(); local112++) {
			local149 = this.aClass112_Sub2_1.method9536(local112);
			if (local149 != null) {
				local149.method23564(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass112_Sub2_1.method9526(); local112++) {
			local149 = this.aClass112_Sub2_1.method9528(local112);
			if (local149 != null) {
				local149.method23564(local110);
			}
		}
		this.aString34 = null;
		this.aString35 = null;
		this.aBoolean188 = true;
		return true;
	}

	@OriginalMember(owner = "client!agj", name = "n", descriptor = "()Z", line = 95)
	@Override
	public boolean method9598() {
		if (this.aBoolean188) {
			return true;
		}
		this.aClass86_Sub1_Sub2_1.aClass105_Sub1_2 = null;
		this.anInt1014 = this.method8539(35633, this.aString34, this.aString40);
		this.anInt1016 = this.method8539(35632, this.aString35, this.aString39);
		if (this.anInt1014 == 0 || this.anInt1016 == 0) {
			if (this.anInt1014 != 0) {
				OpenGL.glDeleteShader(this.anInt1014);
			}
			if (this.anInt1016 != 0) {
				OpenGL.glDeleteShader(this.anInt1016);
			}
			return false;
		}
		this.anInt1012 = OpenGL.glCreateProgram();
		if (this.anInt1014 != 0) {
			OpenGL.glAttachShader(this.anInt1012, this.anInt1014);
		}
		if (this.anInt1016 != 0) {
			OpenGL.glAttachShader(this.anInt1012, this.anInt1016);
		}
		OpenGL.glLinkProgram(this.anInt1012);
		OpenGL.glGetProgramiv(this.anInt1012, 35714, anIntArray118, 0);
		if (anIntArray118[0] == 0) {
			if (this.anInt1014 != 0) {
				OpenGL.glDetachShader(this.anInt1012, this.anInt1014);
				OpenGL.glDeleteShader(this.anInt1014);
			}
			if (this.anInt1016 != 0) {
				OpenGL.glDetachShader(this.anInt1012, this.anInt1016);
				OpenGL.glDeleteShader(this.anInt1016);
			}
			OpenGL.glDeleteProgram(this.anInt1012);
			return false;
		}
		OpenGL.glUseProgram(this.anInt1012);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass112_Sub2_1.method9460(); local112++) {
			if (this.aClass112_Sub2_1.method9461(local112) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class77_Sub12_Sub1 local149;
		for (local112 = 0; local112 < this.aClass112_Sub2_1.method9534(); local112++) {
			local149 = this.aClass112_Sub2_1.method9536(local112);
			if (local149 != null) {
				local149.method23564(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass112_Sub2_1.method9526(); local112++) {
			local149 = this.aClass112_Sub2_1.method9528(local112);
			if (local149 != null) {
				local149.method23564(local110);
			}
		}
		this.aString34 = null;
		this.aString35 = null;
		this.aBoolean188 = true;
		return true;
	}

	@OriginalMember(owner = "client!agj", name = "c", descriptor = "()Z", line = 95)
	@Override
	public boolean method9595() {
		if (this.aBoolean188) {
			return true;
		}
		this.aClass86_Sub1_Sub2_1.aClass105_Sub1_2 = null;
		this.anInt1014 = this.method8539(35633, this.aString34, this.aString40);
		this.anInt1016 = this.method8539(35632, this.aString35, this.aString39);
		if (this.anInt1014 == 0 || this.anInt1016 == 0) {
			if (this.anInt1014 != 0) {
				OpenGL.glDeleteShader(this.anInt1014);
			}
			if (this.anInt1016 != 0) {
				OpenGL.glDeleteShader(this.anInt1016);
			}
			return false;
		}
		this.anInt1012 = OpenGL.glCreateProgram();
		if (this.anInt1014 != 0) {
			OpenGL.glAttachShader(this.anInt1012, this.anInt1014);
		}
		if (this.anInt1016 != 0) {
			OpenGL.glAttachShader(this.anInt1012, this.anInt1016);
		}
		OpenGL.glLinkProgram(this.anInt1012);
		OpenGL.glGetProgramiv(this.anInt1012, 35714, anIntArray118, 0);
		if (anIntArray118[0] == 0) {
			if (this.anInt1014 != 0) {
				OpenGL.glDetachShader(this.anInt1012, this.anInt1014);
				OpenGL.glDeleteShader(this.anInt1014);
			}
			if (this.anInt1016 != 0) {
				OpenGL.glDetachShader(this.anInt1012, this.anInt1016);
				OpenGL.glDeleteShader(this.anInt1016);
			}
			OpenGL.glDeleteProgram(this.anInt1012);
			return false;
		}
		OpenGL.glUseProgram(this.anInt1012);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass112_Sub2_1.method9460(); local112++) {
			if (this.aClass112_Sub2_1.method9461(local112) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class77_Sub12_Sub1 local149;
		for (local112 = 0; local112 < this.aClass112_Sub2_1.method9534(); local112++) {
			local149 = this.aClass112_Sub2_1.method9536(local112);
			if (local149 != null) {
				local149.method23564(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass112_Sub2_1.method9526(); local112++) {
			local149 = this.aClass112_Sub2_1.method9528(local112);
			if (local149 != null) {
				local149.method23564(local110);
			}
		}
		this.aString34 = null;
		this.aString35 = null;
		this.aBoolean188 = true;
		return true;
	}

	@OriginalMember(owner = "client!agj", name = "l", descriptor = "(Lclient!aqz;F)V", line = 147)
	@Override
	void method9583(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && (Float) this.aMap6.get(local3) == arg1) {
			return;
		}
		this.aMap6.put(local3, arg1);
		if (arg0.method23555() != Class295.aClass295_129 && arg0.method23555() != Class295.aClass295_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agj", name = "h", descriptor = "(Lclient!aqz;F)V", line = 147)
	@Override
	void method9584(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && (Float) this.aMap6.get(local3) == arg1) {
			return;
		}
		this.aMap6.put(local3, arg1);
		if (arg0.method23555() != Class295.aClass295_129 && arg0.method23555() != Class295.aClass295_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agj", name = "m", descriptor = "(Lclient!aqz;F)V", line = 147)
	@Override
	void method9634(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && (Float) this.aMap6.get(local3) == arg1) {
			return;
		}
		this.aMap6.put(local3, arg1);
		if (arg0.method23555() != Class295.aClass295_129 && arg0.method23555() != Class295.aClass295_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agj", name = "aj", descriptor = "(Lclient!aqz;F)V", line = 147)
	@Override
	void method9602(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && (Float) this.aMap6.get(local3) == arg1) {
			return;
		}
		this.aMap6.put(local3, arg1);
		if (arg0.method23555() != Class295.aClass295_129 && arg0.method23555() != Class295.aClass295_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agj", name = "ag", descriptor = "(Lclient!aqz;FF)V", line = 157)
	@Override
	void method9604(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap8.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap8.get(local3) == arg2) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap8.put(local3, arg2);
		if (arg0.method23555() != Class295.aClass295_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!agj", name = "y", descriptor = "(Lclient!aqz;FF)V", line = 157)
	@Override
	void method9625(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap8.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap8.get(local3) == arg2) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap8.put(local3, arg2);
		if (arg0.method23555() != Class295.aClass295_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!agj", name = "ai", descriptor = "(Lclient!aqz;FF)V", line = 157)
	@Override
	void method9603(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap8.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap8.get(local3) == arg2) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap8.put(local3, arg2);
		if (arg0.method23555() != Class295.aClass295_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!agj", name = "ab", descriptor = "(Lclient!aqz;FFF)V", line = 168)
	@Override
	void method9623(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap8.get(local3) != null && this.aMap9.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap8.get(local3) == arg2 && (Float) this.aMap9.get(local3) == arg3) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap8.put(local3, arg2);
		this.aMap9.put(local3, arg3);
		if (arg0.method23555() != Class295.aClass295_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(local3, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agj", name = "w", descriptor = "(Lclient!aqz;FFF)V", line = 168)
	@Override
	void method9585(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap8.get(local3) != null && this.aMap9.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap8.get(local3) == arg2 && (Float) this.aMap9.get(local3) == arg3) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap8.put(local3, arg2);
		this.aMap9.put(local3, arg3);
		if (arg0.method23555() != Class295.aClass295_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(local3, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agj", name = "aa", descriptor = "(Lclient!aqz;FFF)V", line = 168)
	@Override
	void method9624(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap8.get(local3) != null && this.aMap9.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap8.get(local3) == arg2 && (Float) this.aMap9.get(local3) == arg3) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap8.put(local3, arg2);
		this.aMap9.put(local3, arg3);
		if (arg0.method23555() != Class295.aClass295_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(local3, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agj", name = "t", descriptor = "(Lclient!aqz;FFFF)V", line = 180)
	@Override
	void method9586(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap8.get(local3) != null && this.aMap9.get(local3) != null && this.aMap7.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap8.get(local3) == arg2 && (Float) this.aMap9.get(local3) == arg3 && (Float) this.aMap7.get(local3) == arg4) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap8.put(local3, arg2);
		this.aMap9.put(local3, arg3);
		this.aMap7.put(local3, arg4);
		if (arg0.method23555() != Class295.aClass295_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agj", name = "al", descriptor = "(Lclient!aqz;FFFF)V", line = 180)
	@Override
	void method9605(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap8.get(local3) != null && this.aMap9.get(local3) != null && this.aMap7.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap8.get(local3) == arg2 && (Float) this.aMap9.get(local3) == arg3 && (Float) this.aMap7.get(local3) == arg4) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap8.put(local3, arg2);
		this.aMap9.put(local3, arg3);
		this.aMap7.put(local3, arg4);
		if (arg0.method23555() != Class295.aClass295_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agj", name = "q", descriptor = "(Lclient!aqz;[FI)V", line = 193)
	@Override
	void method9614(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "bv", descriptor = "(Lclient!aqz;[FI)V", line = 193)
	@Override
	void method9608(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "bc", descriptor = "(Lclient!aqz;[FI)V", line = 193)
	@Override
	void method9628(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "bj", descriptor = "(Lclient!aqz;[FI)V", line = 193)
	@Override
	void method9630(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "aw", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 199)
	@Override
	void method9626(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		assert arg0.method23555() == Class295.aClass295_48;
		@Pc(14) int local14 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local14 != -1) {
			OpenGL.glUniform2fv(local14, 4, arg1.method29049(aFloatArray42), 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "ap", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 199)
	@Override
	void method9627(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		assert arg0.method23555() == Class295.aClass295_48;
		@Pc(14) int local14 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local14 != -1) {
			OpenGL.glUniform2fv(local14, 4, arg1.method29049(aFloatArray42), 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "az", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 199)
	@Override
	void method9619(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		assert arg0.method23555() == Class295.aClass295_48;
		@Pc(14) int local14 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local14 != -1) {
			OpenGL.glUniform2fv(local14, 4, arg1.method29049(aFloatArray42), 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "x", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 199)
	@Override
	void method9588(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		assert arg0.method23555() == Class295.aClass295_48;
		@Pc(14) int local14 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local14 != -1) {
			OpenGL.glUniform2fv(local14, 4, arg1.method29049(aFloatArray42), 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "d", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 206)
	@Override
	void method9589(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		assert arg0.method23555() == Class295.aClass295_41;
		@Pc(14) int local14 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method29038(aFloatArray42), 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "ak", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 206)
	@Override
	void method9633(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		assert arg0.method23555() == Class295.aClass295_41;
		@Pc(14) int local14 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method29038(aFloatArray42), 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "ao", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 206)
	@Override
	void method9606(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		assert arg0.method23555() == Class295.aClass295_41;
		@Pc(14) int local14 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method29038(aFloatArray42), 0);
		}
	}

	@OriginalMember(owner = "client!agj", name = "bb", descriptor = "(Lclient!aqz;ILclient!ls;)V", line = 213)
	@Override
	void method9632(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass86_Sub1_Sub2_1.anInterface37_23;
		}
		if (arg1 < this.aClass86_Sub1_Sub2_1.anInt2848) {
			this.aClass86_Sub1_Sub2_1.method20540(arg1);
			this.aClass86_Sub1_Sub2_1.method20542(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class114) arg2).anInt1223, ((Class114) arg2).anInt1219);
		}
		if (this.aMap10.get(local3) == null || (Integer) this.aMap10.get(local3) != arg1) {
			this.aMap10.put(local3, arg1);
			OpenGL.glUniform1i(local3, arg1);
		}
	}

	@OriginalMember(owner = "client!agj", name = "ba", descriptor = "(Lclient!aqz;ILclient!ls;)V", line = 213)
	@Override
	void method9601(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass86_Sub1_Sub2_1.anInterface37_23;
		}
		if (arg1 < this.aClass86_Sub1_Sub2_1.anInt2848) {
			this.aClass86_Sub1_Sub2_1.method20540(arg1);
			this.aClass86_Sub1_Sub2_1.method20542(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class114) arg2).anInt1223, ((Class114) arg2).anInt1219);
		}
		if (this.aMap10.get(local3) == null || (Integer) this.aMap10.get(local3) != arg1) {
			this.aMap10.put(local3, arg1);
			OpenGL.glUniform1i(local3, arg1);
		}
	}

	@OriginalMember(owner = "client!agj", name = "bl", descriptor = "(Lclient!aqz;ILclient!ls;)V", line = 213)
	@Override
	void method9631(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass86_Sub1_Sub2_1.anInterface37_23;
		}
		if (arg1 < this.aClass86_Sub1_Sub2_1.anInt2848) {
			this.aClass86_Sub1_Sub2_1.method20540(arg1);
			this.aClass86_Sub1_Sub2_1.method20542(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class114) arg2).anInt1223, ((Class114) arg2).anInt1219);
		}
		if (this.aMap10.get(local3) == null || (Integer) this.aMap10.get(local3) != arg1) {
			this.aMap10.put(local3, arg1);
			OpenGL.glUniform1i(local3, arg1);
		}
	}

	@OriginalMember(owner = "client!agj", name = "z", descriptor = "(Lclient!aqz;ILclient!ls;)V", line = 213)
	@Override
	void method9590(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub1) arg0).method23319();
		if (local3 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass86_Sub1_Sub2_1.anInterface37_23;
		}
		if (arg1 < this.aClass86_Sub1_Sub2_1.anInt2848) {
			this.aClass86_Sub1_Sub2_1.method20540(arg1);
			this.aClass86_Sub1_Sub2_1.method20542(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class114) arg2).anInt1223, ((Class114) arg2).anInt1219);
		}
		if (this.aMap10.get(local3) == null || (Integer) this.aMap10.get(local3) != arg1) {
			this.aMap10.put(local3, arg1);
			OpenGL.glUniform1i(local3, arg1);
		}
	}

	@OriginalMember(owner = "client!agj", name = "bx", descriptor = "(IFFF)V", line = 233)
	@Override
	void method9635(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agj", name = "j", descriptor = "(IFFF)V", line = 233)
	@Override
	void method9591(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agj", name = "bd", descriptor = "(IFFF)V", line = 233)
	@Override
	void method9622(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agj", name = "by", descriptor = "(IFFF)V", line = 233)
	@Override
	void method9582(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agj", name = "bw", descriptor = "(IFFF)V", line = 233)
	@Override
	void method9636(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agj", name = "i", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method9592(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agj", name = "ax", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method9609(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agj", name = "ar", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method9610(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agj", name = "au", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method9581(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agj", name = "ad", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method9611(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agj", name = "k", descriptor = "(I[FI)V", line = 241)
	@Override
	void method9607(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!agj", name = "ac", descriptor = "(I[FI)V", line = 241)
	@Override
	void method9612(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!agj", name = "av", descriptor = "(I[FI)V", line = 241)
	@Override
	void method9613(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!agj", name = "at", descriptor = "(I[FI)V", line = 241)
	@Override
	void method9629(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!agj", name = "ae", descriptor = "(ILclient!oi;)V", line = 245)
	@Override
	void method9615(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method29043(aFloatArray42), 0);
	}

	@OriginalMember(owner = "client!agj", name = "u", descriptor = "(ILclient!oi;)V", line = 245)
	@Override
	void method9593(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method29043(aFloatArray42), 0);
	}

	@OriginalMember(owner = "client!agj", name = "ah", descriptor = "(ILclient!oi;)V", line = 245)
	@Override
	void method9600(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method29043(aFloatArray42), 0);
	}

	@OriginalMember(owner = "client!agj", name = "as", descriptor = "(ILclient!oi;)V", line = 245)
	@Override
	void method9617(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method29043(aFloatArray42), 0);
	}

	@OriginalMember(owner = "client!agj", name = "aq", descriptor = "(ILclient!oi;)V", line = 245)
	@Override
	void method9618(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method29043(aFloatArray42), 0);
	}

	@OriginalMember(owner = "client!agj", name = "e", descriptor = "(ILclient!oi;)V", line = 249)
	@Override
	void method9594(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method29049(aFloatArray42), 0);
	}

	@OriginalMember(owner = "client!agj", name = "am", descriptor = "(ILclient!oi;)V", line = 249)
	@Override
	void method9616(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method29049(aFloatArray42), 0);
	}

	@OriginalMember(owner = "client!agj", name = "f", descriptor = "(ILclient!oi;)V", line = 253)
	@Override
	void method9597(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method29038(aFloatArray42), 0);
	}

	@OriginalMember(owner = "client!agj", name = "ay", descriptor = "(ILclient!oi;)V", line = 253)
	@Override
	void method9620(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method29038(aFloatArray42), 0);
	}

	@OriginalMember(owner = "client!agj", name = "o", descriptor = "(IILclient!ls;)V", line = 257)
	@Override
	void method9596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass86_Sub1_Sub2_1.method20540(arg1);
		this.aClass86_Sub1_Sub2_1.method20542(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!agj", name = "af", descriptor = "(IILclient!ls;)V", line = 257)
	@Override
	void method9621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass86_Sub1_Sub2_1.method20540(arg1);
		this.aClass86_Sub1_Sub2_1.method20542(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!agj", name = "an", descriptor = "(IILclient!ls;)V", line = 257)
	@Override
	void method9587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass86_Sub1_Sub2_1.method20540(arg1);
		this.aClass86_Sub1_Sub2_1.method20542(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!agj", name = "s", descriptor = "()V", line = 263)
	@Override
	public void method30320() {
		if (this.anInt1012 == 0) {
			return;
		}
		this.aClass86_Sub1_Sub2_1.method20804(this.anInt1012);
		if (this.anInt1014 != 0) {
			this.aClass86_Sub1_Sub2_1.method20802((long) this.anInt1014);
		}
		if (this.anInt1016 != 0) {
			this.aClass86_Sub1_Sub2_1.method20802((long) this.anInt1016);
		}
		this.anInt1012 = 0;
		this.anInt1014 = 0;
		this.anInt1016 = 0;
	}

	@OriginalMember(owner = "client!agj", name = "v", descriptor = "()V", line = 263)
	@Override
	public void method30322() {
		if (this.anInt1012 == 0) {
			return;
		}
		this.aClass86_Sub1_Sub2_1.method20804(this.anInt1012);
		if (this.anInt1014 != 0) {
			this.aClass86_Sub1_Sub2_1.method20802((long) this.anInt1014);
		}
		if (this.anInt1016 != 0) {
			this.aClass86_Sub1_Sub2_1.method20802((long) this.anInt1016);
		}
		this.anInt1012 = 0;
		this.anInt1014 = 0;
		this.anInt1016 = 0;
	}

	@OriginalMember(owner = "client!agj", name = "r", descriptor = "()V", line = 263)
	@Override
	public void method30321() {
		if (this.anInt1012 == 0) {
			return;
		}
		this.aClass86_Sub1_Sub2_1.method20804(this.anInt1012);
		if (this.anInt1014 != 0) {
			this.aClass86_Sub1_Sub2_1.method20802((long) this.anInt1014);
		}
		if (this.anInt1016 != 0) {
			this.aClass86_Sub1_Sub2_1.method20802((long) this.anInt1016);
		}
		this.anInt1012 = 0;
		this.anInt1014 = 0;
		this.anInt1016 = 0;
	}

	@OriginalMember(owner = "client!agj", name = "g", descriptor = "()V", line = 263)
	@Override
	public void method30319() {
		if (this.anInt1012 == 0) {
			return;
		}
		this.aClass86_Sub1_Sub2_1.method20804(this.anInt1012);
		if (this.anInt1014 != 0) {
			this.aClass86_Sub1_Sub2_1.method20802((long) this.anInt1014);
		}
		if (this.anInt1016 != 0) {
			this.aClass86_Sub1_Sub2_1.method20802((long) this.anInt1016);
		}
		this.anInt1012 = 0;
		this.anInt1014 = 0;
		this.anInt1016 = 0;
	}

	@OriginalMember(owner = "client!agj", name = "hc", descriptor = "()V", line = 274)
	void method8543() {
		this.method30322();
	}

	@OriginalMember(owner = "client!agj", name = "finalize", descriptor = "()V", line = 274)
	@Override
	void finalize() {
		this.method30322();
	}

	@OriginalMember(owner = "client!agj", name = "hd", descriptor = "()V", line = 274)
	void method8544() {
		this.method30322();
	}

	@OriginalMember(owner = "client!agj", name = "hp", descriptor = "()V", line = 274)
	void method8545() {
		this.method30322();
	}
}
