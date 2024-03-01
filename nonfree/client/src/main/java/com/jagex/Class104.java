package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!by")
public class Class104 {

	@OriginalMember(owner = "client!by", name = "a", descriptor = "I")
	int anInt2989 = 0;

	@OriginalMember(owner = "client!by", name = "g", descriptor = "I")
	int anInt2987 = 0;

	@OriginalMember(owner = "client!by", name = "l", descriptor = "I")
	int anInt2988 = 0;

	@OriginalMember(owner = "client!by", name = "h", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_43;

	@OriginalMember(owner = "client!by", name = "x", descriptor = "Lclient!bi;")
	final Class92 aClass92_6;

	@OriginalMember(owner = "client!by", name = "p", descriptor = "[Lclient!br;")
	Class7[] aClass7Array1;

	@OriginalMember(owner = "client!by", name = "s", descriptor = "Lclient!aal;")
	final Class7_Sub2 aClass7_Sub2_1;

	@OriginalMember(owner = "client!by", name = "<init>", descriptor = "(Lclient!abt;)V", line = 15)
	Class104(@OriginalArg(0) Class21_Sub2 arg0) {
		this.aClass21_Sub2_43 = arg0;
		this.aClass92_6 = new Class92(arg0);
		this.aClass7Array1 = new Class7[16];
		this.aClass7Array1[1] = new Class7_Sub8(arg0);
		this.aClass7Array1[2] = new Class7_Sub1(arg0, this.aClass92_6);
		this.aClass7Array1[4] = new Class7_Sub3(arg0, this.aClass92_6);
		this.aClass7Array1[5] = new Class7_Sub9(arg0, this.aClass92_6);
		this.aClass7Array1[6] = new Class7_Sub7(arg0);
		this.aClass7Array1[7] = new Class7_Sub5(arg0);
		this.aClass7Array1[3] = this.aClass7_Sub2_1 = new Class7_Sub2(arg0);
		this.aClass7Array1[8] = new Class7_Sub6(arg0, this.aClass92_6);
		this.aClass7Array1[9] = new Class7_Sub4(arg0, this.aClass92_6);
		if (!this.aClass7Array1[8].method1222()) {
			this.aClass7Array1[8] = this.aClass7Array1[4];
		}
		if (!this.aClass7Array1[9].method1222()) {
			this.aClass7Array1[9] = this.aClass7Array1[8];
		}
	}

	@OriginalMember(owner = "client!by", name = "h", descriptor = "(I)Z", line = 33)
	boolean method21901(@OriginalArg(0) int arg0) {
		return this.aClass7Array1[arg0].method1222();
	}

	@OriginalMember(owner = "client!by", name = "l", descriptor = "(I)Z", line = 33)
	boolean method21904(@OriginalArg(0) int arg0) {
		return this.aClass7Array1[arg0].method1222();
	}

	@OriginalMember(owner = "client!by", name = "p", descriptor = "(I)Z", line = 33)
	boolean method21906(@OriginalArg(0) int arg0) {
		return this.aClass7Array1[arg0].method1222();
	}

	@OriginalMember(owner = "client!by", name = "a", descriptor = "(IIIZZ)V", line = 37)
	void method21902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass21_Sub2_43.method4026();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt2988 != arg0) {
			if (this.anInt2988 != 0) {
				this.aClass7Array1[this.anInt2988 & Integer.MAX_VALUE].method1221();
			}
			if (arg0 != 0) {
				this.aClass7Array1[arg0 & Integer.MAX_VALUE].method1223(arg3);
				this.aClass7Array1[arg0 & Integer.MAX_VALUE].method1224(arg3);
				this.aClass7Array1[arg0 & Integer.MAX_VALUE].method1232(arg1, arg2);
			}
			this.anInt2988 = arg0;
			this.anInt2989 = arg1;
			this.anInt2987 = arg2;
		} else if (this.anInt2988 != 0) {
			this.aClass7Array1[this.anInt2988 & Integer.MAX_VALUE].method1224(arg3);
			if (this.anInt2989 != arg1 || this.anInt2987 != arg2) {
				this.aClass7Array1[this.anInt2988 & Integer.MAX_VALUE].method1232(arg1, arg2);
				this.anInt2989 = arg1;
				this.anInt2987 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!by", name = "x", descriptor = "(IIIZZ)V", line = 37)
	void method21903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass21_Sub2_43.method4026();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt2988 != arg0) {
			if (this.anInt2988 != 0) {
				this.aClass7Array1[this.anInt2988 & Integer.MAX_VALUE].method1221();
			}
			if (arg0 != 0) {
				this.aClass7Array1[arg0 & Integer.MAX_VALUE].method1223(arg3);
				this.aClass7Array1[arg0 & Integer.MAX_VALUE].method1224(arg3);
				this.aClass7Array1[arg0 & Integer.MAX_VALUE].method1232(arg1, arg2);
			}
			this.anInt2988 = arg0;
			this.anInt2989 = arg1;
			this.anInt2987 = arg2;
		} else if (this.anInt2988 != 0) {
			this.aClass7Array1[this.anInt2988 & Integer.MAX_VALUE].method1224(arg3);
			if (this.anInt2989 != arg1 || this.anInt2987 != arg2) {
				this.aClass7Array1[this.anInt2988 & Integer.MAX_VALUE].method1232(arg1, arg2);
				this.anInt2989 = arg1;
				this.anInt2987 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!by", name = "g", descriptor = "(Lclient!bf;I)Z", line = 65)
	boolean method21900(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2988 == 0) {
			return false;
		} else {
			this.aClass7Array1[this.anInt2988 & Integer.MAX_VALUE].method1227(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!by", name = "s", descriptor = "(Lclient!bf;I)Z", line = 65)
	boolean method21905(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2988 == 0) {
			return false;
		} else {
			this.aClass7Array1[this.anInt2988 & Integer.MAX_VALUE].method1227(arg0, arg1);
			return true;
		}
	}
}
