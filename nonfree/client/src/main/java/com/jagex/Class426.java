package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public class Class426 {

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	int anInt4855;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	int anInt4854;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	int anInt4857;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	int anInt4856;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	int anInt4853;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
	int anInt4862;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	int anInt4859;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	int anInt4860;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	int anInt4861;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	int anInt4858;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 17)
	Class426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt4855 = arg0;
		this.anInt4854 = arg1;
		this.anInt4857 = arg2;
		this.anInt4856 = arg3 * arg3;
		this.anInt4853 = this.anInt4855 + arg4;
		this.anInt4862 = this.anInt4855 + arg5;
		this.anInt4859 = this.anInt4854 + arg6;
		this.anInt4860 = this.anInt4854 + arg7;
		this.anInt4861 = this.anInt4857 + arg8;
		this.anInt4858 = this.anInt4857 + arg9;
	}

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "(IIIIIIIIII)V", line = 31)
	void method27902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt4855 = arg0;
		this.anInt4854 = arg1;
		this.anInt4857 = arg2;
		this.anInt4856 = arg3 * arg3;
		this.anInt4853 = this.anInt4855 + arg4;
		this.anInt4862 = this.anInt4855 + arg5;
		this.anInt4859 = this.anInt4854 + arg6;
		this.anInt4860 = this.anInt4854 + arg7;
		this.anInt4861 = this.anInt4857 + arg8;
		this.anInt4858 = this.anInt4857 + arg9;
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(IIIIIIIIII)V", line = 31)
	void method27903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt4855 = arg0;
		this.anInt4854 = arg1;
		this.anInt4857 = arg2;
		this.anInt4856 = arg3 * arg3;
		this.anInt4853 = this.anInt4855 + arg4;
		this.anInt4862 = this.anInt4855 + arg5;
		this.anInt4859 = this.anInt4854 + arg6;
		this.anInt4860 = this.anInt4854 + arg7;
		this.anInt4861 = this.anInt4857 + arg8;
		this.anInt4858 = this.anInt4857 + arg9;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Z", line = 44)
	public boolean method27901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < this.anInt4853 || arg0 > this.anInt4862) {
			return false;
		} else if (arg1 < this.anInt4859 || arg1 > this.anInt4860) {
			return false;
		} else if (arg2 >= this.anInt4861 && arg2 <= this.anInt4858) {
			@Pc(34) int local34 = arg0 - this.anInt4855;
			@Pc(39) int local39 = arg2 - this.anInt4857;
			return local34 * local34 + local39 * local39 < this.anInt4856;
		} else {
			return false;
		}
	}
}
