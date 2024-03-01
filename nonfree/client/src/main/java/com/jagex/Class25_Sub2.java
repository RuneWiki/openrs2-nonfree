package com.jagex;

import jaggl.OpenGL;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acj")
public class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!acj", name = "h", descriptor = "I")
	static final int anInt624 = 35632;

	@OriginalMember(owner = "client!acj", name = "x", descriptor = "I")
	static final int anInt625 = 13;

	@OriginalMember(owner = "client!acj", name = "l", descriptor = "I")
	static final int anInt628 = 35633;

	@OriginalMember(owner = "client!acj", name = "n", descriptor = "[I")
	static final int[] anIntArray79 = new int[2];

	@OriginalMember(owner = "client!acj", name = "e", descriptor = "[F")
	static final float[] aFloatArray43 = new float[16];

	@OriginalMember(owner = "client!acj", name = "u", descriptor = "Lclient!acp;")
	Class24_Sub2 aClass24_Sub2_1;

	@OriginalMember(owner = "client!acj", name = "s", descriptor = "Lclient!akk;")
	Class21_Sub3_Sub1 aClass21_Sub3_Sub1_1;

	@OriginalMember(owner = "client!acj", name = "y", descriptor = "I")
	int anInt629;

	@OriginalMember(owner = "client!acj", name = "b", descriptor = "I")
	int anInt626;

	@OriginalMember(owner = "client!acj", name = "c", descriptor = "I")
	int anInt627;

	@OriginalMember(owner = "client!acj", name = "z", descriptor = "Z")
	boolean aBoolean145;

	@OriginalMember(owner = "client!acj", name = "j", descriptor = "[I")
	int[] anIntArray80;

	@OriginalMember(owner = "client!acj", name = "r", descriptor = "Ljava/util/Map;")
	final Map aMap3;

	@OriginalMember(owner = "client!acj", name = "d", descriptor = "Ljava/util/Map;")
	final Map aMap4;

	@OriginalMember(owner = "client!acj", name = "q", descriptor = "Ljava/util/Map;")
	final Map aMap1;

	@OriginalMember(owner = "client!acj", name = "m", descriptor = "Ljava/util/Map;")
	final Map aMap2;

	@OriginalMember(owner = "client!acj", name = "v", descriptor = "Ljava/util/Map;")
	final Map aMap5;

	@OriginalMember(owner = "client!acj", name = "t", descriptor = "Ljava/lang/String;")
	String aString36;

	@OriginalMember(owner = "client!acj", name = "w", descriptor = "Ljava/lang/String;")
	String aString35;

	@OriginalMember(owner = "client!acj", name = "<init>", descriptor = "(Lclient!akk;Lclient!acp;Lclient!ff;)V", line = 35)
	Class25_Sub2(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Class24_Sub2 arg1, @OriginalArg(2) Class170 arg2) {
		this(arg0, arg2);
		this.aClass24_Sub2_1 = arg1;
		this.aClass21_Sub3_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!acj", name = "<init>", descriptor = "(Lclient!akk;Lclient!ff;)V", line = 40)
	Class25_Sub2(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Class170 arg1) {
		this.anInt629 = 0;
		this.anInt626 = 0;
		this.anInt627 = 0;
		this.aBoolean145 = false;
		this.anIntArray80 = new int[13];
		this.aMap3 = new HashMap();
		this.aMap4 = new HashMap();
		this.aMap1 = new HashMap();
		this.aMap2 = new HashMap();
		this.aMap5 = new HashMap();
		this.aString34 = arg1.aString165;
		@Pc(50) StringBuilder local50 = new StringBuilder();
		@Pc(63) Class180[] local63;
		@Pc(65) int local65;
		@Pc(73) Class180 local73;
		if (arg1.aString163 != null) {
			this.aString33 = arg1.aString163;
			if (arg1.aClass180Array1 != null) {
				local63 = arg1.aClass180Array1;
				for (local65 = 0; local65 < local63.length; local65++) {
					local73 = local63[local65];
					local50.append("#define " + local73.aString173 + " " + local73.aString174 + '\n');
				}
			}
			local50.append(new String(arg0.method16342(this.aString33)));
			this.aString36 = local50.toString();
		}
		if (arg1.aString164 != null) {
			this.aString32 = arg1.aString164;
			local50.setLength(0);
			if (arg1.aClass180Array2 != null) {
				local63 = arg1.aClass180Array2;
				for (local65 = 0; local65 < local63.length; local65++) {
					local73 = local63[local65];
					local50.append("#define " + local73.aString173 + " " + local73.aString174 + '\n');
				}
			}
			local50.append(new String(arg0.method16342(this.aString32)));
			this.aString35 = local50.toString();
		}
		Class567.method32932(this.anIntArray80, 0, this.anIntArray80.length, -1);
	}

	@OriginalMember(owner = "client!acj", name = "br", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I", line = 80)
	int method6480(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray79, 0);
		if (anIntArray79[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!acj", name = "a", descriptor = "()Z", line = 95)
	@Override
	public boolean method6418() {
		if (this.aBoolean145) {
			return true;
		}
		this.aClass21_Sub3_Sub1_1.aClass25_Sub2_2 = null;
		this.anInt626 = this.method6480(35633, this.aString36, this.aString33);
		this.anInt627 = this.method6480(35632, this.aString35, this.aString32);
		if (this.anInt626 == 0 || this.anInt627 == 0) {
			if (this.anInt626 != 0) {
				OpenGL.glDeleteShader(this.anInt626);
			}
			if (this.anInt627 != 0) {
				OpenGL.glDeleteShader(this.anInt627);
			}
			return false;
		}
		this.anInt629 = OpenGL.glCreateProgram();
		if (this.anInt626 != 0) {
			OpenGL.glAttachShader(this.anInt629, this.anInt626);
		}
		if (this.anInt627 != 0) {
			OpenGL.glAttachShader(this.anInt629, this.anInt627);
		}
		OpenGL.glLinkProgram(this.anInt629);
		OpenGL.glGetProgramiv(this.anInt629, 35714, anIntArray79, 0);
		if (anIntArray79[0] == 0) {
			if (this.anInt626 != 0) {
				OpenGL.glDetachShader(this.anInt629, this.anInt626);
				OpenGL.glDeleteShader(this.anInt626);
			}
			if (this.anInt627 != 0) {
				OpenGL.glDetachShader(this.anInt629, this.anInt627);
				OpenGL.glDeleteShader(this.anInt627);
			}
			OpenGL.glDeleteProgram(this.anInt629);
			return false;
		}
		OpenGL.glUseProgram(this.anInt629);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6556(); local112++) {
			if (this.aClass24_Sub2_1.method6549(local112) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class3_Sub19_Sub1 local149;
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6587(); local112++) {
			local149 = this.aClass24_Sub2_1.method6571(local112);
			if (local149 != null) {
				local149.method20811(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6625(); local112++) {
			local149 = this.aClass24_Sub2_1.method6663(local112);
			if (local149 != null) {
				local149.method20811(local110);
			}
		}
		this.aString36 = null;
		this.aString35 = null;
		this.aBoolean145 = true;
		return true;
	}

	@OriginalMember(owner = "client!acj", name = "f", descriptor = "()Z", line = 95)
	@Override
	public boolean method6438() {
		if (this.aBoolean145) {
			return true;
		}
		this.aClass21_Sub3_Sub1_1.aClass25_Sub2_2 = null;
		this.anInt626 = this.method6480(35633, this.aString36, this.aString33);
		this.anInt627 = this.method6480(35632, this.aString35, this.aString32);
		if (this.anInt626 == 0 || this.anInt627 == 0) {
			if (this.anInt626 != 0) {
				OpenGL.glDeleteShader(this.anInt626);
			}
			if (this.anInt627 != 0) {
				OpenGL.glDeleteShader(this.anInt627);
			}
			return false;
		}
		this.anInt629 = OpenGL.glCreateProgram();
		if (this.anInt626 != 0) {
			OpenGL.glAttachShader(this.anInt629, this.anInt626);
		}
		if (this.anInt627 != 0) {
			OpenGL.glAttachShader(this.anInt629, this.anInt627);
		}
		OpenGL.glLinkProgram(this.anInt629);
		OpenGL.glGetProgramiv(this.anInt629, 35714, anIntArray79, 0);
		if (anIntArray79[0] == 0) {
			if (this.anInt626 != 0) {
				OpenGL.glDetachShader(this.anInt629, this.anInt626);
				OpenGL.glDeleteShader(this.anInt626);
			}
			if (this.anInt627 != 0) {
				OpenGL.glDetachShader(this.anInt629, this.anInt627);
				OpenGL.glDeleteShader(this.anInt627);
			}
			OpenGL.glDeleteProgram(this.anInt629);
			return false;
		}
		OpenGL.glUseProgram(this.anInt629);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6556(); local112++) {
			if (this.aClass24_Sub2_1.method6549(local112) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class3_Sub19_Sub1 local149;
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6587(); local112++) {
			local149 = this.aClass24_Sub2_1.method6571(local112);
			if (local149 != null) {
				local149.method20811(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6625(); local112++) {
			local149 = this.aClass24_Sub2_1.method6663(local112);
			if (local149 != null) {
				local149.method20811(local110);
			}
		}
		this.aString36 = null;
		this.aString35 = null;
		this.aBoolean145 = true;
		return true;
	}

	@OriginalMember(owner = "client!acj", name = "i", descriptor = "()Z", line = 95)
	@Override
	public boolean method6437() {
		if (this.aBoolean145) {
			return true;
		}
		this.aClass21_Sub3_Sub1_1.aClass25_Sub2_2 = null;
		this.anInt626 = this.method6480(35633, this.aString36, this.aString33);
		this.anInt627 = this.method6480(35632, this.aString35, this.aString32);
		if (this.anInt626 == 0 || this.anInt627 == 0) {
			if (this.anInt626 != 0) {
				OpenGL.glDeleteShader(this.anInt626);
			}
			if (this.anInt627 != 0) {
				OpenGL.glDeleteShader(this.anInt627);
			}
			return false;
		}
		this.anInt629 = OpenGL.glCreateProgram();
		if (this.anInt626 != 0) {
			OpenGL.glAttachShader(this.anInt629, this.anInt626);
		}
		if (this.anInt627 != 0) {
			OpenGL.glAttachShader(this.anInt629, this.anInt627);
		}
		OpenGL.glLinkProgram(this.anInt629);
		OpenGL.glGetProgramiv(this.anInt629, 35714, anIntArray79, 0);
		if (anIntArray79[0] == 0) {
			if (this.anInt626 != 0) {
				OpenGL.glDetachShader(this.anInt629, this.anInt626);
				OpenGL.glDeleteShader(this.anInt626);
			}
			if (this.anInt627 != 0) {
				OpenGL.glDetachShader(this.anInt629, this.anInt627);
				OpenGL.glDeleteShader(this.anInt627);
			}
			OpenGL.glDeleteProgram(this.anInt629);
			return false;
		}
		OpenGL.glUseProgram(this.anInt629);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6556(); local112++) {
			if (this.aClass24_Sub2_1.method6549(local112) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class3_Sub19_Sub1 local149;
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6587(); local112++) {
			local149 = this.aClass24_Sub2_1.method6571(local112);
			if (local149 != null) {
				local149.method20811(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6625(); local112++) {
			local149 = this.aClass24_Sub2_1.method6663(local112);
			if (local149 != null) {
				local149.method20811(local110);
			}
		}
		this.aString36 = null;
		this.aString35 = null;
		this.aBoolean145 = true;
		return true;
	}

	@OriginalMember(owner = "client!acj", name = "o", descriptor = "()Z", line = 95)
	@Override
	public boolean method6436() {
		if (this.aBoolean145) {
			return true;
		}
		this.aClass21_Sub3_Sub1_1.aClass25_Sub2_2 = null;
		this.anInt626 = this.method6480(35633, this.aString36, this.aString33);
		this.anInt627 = this.method6480(35632, this.aString35, this.aString32);
		if (this.anInt626 == 0 || this.anInt627 == 0) {
			if (this.anInt626 != 0) {
				OpenGL.glDeleteShader(this.anInt626);
			}
			if (this.anInt627 != 0) {
				OpenGL.glDeleteShader(this.anInt627);
			}
			return false;
		}
		this.anInt629 = OpenGL.glCreateProgram();
		if (this.anInt626 != 0) {
			OpenGL.glAttachShader(this.anInt629, this.anInt626);
		}
		if (this.anInt627 != 0) {
			OpenGL.glAttachShader(this.anInt629, this.anInt627);
		}
		OpenGL.glLinkProgram(this.anInt629);
		OpenGL.glGetProgramiv(this.anInt629, 35714, anIntArray79, 0);
		if (anIntArray79[0] == 0) {
			if (this.anInt626 != 0) {
				OpenGL.glDetachShader(this.anInt629, this.anInt626);
				OpenGL.glDeleteShader(this.anInt626);
			}
			if (this.anInt627 != 0) {
				OpenGL.glDetachShader(this.anInt629, this.anInt627);
				OpenGL.glDeleteShader(this.anInt627);
			}
			OpenGL.glDeleteProgram(this.anInt629);
			return false;
		}
		OpenGL.glUseProgram(this.anInt629);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6556(); local112++) {
			if (this.aClass24_Sub2_1.method6549(local112) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class3_Sub19_Sub1 local149;
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6587(); local112++) {
			local149 = this.aClass24_Sub2_1.method6571(local112);
			if (local149 != null) {
				local149.method20811(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6625(); local112++) {
			local149 = this.aClass24_Sub2_1.method6663(local112);
			if (local149 != null) {
				local149.method20811(local110);
			}
		}
		this.aString36 = null;
		this.aString35 = null;
		this.aBoolean145 = true;
		return true;
	}

	@OriginalMember(owner = "client!acj", name = "w", descriptor = "()Z", line = 95)
	@Override
	public boolean method6452() {
		if (this.aBoolean145) {
			return true;
		}
		this.aClass21_Sub3_Sub1_1.aClass25_Sub2_2 = null;
		this.anInt626 = this.method6480(35633, this.aString36, this.aString33);
		this.anInt627 = this.method6480(35632, this.aString35, this.aString32);
		if (this.anInt626 == 0 || this.anInt627 == 0) {
			if (this.anInt626 != 0) {
				OpenGL.glDeleteShader(this.anInt626);
			}
			if (this.anInt627 != 0) {
				OpenGL.glDeleteShader(this.anInt627);
			}
			return false;
		}
		this.anInt629 = OpenGL.glCreateProgram();
		if (this.anInt626 != 0) {
			OpenGL.glAttachShader(this.anInt629, this.anInt626);
		}
		if (this.anInt627 != 0) {
			OpenGL.glAttachShader(this.anInt629, this.anInt627);
		}
		OpenGL.glLinkProgram(this.anInt629);
		OpenGL.glGetProgramiv(this.anInt629, 35714, anIntArray79, 0);
		if (anIntArray79[0] == 0) {
			if (this.anInt626 != 0) {
				OpenGL.glDetachShader(this.anInt629, this.anInt626);
				OpenGL.glDeleteShader(this.anInt626);
			}
			if (this.anInt627 != 0) {
				OpenGL.glDetachShader(this.anInt629, this.anInt627);
				OpenGL.glDeleteShader(this.anInt627);
			}
			OpenGL.glDeleteProgram(this.anInt629);
			return false;
		}
		OpenGL.glUseProgram(this.anInt629);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6556(); local112++) {
			if (this.aClass24_Sub2_1.method6549(local112) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class3_Sub19_Sub1 local149;
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6587(); local112++) {
			local149 = this.aClass24_Sub2_1.method6571(local112);
			if (local149 != null) {
				local149.method20811(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass24_Sub2_1.method6625(); local112++) {
			local149 = this.aClass24_Sub2_1.method6663(local112);
			if (local149 != null) {
				local149.method20811(local110);
			}
		}
		this.aString36 = null;
		this.aString35 = null;
		this.aBoolean145 = true;
		return true;
	}

	@OriginalMember(owner = "client!acj", name = "l", descriptor = "(Lclient!alr;F)V", line = 147)
	@Override
	void method6419(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && (Float) this.aMap3.get(local3) == arg1) {
			return;
		}
		this.aMap3.put(local3, arg1);
		if (arg0.method20826() != Class166.aClass166_30 && arg0.method20826() != Class166.aClass166_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!acj", name = "at", descriptor = "(Lclient!alr;F)V", line = 147)
	@Override
	void method6460(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && (Float) this.aMap3.get(local3) == arg1) {
			return;
		}
		this.aMap3.put(local3, arg1);
		if (arg0.method20826() != Class166.aClass166_30 && arg0.method20826() != Class166.aClass166_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!acj", name = "k", descriptor = "(Lclient!alr;F)V", line = 147)
	@Override
	void method6439(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && (Float) this.aMap3.get(local3) == arg1) {
			return;
		}
		this.aMap3.put(local3, arg1);
		if (arg0.method20826() != Class166.aClass166_30 && arg0.method20826() != Class166.aClass166_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!acj", name = "af", descriptor = "(Lclient!alr;F)V", line = 147)
	@Override
	void method6441(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && (Float) this.aMap3.get(local3) == arg1) {
			return;
		}
		this.aMap3.put(local3, arg1);
		if (arg0.method20826() != Class166.aClass166_30 && arg0.method20826() != Class166.aClass166_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!acj", name = "aa", descriptor = "(Lclient!alr;FF)V", line = 157)
	@Override
	void method6443(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		if (arg0.method20826() != Class166.aClass166_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!acj", name = "ak", descriptor = "(Lclient!alr;FF)V", line = 157)
	@Override
	void method6472(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		if (arg0.method20826() != Class166.aClass166_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!acj", name = "h", descriptor = "(Lclient!alr;FF)V", line = 157)
	@Override
	void method6420(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		if (arg0.method20826() != Class166.aClass166_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!acj", name = "x", descriptor = "(Lclient!alr;FFF)V", line = 168)
	@Override
	void method6421(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && this.aMap1.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2 && (Float) this.aMap1.get(local3) == arg3) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		this.aMap1.put(local3, arg3);
		if (arg0.method20826() != Class166.aClass166_28) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(local3, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!acj", name = "ah", descriptor = "(Lclient!alr;FFF)V", line = 168)
	@Override
	void method6446(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && this.aMap1.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2 && (Float) this.aMap1.get(local3) == arg3) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		this.aMap1.put(local3, arg3);
		if (arg0.method20826() != Class166.aClass166_28) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(local3, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!acj", name = "s", descriptor = "(Lclient!alr;FFFF)V", line = 180)
	@Override
	void method6422(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && this.aMap1.get(local3) != null && this.aMap2.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2 && (Float) this.aMap1.get(local3) == arg3 && (Float) this.aMap2.get(local3) == arg4) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		this.aMap1.put(local3, arg3);
		this.aMap2.put(local3, arg4);
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "ae", descriptor = "(Lclient!alr;FFFF)V", line = 180)
	@Override
	void method6462(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && this.aMap1.get(local3) != null && this.aMap2.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2 && (Float) this.aMap1.get(local3) == arg3 && (Float) this.aMap2.get(local3) == arg4) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		this.aMap1.put(local3, arg3);
		this.aMap2.put(local3, arg4);
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "bp", descriptor = "(Lclient!alr;FFFF)V", line = 180)
	@Override
	void method6423(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && this.aMap1.get(local3) != null && this.aMap2.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2 && (Float) this.aMap1.get(local3) == arg3 && (Float) this.aMap2.get(local3) == arg4) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		this.aMap1.put(local3, arg3);
		this.aMap2.put(local3, arg4);
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "aw", descriptor = "(Lclient!alr;FFFF)V", line = 180)
	@Override
	void method6464(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && this.aMap1.get(local3) != null && this.aMap2.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2 && (Float) this.aMap1.get(local3) == arg3 && (Float) this.aMap2.get(local3) == arg4) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		this.aMap1.put(local3, arg3);
		this.aMap2.put(local3, arg4);
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "ac", descriptor = "(Lclient!alr;FFFF)V", line = 180)
	@Override
	void method6416(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && this.aMap1.get(local3) != null && this.aMap2.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2 && (Float) this.aMap1.get(local3) == arg3 && (Float) this.aMap2.get(local3) == arg4) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		this.aMap1.put(local3, arg3);
		this.aMap2.put(local3, arg4);
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "bw", descriptor = "(Lclient!alr;FFFF)V", line = 180)
	@Override
	void method6466(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && this.aMap1.get(local3) != null && this.aMap2.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2 && (Float) this.aMap1.get(local3) == arg3 && (Float) this.aMap2.get(local3) == arg4) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		this.aMap1.put(local3, arg3);
		this.aMap2.put(local3, arg4);
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "ad", descriptor = "(Lclient!alr;FFFF)V", line = 180)
	@Override
	void method6463(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1 || this.aMap3.get(local3) != null && this.aMap4.get(local3) != null && this.aMap1.get(local3) != null && this.aMap2.get(local3) != null && (Float) this.aMap3.get(local3) == arg1 && (Float) this.aMap4.get(local3) == arg2 && (Float) this.aMap1.get(local3) == arg3 && (Float) this.aMap2.get(local3) == arg4) {
			return;
		}
		this.aMap3.put(local3, arg1);
		this.aMap4.put(local3, arg2);
		this.aMap1.put(local3, arg3);
		this.aMap2.put(local3, arg4);
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "u", descriptor = "(Lclient!alr;[FI)V", line = 193)
	@Override
	void method6450(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!acj", name = "an", descriptor = "(Lclient!alr;[FI)V", line = 193)
	@Override
	void method6470(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!acj", name = "c", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 199)
	@Override
	void method6465(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		assert arg0.method20826() == Class166.aClass166_48;
		@Pc(14) int local14 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local14 != -1) {
			OpenGL.glUniform2fv(local14, 4, arg1.method26073(aFloatArray43), 0);
		}
	}

	@OriginalMember(owner = "client!acj", name = "aj", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 199)
	@Override
	void method6440(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		assert arg0.method20826() == Class166.aClass166_48;
		@Pc(14) int local14 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local14 != -1) {
			OpenGL.glUniform2fv(local14, 4, arg1.method26073(aFloatArray43), 0);
		}
	}

	@OriginalMember(owner = "client!acj", name = "as", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 206)
	@Override
	void method6447(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		assert arg0.method20826() == Class166.aClass166_96;
		@Pc(14) int local14 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method26151(aFloatArray43), 0);
		}
	}

	@OriginalMember(owner = "client!acj", name = "ai", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 206)
	@Override
	void method6448(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		assert arg0.method20826() == Class166.aClass166_96;
		@Pc(14) int local14 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method26151(aFloatArray43), 0);
		}
	}

	@OriginalMember(owner = "client!acj", name = "z", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 206)
	@Override
	void method6429(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		assert arg0.method20826() == Class166.aClass166_96;
		@Pc(14) int local14 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method26151(aFloatArray43), 0);
		}
	}

	@OriginalMember(owner = "client!acj", name = "j", descriptor = "(Lclient!alr;ILclient!jl;)V", line = 213)
	@Override
	void method6426(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass21_Sub3_Sub1_1.anInterface20_23;
		}
		if (arg1 < this.aClass21_Sub3_Sub1_1.anInt2525) {
			this.aClass21_Sub3_Sub1_1.method17512(arg1);
			this.aClass21_Sub3_Sub1_1.method17513(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class41) arg2).anInt1118, ((Class41) arg2).anInt1121);
		}
		if (this.aMap5.get(local3) == null || (Integer) this.aMap5.get(local3) != arg1) {
			this.aMap5.put(local3, arg1);
			OpenGL.glUniform1i(local3, arg1);
		}
	}

	@OriginalMember(owner = "client!acj", name = "aq", descriptor = "(Lclient!alr;ILclient!jl;)V", line = 213)
	@Override
	void method6435(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub2) arg0).method20828();
		if (local3 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass21_Sub3_Sub1_1.anInterface20_23;
		}
		if (arg1 < this.aClass21_Sub3_Sub1_1.anInt2525) {
			this.aClass21_Sub3_Sub1_1.method17512(arg1);
			this.aClass21_Sub3_Sub1_1.method17513(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class41) arg2).anInt1118, ((Class41) arg2).anInt1121);
		}
		if (this.aMap5.get(local3) == null || (Integer) this.aMap5.get(local3) != arg1) {
			this.aMap5.put(local3, arg1);
			OpenGL.glUniform1i(local3, arg1);
		}
	}

	@OriginalMember(owner = "client!acj", name = "n", descriptor = "(IFFF)V", line = 233)
	@Override
	void method6427(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!acj", name = "av", descriptor = "(IFFF)V", line = 233)
	@Override
	void method6442(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!acj", name = "ax", descriptor = "(IFFF)V", line = 233)
	@Override
	void method6425(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!acj", name = "e", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method6428(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "bf", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method6444(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "bd", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method6468(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "bs", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method6469(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "bm", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method6451(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "bt", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method6456(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!acj", name = "r", descriptor = "(I[FI)V", line = 241)
	@Override
	void method6461(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!acj", name = "bg", descriptor = "(I[FI)V", line = 241)
	@Override
	void method6473(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!acj", name = "bk", descriptor = "(I[FI)V", line = 241)
	@Override
	void method6424(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!acj", name = "d", descriptor = "(ILclient!mq;)V", line = 245)
	@Override
	void method6430(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method26130(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "ao", descriptor = "(ILclient!mq;)V", line = 245)
	@Override
	void method6454(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method26130(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "al", descriptor = "(ILclient!mq;)V", line = 245)
	@Override
	void method6453(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method26130(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "az", descriptor = "(ILclient!mq;)V", line = 245)
	@Override
	void method6471(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method26130(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "ab", descriptor = "(ILclient!mq;)V", line = 245)
	@Override
	void method6432(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method26130(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "ap", descriptor = "(ILclient!mq;)V", line = 245)
	@Override
	void method6455(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method26130(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "q", descriptor = "(ILclient!mq;)V", line = 249)
	@Override
	void method6431(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method26073(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "au", descriptor = "(ILclient!mq;)V", line = 249)
	@Override
	void method6445(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method26073(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "ay", descriptor = "(ILclient!mq;)V", line = 249)
	@Override
	void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method26073(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "ag", descriptor = "(ILclient!mq;)V", line = 253)
	@Override
	void method6459(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method26151(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "am", descriptor = "(ILclient!mq;)V", line = 253)
	@Override
	void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method26151(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "m", descriptor = "(ILclient!mq;)V", line = 253)
	@Override
	void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method26151(aFloatArray43), 0);
	}

	@OriginalMember(owner = "client!acj", name = "v", descriptor = "(IILclient!jl;)V", line = 257)
	@Override
	void method6433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass21_Sub3_Sub1_1.method17512(arg1);
		this.aClass21_Sub3_Sub1_1.method17513(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!acj", name = "ar", descriptor = "(IILclient!jl;)V", line = 257)
	@Override
	void method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass21_Sub3_Sub1_1.method17512(arg1);
		this.aClass21_Sub3_Sub1_1.method17513(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!acj", name = "g", descriptor = "()V", line = 263)
	@Override
	public void method27209() {
		if (this.anInt629 == 0) {
			return;
		}
		this.aClass21_Sub3_Sub1_1.method16345(this.anInt629);
		if (this.anInt626 != 0) {
			this.aClass21_Sub3_Sub1_1.method16344((long) this.anInt626);
		}
		if (this.anInt627 != 0) {
			this.aClass21_Sub3_Sub1_1.method16344((long) this.anInt627);
		}
		this.anInt629 = 0;
		this.anInt626 = 0;
		this.anInt627 = 0;
	}

	@OriginalMember(owner = "client!acj", name = "y", descriptor = "()V", line = 263)
	@Override
	public void method27208() {
		if (this.anInt629 == 0) {
			return;
		}
		this.aClass21_Sub3_Sub1_1.method16345(this.anInt629);
		if (this.anInt626 != 0) {
			this.aClass21_Sub3_Sub1_1.method16344((long) this.anInt626);
		}
		if (this.anInt627 != 0) {
			this.aClass21_Sub3_Sub1_1.method16344((long) this.anInt627);
		}
		this.anInt629 = 0;
		this.anInt626 = 0;
		this.anInt627 = 0;
	}

	@OriginalMember(owner = "client!acj", name = "b", descriptor = "()V", line = 263)
	@Override
	public void method27210() {
		if (this.anInt629 == 0) {
			return;
		}
		this.aClass21_Sub3_Sub1_1.method16345(this.anInt629);
		if (this.anInt626 != 0) {
			this.aClass21_Sub3_Sub1_1.method16344((long) this.anInt626);
		}
		if (this.anInt627 != 0) {
			this.aClass21_Sub3_Sub1_1.method16344((long) this.anInt627);
		}
		this.anInt629 = 0;
		this.anInt626 = 0;
		this.anInt627 = 0;
	}

	@OriginalMember(owner = "client!acj", name = "hh", descriptor = "()V", line = 274)
	void method6481() {
		this.method27209();
	}

	@OriginalMember(owner = "client!acj", name = "finalize", descriptor = "()V", line = 274)
	@Override
	void finalize() {
		this.method27209();
	}
}
