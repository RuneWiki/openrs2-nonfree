package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoa")
public class Class26_Sub1_Sub1_Sub4 extends Class26_Sub1_Sub1 {

	@OriginalMember(owner = "client!aoa", name = "ah", descriptor = "Lclient!tf;")
	Class478 aClass478_4;

	@OriginalMember(owner = "client!aoa", name = "at", descriptor = "I")
	int anInt2808 = 0;

	@OriginalMember(owner = "client!aoa", name = "ak", descriptor = "I")
	int anInt2810 = 0;

	@OriginalMember(owner = "client!aoa", name = "aa", descriptor = "Z")
	boolean aBoolean496 = true;

	@OriginalMember(owner = "client!aoa", name = "an", descriptor = "I")
	int anInt2811 = 0;

	@OriginalMember(owner = "client!aoa", name = "k", descriptor = "I")
	int anInt2809;

	@OriginalMember(owner = "client!aoa", name = "af", descriptor = "Lclient!wi;")
	Class71 aClass71_4;

	@OriginalMember(owner = "client!aoa", name = "<init>", descriptor = "(Lclient!rp;IIIIIIIIIIIIZI)V", line = 33)
	public Class26_Sub1_Sub1_Sub4(@OriginalArg(0) Class438 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt2809 = arg1 * 70153821;
		this.anInt2808 = arg12 * -806779423;
		this.anInt2811 = arg14 * -1563968815;
		@Pc(48) Class520 local48 = Class19.aClass523_14.method29823(this.anInt2809 * 1295912437);
		@Pc(53) int local53 = local48.anInt5294 * -1332447219;
		if (local53 != -1) {
			this.aClass71_4 = new Class71_Sub3(this, false);
			@Pc(70) int local70 = local48.aBoolean820 ? 0 : 2;
			if (arg13) {
				local70 = 1;
			}
			this.aClass71_4.method20030(local53, arg2, local70, false);
		}
		this.method21480(1);
	}

	@OriginalMember(owner = "client!aoa", name = "bs", descriptor = "(B)Z", line = 49)
	@Override
	boolean method21472() {
		return false;
	}

	@OriginalMember(owner = "client!aoa", name = "cc", descriptor = "()Z", line = 49)
	@Override
	boolean method21491() {
		return false;
	}

	@OriginalMember(owner = "client!aoa", name = "cp", descriptor = "()Z", line = 49)
	@Override
	boolean method21501() {
		return false;
	}

	@OriginalMember(owner = "client!aoa", name = "cs", descriptor = "()Z", line = 53)
	@Override
	boolean method21483() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aoa", name = "cx", descriptor = "()Z", line = 53)
	@Override
	boolean method21468() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aoa", name = "bm", descriptor = "(I)Z", line = 53)
	@Override
	boolean method21467() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aoa", name = "ct", descriptor = "()Z", line = 53)
	@Override
	boolean method21484() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aoa", name = "bd", descriptor = "(I)I", line = 57)
	@Override
	public int method21508() {
		return this.anInt2810 * -1911040331;
	}

	@OriginalMember(owner = "client!aoa", name = "cy", descriptor = "()I", line = 57)
	@Override
	public int method21527() {
		return this.anInt2810 * -1911040331;
	}

	@OriginalMember(owner = "client!aoa", name = "cb", descriptor = "()I", line = 57)
	@Override
	public int method21487() {
		return this.anInt2810 * -1911040331;
	}

	@OriginalMember(owner = "client!aoa", name = "p", descriptor = "(B)I", line = 61)
	public int method20599() {
		return this.anInt2811 * 1350884913;
	}

	@OriginalMember(owner = "client!aoa", name = "u", descriptor = "()I", line = 61)
	public int method20605() {
		return this.anInt2811 * 1350884913;
	}

	@OriginalMember(owner = "client!aoa", name = "y", descriptor = "()I", line = 61)
	public int method20606() {
		return this.anInt2811 * 1350884913;
	}

	@OriginalMember(owner = "client!aoa", name = "b", descriptor = "()I", line = 61)
	public int method20607() {
		return this.anInt2811 * 1350884913;
	}

	@OriginalMember(owner = "client!aoa", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 65)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aoa", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 65)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aoa", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 65)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aoa", name = "z", descriptor = "(I)V", line = 69)
	public final void method20600(@OriginalArg(0) int arg0) {
		if (this.aClass71_4 != null && !this.aClass71_4.method20039()) {
			this.aClass71_4.method20042(arg0);
		}
	}

	@OriginalMember(owner = "client!aoa", name = "a", descriptor = "(II)V", line = 69)
	public final void method20604(@OriginalArg(0) int arg0) {
		if (this.aClass71_4 != null && !this.aClass71_4.method20039()) {
			this.aClass71_4.method20042(arg0);
		}
	}

	@OriginalMember(owner = "client!aoa", name = "c", descriptor = "(I)V", line = 69)
	public final void method20608(@OriginalArg(0) int arg0) {
		if (this.aClass71_4 != null && !this.aClass71_4.method20039()) {
			this.aClass71_4.method20042(arg0);
		}
	}

	@OriginalMember(owner = "client!aoa", name = "g", descriptor = "(I)Z", line = 73)
	public final boolean method20593() {
		return this.aClass71_4 != null && !this.aClass71_4.method20032();
	}

	@OriginalMember(owner = "client!aoa", name = "j", descriptor = "()Z", line = 73)
	public final boolean method20603() {
		return this.aClass71_4 != null && !this.aClass71_4.method20032();
	}

	@OriginalMember(owner = "client!aoa", name = "l", descriptor = "(S)Z", line = 77)
	public final boolean method20602() {
		return this.aClass71_4 == null || this.aClass71_4.method20039();
	}

	@OriginalMember(owner = "client!aoa", name = "n", descriptor = "(Lclient!de;II)Lclient!dh;", line = 81)
	Class20 method20592(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class520 local4 = Class19.aClass523_14.method29823(arg2);
		@Pc(11) Class17 local11 = this.aClass438_23.aClass17Array1[this.aByte101];
		@Pc(26) Class17 local26 = this.aByte102 < 3 ? this.aClass438_23.aClass17Array1[this.aByte102 + 1] : null;
		@Pc(30) Class320 local30 = this.method21431().aClass320_61;
		return this.aClass71_4 == null || this.aClass71_4.method20039() ? local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, null, (byte) 2) : local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, this.aClass71_4, (byte) 2);
	}

	@OriginalMember(owner = "client!aoa", name = "h", descriptor = "(Lclient!de;III)Lclient!dh;", line = 81)
	Class20 method20594(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class520 local4 = Class19.aClass523_14.method29823(arg2);
		@Pc(11) Class17 local11 = this.aClass438_23.aClass17Array1[this.aByte101];
		@Pc(26) Class17 local26 = this.aByte102 < 3 ? this.aClass438_23.aClass17Array1[this.aByte102 + 1] : null;
		@Pc(30) Class320 local30 = this.method21431().aClass320_61;
		return this.aClass71_4 == null || this.aClass71_4.method20039() ? local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, null, (byte) 2) : local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, this.aClass71_4, (byte) 2);
	}

	@OriginalMember(owner = "client!aoa", name = "e", descriptor = "(Lclient!de;II)Lclient!dh;", line = 81)
	Class20 method20609(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class520 local4 = Class19.aClass523_14.method29823(arg2);
		@Pc(11) Class17 local11 = this.aClass438_23.aClass17Array1[this.aByte101];
		@Pc(26) Class17 local26 = this.aByte102 < 3 ? this.aClass438_23.aClass17Array1[this.aByte102 + 1] : null;
		@Pc(30) Class320 local30 = this.method21431().aClass320_61;
		return this.aClass71_4 == null || this.aClass71_4.method20039() ? local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, null, (byte) 2) : local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, this.aClass71_4, (byte) 2);
	}

	@OriginalMember(owner = "client!aoa", name = "r", descriptor = "(Lclient!de;II)Lclient!dh;", line = 81)
	Class20 method20610(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class520 local4 = Class19.aClass523_14.method29823(arg2);
		@Pc(11) Class17 local11 = this.aClass438_23.aClass17Array1[this.aByte101];
		@Pc(26) Class17 local26 = this.aByte102 < 3 ? this.aClass438_23.aClass17Array1[this.aByte102 + 1] : null;
		@Pc(30) Class320 local30 = this.method21431().aClass320_61;
		return this.aClass71_4 == null || this.aClass71_4.method20039() ? local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, null, (byte) 2) : local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, this.aClass71_4, (byte) 2);
	}

	@OriginalMember(owner = "client!aoa", name = "d", descriptor = "(Lclient!de;II)Lclient!dh;", line = 81)
	Class20 method20611(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class520 local4 = Class19.aClass523_14.method29823(arg2);
		@Pc(11) Class17 local11 = this.aClass438_23.aClass17Array1[this.aByte101];
		@Pc(26) Class17 local26 = this.aByte102 < 3 ? this.aClass438_23.aClass17Array1[this.aByte102 + 1] : null;
		@Pc(30) Class320 local30 = this.method21431().aClass320_61;
		return this.aClass71_4 == null || this.aClass71_4.method20039() ? local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, null, (byte) 2) : local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, this.aClass71_4, (byte) 2);
	}

	@OriginalMember(owner = "client!aoa", name = "q", descriptor = "(Lclient!de;II)Lclient!dh;", line = 81)
	Class20 method20612(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class520 local4 = Class19.aClass523_14.method29823(arg2);
		@Pc(11) Class17 local11 = this.aClass438_23.aClass17Array1[this.aByte101];
		@Pc(26) Class17 local26 = this.aByte102 < 3 ? this.aClass438_23.aClass17Array1[this.aByte102 + 1] : null;
		@Pc(30) Class320 local30 = this.method21431().aClass320_61;
		return this.aClass71_4 == null || this.aClass71_4.method20039() ? local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, null, (byte) 2) : local4.method29750(arg0, arg1, this.anInt2808 * 200345600, local11, local26, (int) local30.aFloat259, (int) local30.aFloat260, (int) local30.aFloat261, this.aClass71_4, (byte) 2);
	}

	@OriginalMember(owner = "client!aoa", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 89)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		@Pc(19) Class20 local19 = this.method20594(arg0, (this.anInt2808 * 555843105 == 0 ? 0 : 5) | 0x800, this.anInt2809 * 1295912437);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class332 local26 = this.method21433();
		this.method20596(arg0, local19, local26);
		@Pc(36) Class446 local36 = Class508.method29569(false);
		local19.method5352(local26, this.aClass136Array21[0], 0);
		if (this.aClass478_4 != null) {
			@Pc(51) Class128 local51 = this.aClass478_4.method28843();
			arg0.method17105(local51);
		}
		this.aBoolean496 = local19.method5375();
		this.anInt2810 = local19.method5466() * 1486153629;
		local19.method5356();
		return local36;
	}

	@OriginalMember(owner = "client!aoa", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 89)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		@Pc(19) Class20 local19 = this.method20594(arg0, (this.anInt2808 * 555843105 == 0 ? 0 : 5) | 0x800, this.anInt2809 * 1295912437);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class332 local26 = this.method21433();
		this.method20596(arg0, local19, local26);
		@Pc(36) Class446 local36 = Class508.method29569(false);
		local19.method5352(local26, this.aClass136Array21[0], 0);
		if (this.aClass478_4 != null) {
			@Pc(51) Class128 local51 = this.aClass478_4.method28843();
			arg0.method17105(local51);
		}
		this.aBoolean496 = local19.method5375();
		this.anInt2810 = local19.method5466() * 1486153629;
		local19.method5356();
		return local36;
	}

	@OriginalMember(owner = "client!aoa", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 89)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		@Pc(19) Class20 local19 = this.method20594(arg0, (this.anInt2808 * 555843105 == 0 ? 0 : 5) | 0x800, this.anInt2809 * 1295912437);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class332 local26 = this.method21433();
		this.method20596(arg0, local19, local26);
		@Pc(36) Class446 local36 = Class508.method29569(false);
		local19.method5352(local26, this.aClass136Array21[0], 0);
		if (this.aClass478_4 != null) {
			@Pc(51) Class128 local51 = this.aClass478_4.method28843();
			arg0.method17105(local51);
		}
		this.aBoolean496 = local19.method5375();
		this.anInt2810 = local19.method5466() * 1486153629;
		local19.method5356();
		return local36;
	}

	@OriginalMember(owner = "client!aoa", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 89)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		@Pc(19) Class20 local19 = this.method20594(arg0, (this.anInt2808 * 555843105 == 0 ? 0 : 5) | 0x800, this.anInt2809 * 1295912437);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class332 local26 = this.method21433();
		this.method20596(arg0, local19, local26);
		@Pc(36) Class446 local36 = Class508.method29569(false);
		local19.method5352(local26, this.aClass136Array21[0], 0);
		if (this.aClass478_4 != null) {
			@Pc(51) Class128 local51 = this.aClass478_4.method28843();
			arg0.method17105(local51);
		}
		this.aBoolean496 = local19.method5375();
		this.anInt2810 = local19.method5466() * 1486153629;
		local19.method5356();
		return local36;
	}

	@OriginalMember(owner = "client!aoa", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 89)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		@Pc(19) Class20 local19 = this.method20594(arg0, (this.anInt2808 * 555843105 == 0 ? 0 : 5) | 0x800, this.anInt2809 * 1295912437);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class332 local26 = this.method21433();
		this.method20596(arg0, local19, local26);
		@Pc(36) Class446 local36 = Class508.method29569(false);
		local19.method5352(local26, this.aClass136Array21[0], 0);
		if (this.aClass478_4 != null) {
			@Pc(51) Class128 local51 = this.aClass478_4.method28843();
			arg0.method17105(local51);
		}
		this.aBoolean496 = local19.method5375();
		this.anInt2810 = local19.method5466() * 1486153629;
		local19.method5356();
		return local36;
	}

	@OriginalMember(owner = "client!aoa", name = "fq", descriptor = "(Lclient!de;)V", line = 106)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
		@Pc(9) Class20 local9 = this.method20594(arg0, 0, this.anInt2809 * 1295912437);
		if (local9 != null) {
			this.method20596(arg0, local9, this.method21433());
		}
	}

	@OriginalMember(owner = "client!aoa", name = "fx", descriptor = "(Lclient!de;I)V", line = 106)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
		@Pc(9) Class20 local9 = this.method20594(arg0, 0, this.anInt2809 * 1295912437);
		if (local9 != null) {
			this.method20596(arg0, local9, this.method21433());
		}
	}

	@OriginalMember(owner = "client!aoa", name = "x", descriptor = "(Lclient!de;Lclient!dh;Lclient!mu;B)V", line = 113)
	void method20596(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class332 arg2) {
		arg1.method5463(arg2);
		@Pc(5) Class135[] local5 = arg1.method5378();
		@Pc(8) Class109[] local8 = arg1.method5379();
		if ((this.aClass478_4 == null || this.aClass478_4.aBoolean794) && (local5 != null || local8 != null)) {
			this.aClass478_4 = Class478.method28854(client.anInt3034, true);
		}
		if (this.aClass478_4 != null) {
			this.aClass478_4.method28857(arg0, (long) client.anInt3034, local5, local8, false);
			this.aClass478_4.method28842(this.aByte101, this.aShort94, this.aShort92, this.aShort93, this.aShort91);
		}
	}

	@OriginalMember(owner = "client!aoa", name = "m", descriptor = "(Lclient!de;Lclient!dh;Lclient!mu;)V", line = 113)
	void method20598(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class332 arg2) {
		arg1.method5463(arg2);
		@Pc(5) Class135[] local5 = arg1.method5378();
		@Pc(8) Class109[] local8 = arg1.method5379();
		if ((this.aClass478_4 == null || this.aClass478_4.aBoolean794) && (local5 != null || local8 != null)) {
			this.aClass478_4 = Class478.method28854(client.anInt3034, true);
		}
		if (this.aClass478_4 != null) {
			this.aClass478_4.method28857(arg0, (long) client.anInt3034, local5, local8, false);
			this.aClass478_4.method28842(this.aByte101, this.aShort94, this.aShort92, this.aShort93, this.aShort91);
		}
	}

	@OriginalMember(owner = "client!aoa", name = "v", descriptor = "(Lclient!de;Lclient!dh;Lclient!mu;)V", line = 113)
	void method20601(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class332 arg2) {
		arg1.method5463(arg2);
		@Pc(5) Class135[] local5 = arg1.method5378();
		@Pc(8) Class109[] local8 = arg1.method5379();
		if ((this.aClass478_4 == null || this.aClass478_4.aBoolean794) && (local5 != null || local8 != null)) {
			this.aClass478_4 = Class478.method28854(client.anInt3034, true);
		}
		if (this.aClass478_4 != null) {
			this.aClass478_4.method28857(arg0, (long) client.anInt3034, local5, local8, false);
			this.aClass478_4.method28842(this.aByte101, this.aShort94, this.aShort92, this.aShort93, this.aShort91);
		}
	}

	@OriginalMember(owner = "client!aoa", name = "bt", descriptor = "()V", line = 124)
	public void method20595() {
		if (this.aClass478_4 != null) {
			this.aClass478_4.method28829();
		}
	}

	@OriginalMember(owner = "client!aoa", name = "s", descriptor = "(I)V", line = 124)
	public void method20597() {
		if (this.aClass478_4 != null) {
			this.aClass478_4.method28829();
		}
	}

	@OriginalMember(owner = "client!aoa", name = "t", descriptor = "()V", line = 124)
	public void method20613() {
		if (this.aClass478_4 != null) {
			this.aClass478_4.method28829();
		}
	}

	@OriginalMember(owner = "client!aoa", name = "bf", descriptor = "()V", line = 124)
	public void method20614() {
		if (this.aClass478_4 != null) {
			this.aClass478_4.method28829();
		}
	}

	@OriginalMember(owner = "client!aoa", name = "fy", descriptor = "(Lclient!de;II)Z", line = 128)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aoa", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 128)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aoa", name = "fv", descriptor = "(Lclient!de;II)Z", line = 128)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aoa", name = "fu", descriptor = "(B)Z", line = 132)
	@Override
	final boolean method21465() {
		return false;
	}

	@OriginalMember(owner = "client!aoa", name = "fw", descriptor = "()Z", line = 132)
	@Override
	final boolean method21495() {
		return false;
	}

	@OriginalMember(owner = "client!aoa", name = "fe", descriptor = "()Z", line = 132)
	@Override
	final boolean method21503() {
		return false;
	}

	@OriginalMember(owner = "client!aoa", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 136)
	@Override
	final void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aoa", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 136)
	@Override
	final void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aoa", name = "fl", descriptor = "()V", line = 140)
	@Override
	final void method21497() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aoa", name = "fb", descriptor = "(I)V", line = 140)
	@Override
	final void method21469() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aoa", name = "fo", descriptor = "()V", line = 140)
	@Override
	final void method21481() {
		throw new IllegalStateException();
	}
}
