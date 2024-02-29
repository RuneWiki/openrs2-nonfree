package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acc")
public class Class52 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!acc", name = "gp", descriptor = "Lclient!pw;")
	public static Class478 aClass478_9;

	@OriginalMember(owner = "client!acc", name = "p", descriptor = "[[Lclient!qu;")
	public Class498[][] aClass498ArrayArray2;

	@OriginalMember(owner = "client!acc", name = "c", descriptor = "[[Ljava/lang/Object;")
	public Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!acc", name = "<init>", descriptor = "()V", line = 15)
	Class52() {
	}

	@OriginalMember(owner = "client!acc", name = "p", descriptor = "(Lclient!akv;B)V", line = 19)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method786(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!acc", name = "v", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method786(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!acc", name = "l", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method786(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!acc", name = "y", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method786(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!acc", name = "d", descriptor = "(Lclient!akv;I)V", line = 26)
	void method785(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.method22478();
		if (this.aClass498ArrayArray2 == null) {
			this.aClass498ArrayArray2 = new Class498[local6][];
		}
		for (@Pc(17) int local17 = arg0.method22478(); local17 != 255; local17 = arg0.method22478()) {
			@Pc(24) int local24 = local17 & 0x7F;
			@Pc(32) boolean local32 = (local17 & 0x80) != 0;
			@Pc(37) Class498[] local37 = new Class498[arg0.method22478()];
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				local37[local39] = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
			}
			this.aClass498ArrayArray2[local24] = local37;
			if (local32) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass498ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local24] = Class274.method26547(arg0, local37);
			}
		}
	}

	@OriginalMember(owner = "client!acc", name = "q", descriptor = "(Lclient!akv;IB)V", line = 26)
	void method786(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.method22478();
		if (this.aClass498ArrayArray2 == null) {
			this.aClass498ArrayArray2 = new Class498[local6][];
		}
		for (@Pc(17) int local17 = arg0.method22478(); local17 != 255; local17 = arg0.method22478()) {
			@Pc(24) int local24 = local17 & 0x7F;
			@Pc(32) boolean local32 = (local17 & 0x80) != 0;
			@Pc(37) Class498[] local37 = new Class498[arg0.method22478()];
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				local37[local39] = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
			}
			this.aClass498ArrayArray2[local24] = local37;
			if (local32) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass498ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local24] = Class274.method26547(arg0, local37);
			}
		}
	}

	@OriginalMember(owner = "client!acc", name = "c", descriptor = "(I)V", line = 48)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!acc", name = "t", descriptor = "()V", line = 48)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!acc", name = "w", descriptor = "()V", line = 48)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!acc", name = "x", descriptor = "(II)V", line = 49)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!acc", name = "g", descriptor = "(I)V", line = 49)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!acc", name = "z", descriptor = "(I)V", line = 49)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!acc", name = "ck", descriptor = "(Lclient!yf;I)V", line = 4889)
	static final void method787(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class345.method27830(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!acc", name = "awx", descriptor = "(Lclient!yf;I)V", line = 13281)
	static final void method788(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (Class284.aClass86_9.method20055()) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2.method16264(local12);
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 3;
		}
	}
}
