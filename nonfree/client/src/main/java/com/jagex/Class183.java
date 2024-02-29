package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bz")
public class Class183 {

	@OriginalMember(owner = "client!bz", name = "c", descriptor = "I")
	int anInt3325 = 0;

	@OriginalMember(owner = "client!bz", name = "v", descriptor = "I")
	int anInt3323 = 0;

	@OriginalMember(owner = "client!bz", name = "l", descriptor = "I")
	int anInt3324 = 0;

	@OriginalMember(owner = "client!bz", name = "y", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_43;

	@OriginalMember(owner = "client!bz", name = "w", descriptor = "Lclient!bf;")
	final Class168 aClass168_6;

	@OriginalMember(owner = "client!bz", name = "p", descriptor = "[Lclient!bs;")
	Class76[] aClass76Array1;

	@OriginalMember(owner = "client!bz", name = "t", descriptor = "Lclient!adm;")
	final Class76_Sub4 aClass76_Sub4_1;

	@OriginalMember(owner = "client!bz", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 15)
	Class183(@OriginalArg(0) Class86_Sub3 arg0) {
		this.aClass86_Sub3_43 = arg0;
		this.aClass168_6 = new Class168(arg0);
		this.aClass76Array1 = new Class76[16];
		this.aClass76Array1[1] = new Class76_Sub6(arg0);
		this.aClass76Array1[2] = new Class76_Sub3(arg0, this.aClass168_6);
		this.aClass76Array1[4] = new Class76_Sub8(arg0, this.aClass168_6);
		this.aClass76Array1[5] = new Class76_Sub9(arg0, this.aClass168_6);
		this.aClass76Array1[6] = new Class76_Sub7(arg0);
		this.aClass76Array1[7] = new Class76_Sub5(arg0);
		this.aClass76Array1[3] = this.aClass76_Sub4_1 = new Class76_Sub4(arg0);
		this.aClass76Array1[8] = new Class76_Sub2(arg0, this.aClass168_6);
		this.aClass76Array1[9] = new Class76_Sub1(arg0, this.aClass168_6);
		if (!this.aClass76Array1[8].method1995()) {
			this.aClass76Array1[8] = this.aClass76Array1[4];
		}
		if (!this.aClass76Array1[9].method1995()) {
			this.aClass76Array1[9] = this.aClass76Array1[8];
		}
	}

	@OriginalMember(owner = "client!bz", name = "p", descriptor = "(I)Z", line = 33)
	boolean method24584(@OriginalArg(0) int arg0) {
		return this.aClass76Array1[arg0].method1995();
	}

	@OriginalMember(owner = "client!bz", name = "y", descriptor = "(I)Z", line = 33)
	boolean method24585(@OriginalArg(0) int arg0) {
		return this.aClass76Array1[arg0].method1995();
	}

	@OriginalMember(owner = "client!bz", name = "l", descriptor = "(I)Z", line = 33)
	boolean method24586(@OriginalArg(0) int arg0) {
		return this.aClass76Array1[arg0].method1995();
	}

	@OriginalMember(owner = "client!bz", name = "c", descriptor = "(IIIZZ)V", line = 37)
	void method24587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass86_Sub3_43.method6045();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt3324 != arg0) {
			if (this.anInt3324 != 0) {
				this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1975();
			}
			if (arg0 != 0) {
				this.aClass76Array1[arg0 & Integer.MAX_VALUE].method1976(arg3);
				this.aClass76Array1[arg0 & Integer.MAX_VALUE].method1977(arg3);
				this.aClass76Array1[arg0 & Integer.MAX_VALUE].method1979(arg1, arg2);
			}
			this.anInt3324 = arg0;
			this.anInt3325 = arg1;
			this.anInt3323 = arg2;
		} else if (this.anInt3324 != 0) {
			this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1977(arg3);
			if (this.anInt3325 != arg1 || this.anInt3323 != arg2) {
				this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1979(arg1, arg2);
				this.anInt3325 = arg1;
				this.anInt3323 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!bz", name = "w", descriptor = "(IIIZZ)V", line = 37)
	void method24588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass86_Sub3_43.method6045();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt3324 != arg0) {
			if (this.anInt3324 != 0) {
				this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1975();
			}
			if (arg0 != 0) {
				this.aClass76Array1[arg0 & Integer.MAX_VALUE].method1976(arg3);
				this.aClass76Array1[arg0 & Integer.MAX_VALUE].method1977(arg3);
				this.aClass76Array1[arg0 & Integer.MAX_VALUE].method1979(arg1, arg2);
			}
			this.anInt3324 = arg0;
			this.anInt3325 = arg1;
			this.anInt3323 = arg2;
		} else if (this.anInt3324 != 0) {
			this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1977(arg3);
			if (this.anInt3325 != arg1 || this.anInt3323 != arg2) {
				this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1979(arg1, arg2);
				this.anInt3325 = arg1;
				this.anInt3323 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!bz", name = "t", descriptor = "(IIIZZ)V", line = 37)
	void method24589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass86_Sub3_43.method6045();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt3324 != arg0) {
			if (this.anInt3324 != 0) {
				this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1975();
			}
			if (arg0 != 0) {
				this.aClass76Array1[arg0 & Integer.MAX_VALUE].method1976(arg3);
				this.aClass76Array1[arg0 & Integer.MAX_VALUE].method1977(arg3);
				this.aClass76Array1[arg0 & Integer.MAX_VALUE].method1979(arg1, arg2);
			}
			this.anInt3324 = arg0;
			this.anInt3325 = arg1;
			this.anInt3323 = arg2;
		} else if (this.anInt3324 != 0) {
			this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1977(arg3);
			if (this.anInt3325 != arg1 || this.anInt3323 != arg2) {
				this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1979(arg1, arg2);
				this.anInt3325 = arg1;
				this.anInt3323 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!bz", name = "v", descriptor = "(Lclient!bx;I)Z", line = 65)
	boolean method24590(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3324 == 0) {
			return false;
		} else {
			this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1991(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!bz", name = "q", descriptor = "(Lclient!bx;I)Z", line = 65)
	boolean method24591(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3324 == 0) {
			return false;
		} else {
			this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1991(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!bz", name = "x", descriptor = "(Lclient!bx;I)Z", line = 65)
	boolean method24592(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3324 == 0) {
			return false;
		} else {
			this.aClass76Array1[this.anInt3324 & Integer.MAX_VALUE].method1991(arg0, arg1);
			return true;
		}
	}
}
