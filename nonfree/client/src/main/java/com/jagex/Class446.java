package com.jagex;

import java.util.LinkedList;
import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ry")
public class Class446 {

	@OriginalMember(owner = "client!ry", name = "p", descriptor = "Ljava/util/Stack;")
	static Stack aStack1 = new Stack();

	@OriginalMember(owner = "client!ry", name = "g", descriptor = "Z")
	boolean aBoolean773;

	@OriginalMember(owner = "client!ry", name = "a", descriptor = "Lclient!ahn;")
	public Class26_Sub1 aClass26_Sub1_25;

	@OriginalMember(owner = "client!ry", name = "l", descriptor = "Lclient!ql;")
	Class410 aClass410_2;

	@OriginalMember(owner = "client!ry", name = "<init>", descriptor = "()V", line = 12)
	Class446() {
	}

	@OriginalMember(owner = "client!ry", name = "h", descriptor = "(Z)Lclient!ry;", line = 15)
	public static Class446 method28343(@OriginalArg(0) boolean arg0) {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			@Pc(10) Class446 local10;
			if (aStack1.isEmpty()) {
				local10 = new Class446();
			} else {
				local10 = (Class446) aStack1.pop();
			}
			local10.aBoolean773 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!ry", name = "x", descriptor = "(Z)Lclient!ry;", line = 15)
	public static Class446 method28344(@OriginalArg(0) boolean arg0) {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			@Pc(10) Class446 local10;
			if (aStack1.isEmpty()) {
				local10 = new Class446();
			} else {
				local10 = (Class446) aStack1.pop();
			}
			local10.aBoolean773 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!ry", name = "y", descriptor = "(Lclient!ry;)V", line = 29)
	static void method28342(@OriginalArg(0) Class446 arg0) {
		arg0.aClass26_Sub1_25 = null;
		@Pc(5) Stack local5 = aStack1;
		synchronized (aStack1) {
			if (aStack1.size() < 200) {
				aStack1.push(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ry", name = "s", descriptor = "(Lclient!ry;)V", line = 29)
	static void method28345(@OriginalArg(0) Class446 arg0) {
		arg0.aClass26_Sub1_25 = null;
		@Pc(5) Stack local5 = aStack1;
		synchronized (aStack1) {
			if (aStack1.size() < 200) {
				aStack1.push(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ry", name = "u", descriptor = "(Lclient!ry;)V", line = 29)
	static void method28346(@OriginalArg(0) Class446 arg0) {
		arg0.aClass26_Sub1_25 = null;
		@Pc(5) Stack local5 = aStack1;
		synchronized (aStack1) {
			if (aStack1.size() < 200) {
				aStack1.push(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ry", name = "p", descriptor = "(Lclient!ny;I)V", line = 30)
	public static void method28354(@OriginalArg(0) Class359 arg0) {
		Class482.anInt5151 = 0;
		Class482.anInt5152 = 0;
		Class482.aList19 = new LinkedList();
		Class482.aClass53_Sub1_Sub1_Sub1Array2 = new Class53_Sub1_Sub1_Sub1[1024];
		Class482.aClass478Array1 = new Class478[Class126.anIntArray324[Class482.anInt5158 * 1631733361] + 1];
		Class482.anInt5156 = 0;
		Class482.anInt5154 = 0;
		Class122.method22838(arg0);
		Class290.method25537(arg0);
	}

	@OriginalMember(owner = "client!ry", name = "b", descriptor = "()V", line = 38)
	public static void method28347() {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			aStack1 = new Stack();
		}
	}

	@OriginalMember(owner = "client!ry", name = "c", descriptor = "()V", line = 38)
	public static void method28349() {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			aStack1 = new Stack();
		}
	}

	@OriginalMember(owner = "client!ry", name = "l", descriptor = "(Lclient!de;III)Z", line = 44)
	public boolean method28341(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.aClass26_Sub1_25.method21464();
		if (this.aClass26_Sub1_25.aClass136Array21 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.aClass26_Sub1_25.aClass136Array21.length; local11++) {
				this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 <<= local4;
				if (this.aClass26_Sub1_25.aClass136Array21[local11].method22931(arg1 + this.aClass410_2.anInt4818 * -1864398095, arg2 + this.aClass410_2.anInt4819 * -2104384111) && this.aClass26_Sub1_25.method21486(arg0, arg1, arg2)) {
					this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 >>= local4;
					return true;
				}
				this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 >>= local4;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ry", name = "n", descriptor = "(Lclient!de;II)Z", line = 44)
	public boolean method28348(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.aClass26_Sub1_25.method21464();
		if (this.aClass26_Sub1_25.aClass136Array21 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.aClass26_Sub1_25.aClass136Array21.length; local11++) {
				this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 <<= local4;
				if (this.aClass26_Sub1_25.aClass136Array21[local11].method22931(arg1 + this.aClass410_2.anInt4818 * -1864398095, arg2 + this.aClass410_2.anInt4819 * -2104384111) && this.aClass26_Sub1_25.method21486(arg0, arg1, arg2)) {
					this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 >>= local4;
					return true;
				}
				this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 >>= local4;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ry", name = "z", descriptor = "(Lclient!de;II)Z", line = 44)
	public boolean method28350(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.aClass26_Sub1_25.method21464();
		if (this.aClass26_Sub1_25.aClass136Array21 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.aClass26_Sub1_25.aClass136Array21.length; local11++) {
				this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 <<= local4;
				if (this.aClass26_Sub1_25.aClass136Array21[local11].method22931(arg1 + this.aClass410_2.anInt4818 * -1864398095, arg2 + this.aClass410_2.anInt4819 * -2104384111) && this.aClass26_Sub1_25.method21486(arg0, arg1, arg2)) {
					this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 >>= local4;
					return true;
				}
				this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 >>= local4;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ry", name = "j", descriptor = "(Lclient!de;II)Z", line = 44)
	public boolean method28351(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.aClass26_Sub1_25.method21464();
		if (this.aClass26_Sub1_25.aClass136Array21 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.aClass26_Sub1_25.aClass136Array21.length; local11++) {
				this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 <<= local4;
				if (this.aClass26_Sub1_25.aClass136Array21[local11].method22931(arg1 + this.aClass410_2.anInt4818 * -1864398095, arg2 + this.aClass410_2.anInt4819 * -2104384111) && this.aClass26_Sub1_25.method21486(arg0, arg1, arg2)) {
					this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 >>= local4;
					return true;
				}
				this.aClass26_Sub1_25.aClass136Array21[local11].anInt3404 >>= local4;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ry", name = "ki", descriptor = "(Lclient!fo;Lclient!vs;I)V", line = 5999)
	static final void method28352(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(1) byte local1 = 10;
		@Pc(14) int local14 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381];
		@Pc(27) int local27 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381];
		Class400.method27574(arg0, local1, local14, local27, arg1);
	}

	@OriginalMember(owner = "client!ry", name = "ajs", descriptor = "(Lclient!vs;I)V", line = 10783)
	static final void method28353(@OriginalArg(0) Class536 arg0) {
		Class158.method23201(arg0, arg0.aClass26_Sub1_Sub1_Sub1_4);
	}
}
