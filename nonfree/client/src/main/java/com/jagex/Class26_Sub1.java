package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahn")
public abstract class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!ahn", name = "r", descriptor = "I")
	int anInt2892;

	@OriginalMember(owner = "client!ahn", name = "j", descriptor = "Lclient!ahn;")
	Class26_Sub1 aClass26_Sub1_23;

	@OriginalMember(owner = "client!ahn", name = "n", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!ahn", name = "e", descriptor = "B")
	public byte aByte102;

	@OriginalMember(owner = "client!ahn", name = "d", descriptor = "[Lclient!du;")
	public Class136[] aClass136Array21;

	@OriginalMember(owner = "client!ahn", name = "z", descriptor = "Lclient!rp;")
	public Class438 aClass438_23;

	@OriginalMember(owner = "client!ahn", name = "<init>", descriptor = "(Lclient!rp;)V", line = 14)
	Class26_Sub1(@OriginalArg(0) Class438 arg0) {
		this.aClass438_23 = arg0;
	}

	@OriginalMember(owner = "client!ahn", name = "fi", descriptor = "(I)I", line = 21)
	int method21464() {
		return 0;
	}

	@OriginalMember(owner = "client!ahn", name = "gt", descriptor = "()I", line = 21)
	int method21466() {
		return 0;
	}

	@OriginalMember(owner = "client!ahn", name = "gn", descriptor = "()I", line = 21)
	int method21496() {
		return 0;
	}

	@OriginalMember(owner = "client!ahn", name = "gv", descriptor = "()I", line = 21)
	int method21504() {
		return 0;
	}

	@OriginalMember(owner = "client!ahn", name = "gh", descriptor = "()I", line = 21)
	int method21505() {
		return 0;
	}

	@OriginalMember(owner = "client!ahn", name = "gz", descriptor = "()I", line = 21)
	int method21506() {
		return 0;
	}

	@OriginalMember(owner = "client!ahn", name = "gq", descriptor = "()I", line = 21)
	int method21507() {
		return 0;
	}

	@OriginalMember(owner = "client!ahn", name = "ga", descriptor = "()I", line = 21)
	int method21509() {
		return 0;
	}

	@OriginalMember(owner = "client!ahn", name = "gr", descriptor = "()Z", line = 37)
	public boolean method21462() {
		return true;
	}

	@OriginalMember(owner = "client!ahn", name = "gk", descriptor = "()Z", line = 37)
	public boolean method21476() {
		return true;
	}

	@OriginalMember(owner = "client!ahn", name = "gp", descriptor = "(I)Z", line = 37)
	public boolean method21477() {
		return true;
	}

	@OriginalMember(owner = "client!ahn", name = "gx", descriptor = "()Z", line = 37)
	public boolean method21512() {
		return true;
	}

	@OriginalMember(owner = "client!ahn", name = "ge", descriptor = "(II[Lclient!afz;B)I", line = 43)
	int method21478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub15[] arg2) {
		@Pc(10) long local10 = this.aClass438_23.aLongArrayArrayArray1[this.aByte101][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass438_23.aClass431Array1[local26 - 1].aClass3_Sub15_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ahn", name = "gg", descriptor = "(II[Lclient!afz;)I", line = 43)
	int method21482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub15[] arg2) {
		@Pc(10) long local10 = this.aClass438_23.aLongArrayArrayArray1[this.aByte101][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass438_23.aClass431Array1[local26 - 1].aClass3_Sub15_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ahn", name = "gu", descriptor = "(II[Lclient!afz;)I", line = 43)
	int method21520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub15[] arg2) {
		@Pc(10) long local10 = this.aClass438_23.aLongArrayArrayArray1[this.aByte101][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass438_23.aClass431Array1[local26 - 1].aClass3_Sub15_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ahn", name = "hi", descriptor = "(II[Lclient!afz;)I", line = 43)
	int method21522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub15[] arg2) {
		@Pc(10) long local10 = this.aClass438_23.aLongArrayArrayArray1[this.aByte101][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass438_23.aClass431Array1[local26 - 1].aClass3_Sub15_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ahn", name = "ha", descriptor = "(IIILclient!dh;)Lclient!rc;", line = 59)
	static Class426 method21513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3) {
		return arg3 == null ? null : new Class426(arg0, arg1, arg2, arg3.method5355(), arg3.method5363(), arg3.method5358(), arg3.method5466(), arg3.method5486(), arg3.method5450(), arg3.method5362());
	}

	@OriginalMember(owner = "client!ahn", name = "hk", descriptor = "(IIILclient!dh;)Lclient!rc;", line = 59)
	static Class426 method21523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3) {
		return arg3 == null ? null : new Class426(arg0, arg1, arg2, arg3.method5355(), arg3.method5363(), arg3.method5358(), arg3.method5466(), arg3.method5486(), arg3.method5450(), arg3.method5362());
	}

	@OriginalMember(owner = "client!ahn", name = "hg", descriptor = "(IIILclient!dh;)Lclient!rc;", line = 59)
	static Class426 method21525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3) {
		return arg3 == null ? null : new Class426(arg0, arg1, arg2, arg3.method5355(), arg3.method5363(), arg3.method5358(), arg3.method5466(), arg3.method5486(), arg3.method5450(), arg3.method5362());
	}

	@OriginalMember(owner = "client!ahn", name = "hd", descriptor = "(Lclient!rc;IIILclient!dh;)V", line = 65)
	static void method21524(@OriginalArg(0) Class426 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20 arg4) {
		if (arg4 != null) {
			arg0.method27902(arg1, arg2, arg3, arg4.method5355(), arg4.method5363(), arg4.method5358(), arg4.method5466(), arg4.method5486(), arg4.method5450(), arg4.method5362());
		}
	}

	@OriginalMember(owner = "client!ahn", name = "hc", descriptor = "(Lclient!rc;IIILclient!dh;)V", line = 65)
	static void method21526(@OriginalArg(0) Class426 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20 arg4) {
		if (arg4 != null) {
			arg0.method27902(arg1, arg2, arg3, arg4.method5355(), arg4.method5363(), arg4.method5358(), arg4.method5466(), arg4.method5486(), arg4.method5450(), arg4.method5362());
		}
	}

	@OriginalMember(owner = "client!ahn", name = "cz", descriptor = "()I", line = 70)
	public int method21463() {
		return -this.method21508();
	}

	@OriginalMember(owner = "client!ahn", name = "cn", descriptor = "()I", line = 70)
	public int method21473() {
		return -this.method21508();
	}

	@OriginalMember(owner = "client!ahn", name = "bb", descriptor = "(B)I", line = 70)
	public int method21479() {
		return -this.method21508();
	}

	@OriginalMember(owner = "client!ahn", name = "gm", descriptor = "(II)V", line = 74)
	void method21480(@OriginalArg(0) int arg0) {
		this.aClass136Array21 = new Class136[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass136Array21.length; local5++) {
			this.aClass136Array21[local5] = new Class136();
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ho", descriptor = "(I)V", line = 74)
	void method21528(@OriginalArg(0) int arg0) {
		this.aClass136Array21 = new Class136[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass136Array21.length; local5++) {
			this.aClass136Array21[local5] = new Class136();
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ahf", descriptor = "(Lclient!vs;I)V", line = 10371)
	static final void method21529(@OriginalArg(0) Class536 arg0) {
		if (Class552.aBoolean823 && Class350.aFrame3 != null) {
			Class157.method23193(Class510.aClass3_Sub45_37.aClass60_Sub11_1.method13403(), -1, -1, false);
		}
		if (Class527.method32424() == Class389.aClass389_3) {
			Class43_Sub4.method9306();
			System.exit(0);
		} else {
			Class117.method22815();
		}
	}

	@OriginalMember(owner = "client!ahn", name = "fu", descriptor = "(B)Z")
	abstract boolean method21465();

	@OriginalMember(owner = "client!ahn", name = "bm", descriptor = "(I)Z")
	abstract boolean method21467();

	@OriginalMember(owner = "client!ahn", name = "cx", descriptor = "()Z")
	abstract boolean method21468();

	@OriginalMember(owner = "client!ahn", name = "fb", descriptor = "(I)V")
	abstract void method21469();

	@OriginalMember(owner = "client!ahn", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;")
	abstract Class446 method21470(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;")
	public abstract Class426 method21471(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "bs", descriptor = "(B)Z")
	abstract boolean method21472();

	@OriginalMember(owner = "client!ahn", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;")
	public abstract Class426 method21474(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "gy", descriptor = "(B)Z")
	abstract boolean method21475();

	@OriginalMember(owner = "client!ahn", name = "fo", descriptor = "()V")
	abstract void method21481();

	@OriginalMember(owner = "client!ahn", name = "cs", descriptor = "()Z")
	abstract boolean method21483();

	@OriginalMember(owner = "client!ahn", name = "ct", descriptor = "()Z")
	abstract boolean method21484();

	@OriginalMember(owner = "client!ahn", name = "fx", descriptor = "(Lclient!de;I)V")
	abstract void method21485(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "fh", descriptor = "(Lclient!de;IIB)Z")
	abstract boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ahn", name = "cb", descriptor = "()I")
	public abstract int method21487();

	@OriginalMember(owner = "client!ahn", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;")
	abstract Class446 method21488(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;")
	public abstract Class426 method21489(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "gs", descriptor = "(Lclient!de;)Z")
	abstract boolean method21490(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "cc", descriptor = "()Z")
	abstract boolean method21491();

	@OriginalMember(owner = "client!ahn", name = "fv", descriptor = "(Lclient!de;II)Z")
	abstract boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ahn", name = "fy", descriptor = "(Lclient!de;II)Z")
	abstract boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ahn", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;")
	abstract Class446 method21494(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "fw", descriptor = "()Z")
	abstract boolean method21495();

	@OriginalMember(owner = "client!ahn", name = "fl", descriptor = "()V")
	abstract void method21497();

	@OriginalMember(owner = "client!ahn", name = "gc", descriptor = "(Lclient!de;)Z")
	abstract boolean method21498(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;")
	abstract Class446 method21499(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;")
	abstract Class446 method21500(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "cp", descriptor = "()Z")
	abstract boolean method21501();

	@OriginalMember(owner = "client!ahn", name = "fq", descriptor = "(Lclient!de;)V")
	abstract void method21502(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "fe", descriptor = "()Z")
	abstract boolean method21503();

	@OriginalMember(owner = "client!ahn", name = "bd", descriptor = "(I)I")
	public abstract int method21508();

	@OriginalMember(owner = "client!ahn", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V")
	abstract void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ahn", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V")
	abstract void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ahn", name = "fr", descriptor = "([Lclient!afz;I)I")
	abstract int method21514(@OriginalArg(0) Class3_Sub15[] arg0);

	@OriginalMember(owner = "client!ahn", name = "gw", descriptor = "(Lclient!de;)Z")
	abstract boolean method21515(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "go", descriptor = "()Z")
	abstract boolean method21516();

	@OriginalMember(owner = "client!ahn", name = "gi", descriptor = "()Z")
	abstract boolean method21517();

	@OriginalMember(owner = "client!ahn", name = "gb", descriptor = "()Z")
	abstract boolean method21518();

	@OriginalMember(owner = "client!ahn", name = "gl", descriptor = "([Lclient!afz;)I")
	abstract int method21519(@OriginalArg(0) Class3_Sub15[] arg0);

	@OriginalMember(owner = "client!ahn", name = "gf", descriptor = "(Lclient!de;I)Z")
	abstract boolean method21521(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!ahn", name = "cy", descriptor = "()I")
	public abstract int method21527();
}
