package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ya")
public class Class677 {

	@OriginalMember(owner = "client!ya", name = "n", descriptor = "Lclient!hq;")
	Class320 aClass320_4;

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "Lclient!hf;")
	Class312 aClass312_13;

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "()V", line = 10)
	Class677() {
	}

	@OriginalMember(owner = "client!ya", name = "k", descriptor = "()Lclient!hf;", line = 13)
	Class312 method33227() {
		return this.aClass320_4.method27228(this.aClass312_13.anInt3953 * -1549590237);
	}

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)Lclient!hf;", line = 13)
	Class312 method33228() {
		return this.aClass320_4.method27228(this.aClass312_13.anInt3953 * -1549590237);
	}

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "()Lclient!hf;", line = 13)
	Class312 method33229() {
		return this.aClass320_4.method27228(this.aClass312_13.anInt3953 * -1549590237);
	}

	@OriginalMember(owner = "client!ya", name = "w", descriptor = "(II)Z", line = 17)
	boolean method33224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class312 local4 = Class124_Sub2.method9308(arg0, arg1);
		if (local4 == null) {
			this.method33226();
			return false;
		} else {
			this.aClass320_4 = Class166_Sub1.aClass320Array1[arg0 >> 16];
			this.aClass312_13 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!ya", name = "n", descriptor = "(III)Z", line = 17)
	boolean method33225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class312 local4 = Class124_Sub2.method9308(arg0, arg1);
		if (local4 == null) {
			this.method33226();
			return false;
		} else {
			this.aClass320_4 = Class166_Sub1.aClass320Array1[arg0 >> 16];
			this.aClass312_13 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "(II)Z", line = 17)
	boolean method33230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class312 local4 = Class124_Sub2.method9308(arg0, arg1);
		if (local4 == null) {
			this.method33226();
			return false;
		} else {
			this.aClass320_4 = Class166_Sub1.aClass320Array1[arg0 >> 16];
			this.aClass312_13 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!ya", name = "m", descriptor = "(I)V", line = 30)
	void method33226() {
		this.aClass320_4 = null;
		this.aClass312_13 = null;
	}
}
