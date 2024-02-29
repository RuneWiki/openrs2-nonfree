package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alc")
public abstract class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!alc", name = "g", descriptor = "Lclient!alc;")
	Class104_Sub1 aClass104_Sub1_23;

	@OriginalMember(owner = "client!alc", name = "i", descriptor = "I")
	int anInt3219;

	@OriginalMember(owner = "client!alc", name = "k", descriptor = "[Lclient!eh;")
	public Class224[] aClass224Array21;

	@OriginalMember(owner = "client!alc", name = "j", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!alc", name = "z", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!alc", name = "r", descriptor = "Lclient!tk;")
	public Class556 aClass556_23;

	@OriginalMember(owner = "client!alc", name = "<init>", descriptor = "(Lclient!tk;)V", line = 14)
	Class104_Sub1(@OriginalArg(0) Class556 arg0) {
		this.aClass556_23 = arg0;
	}

	@OriginalMember(owner = "client!alc", name = "ga", descriptor = "(I)I", line = 21)
	int method24121() {
		return 0;
	}

	@OriginalMember(owner = "client!alc", name = "ge", descriptor = "()I", line = 21)
	int method24122() {
		return 0;
	}

	@OriginalMember(owner = "client!alc", name = "gb", descriptor = "(I)Z", line = 37)
	public boolean method24123() {
		return true;
	}

	@OriginalMember(owner = "client!alc", name = "gf", descriptor = "()Z", line = 37)
	public boolean method24124() {
		return true;
	}

	@OriginalMember(owner = "client!alc", name = "go", descriptor = "()Z", line = 37)
	public boolean method24125() {
		return true;
	}

	@OriginalMember(owner = "client!alc", name = "gu", descriptor = "(II[Lclient!ajv;I)I", line = 43)
	int method24126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub22[] arg2) {
		@Pc(10) long local10 = this.aClass556_23.aLongArrayArrayArray1[this.aByte100][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass556_23.aClass561Array1[local26 - 1].aClass77_Sub22_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!alc", name = "gh", descriptor = "(II[Lclient!ajv;)I", line = 43)
	int method24127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub22[] arg2) {
		@Pc(10) long local10 = this.aClass556_23.aLongArrayArrayArray1[this.aByte100][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass556_23.aClass561Array1[local26 - 1].aClass77_Sub22_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!alc", name = "gl", descriptor = "(II[Lclient!ajv;)I", line = 43)
	int method24128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub22[] arg2) {
		@Pc(10) long local10 = this.aClass556_23.aLongArrayArrayArray1[this.aByte100][arg0][arg1];
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		while (local12 <= 48L) {
			local26 = (int) (local10 >> (int) local12 & 0xFFFFL);
			if (local26 <= 0) {
				break;
			}
			arg2[local14++] = this.aClass556_23.aClass561Array1[local26 - 1].aClass77_Sub22_3;
			local12 += 16L;
		}
		for (local26 = local14; local26 < 4; local26++) {
			arg2[local26] = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!alc", name = "gm", descriptor = "(IIILclient!dv;)Lclient!tu;", line = 59)
	static Class563 method24129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class84 arg3) {
		return arg3 == null ? null : new Class563(arg0, arg1, arg2, arg3.method6820(), arg3.method6906(), arg3.method6822(), arg3.method6824(), arg3.method6825(), arg3.method6826(), arg3.method6817());
	}

	@OriginalMember(owner = "client!alc", name = "hl", descriptor = "(Lclient!tu;IIILclient!dv;)V", line = 65)
	static void method24130(@OriginalArg(0) Class563 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class84 arg4) {
		if (arg4 != null) {
			arg0.method31326(arg1, arg2, arg3, arg4.method6820(), arg4.method6906(), arg4.method6822(), arg4.method6824(), arg4.method6825(), arg4.method6826(), arg4.method6817());
		}
	}

	@OriginalMember(owner = "client!alc", name = "gw", descriptor = "(Lclient!tu;IIILclient!dv;)V", line = 65)
	static void method24131(@OriginalArg(0) Class563 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class84 arg4) {
		if (arg4 != null) {
			arg0.method31326(arg1, arg2, arg3, arg4.method6820(), arg4.method6906(), arg4.method6822(), arg4.method6824(), arg4.method6825(), arg4.method6826(), arg4.method6817());
		}
	}

	@OriginalMember(owner = "client!alc", name = "dz", descriptor = "()I", line = 70)
	public int method24132() {
		return -this.method24160();
	}

	@OriginalMember(owner = "client!alc", name = "dw", descriptor = "()I", line = 70)
	public int method24133() {
		return -this.method24160();
	}

	@OriginalMember(owner = "client!alc", name = "bk", descriptor = "(I)I", line = 70)
	public int method24134() {
		return -this.method24160();
	}

	@OriginalMember(owner = "client!alc", name = "gq", descriptor = "(II)V", line = 74)
	void method24135(@OriginalArg(0) int arg0) {
		this.aClass224Array21 = new Class224[arg0];
		for (@Pc(5) int local5 = 0; local5 < this.aClass224Array21.length; local5++) {
			this.aClass224Array21[local5] = new Class224();
		}
	}

	@OriginalMember(owner = "client!alc", name = "gr", descriptor = "()V")
	abstract void method24136();

	@OriginalMember(owner = "client!alc", name = "fb", descriptor = "(Lclient!dx;IIB)Z")
	abstract boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!alc", name = "fu", descriptor = "(B)Z")
	abstract boolean method24138();

	@OriginalMember(owner = "client!alc", name = "bz", descriptor = "(I)Z")
	abstract boolean method24139();

	@OriginalMember(owner = "client!alc", name = "bu", descriptor = "(I)Z")
	abstract boolean method24140();

	@OriginalMember(owner = "client!alc", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V")
	abstract void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alc", name = "fd", descriptor = "(I)V")
	abstract void method24142();

	@OriginalMember(owner = "client!alc", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;")
	abstract Class551 method24143(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;")
	public abstract Class563 method24144(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "gc", descriptor = "([Lclient!ajv;I)I")
	abstract int method24145(@OriginalArg(0) Class77_Sub22[] arg0);

	@OriginalMember(owner = "client!alc", name = "gy", descriptor = "(Lclient!dx;I)Z")
	abstract boolean method24146(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "gz", descriptor = "(B)Z")
	abstract boolean method24147();

	@OriginalMember(owner = "client!alc", name = "fx", descriptor = "()Z")
	abstract boolean method24148();

	@OriginalMember(owner = "client!alc", name = "co", descriptor = "()Z")
	abstract boolean method24149();

	@OriginalMember(owner = "client!alc", name = "gj", descriptor = "()V")
	abstract void method24150();

	@OriginalMember(owner = "client!alc", name = "cs", descriptor = "()I")
	public abstract int method24151();

	@OriginalMember(owner = "client!alc", name = "cy", descriptor = "()I")
	public abstract int method24152();

	@OriginalMember(owner = "client!alc", name = "fs", descriptor = "(Lclient!dx;I)V")
	abstract void method24153(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "cq", descriptor = "()Z")
	abstract boolean method24154();

	@OriginalMember(owner = "client!alc", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;")
	public abstract Class563 method24155(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "fn", descriptor = "(Lclient!dx;)V")
	abstract void method24156(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;")
	public abstract Class563 method24157(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "fa", descriptor = "(Lclient!dx;II)Z")
	abstract boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!alc", name = "fp", descriptor = "(Lclient!dx;II)Z")
	abstract boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!alc", name = "bt", descriptor = "(I)I")
	public abstract int method24160();

	@OriginalMember(owner = "client!alc", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V")
	abstract void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alc", name = "cn", descriptor = "()Z")
	abstract boolean method24162();

	@OriginalMember(owner = "client!alc", name = "fg", descriptor = "(Lclient!dx;II)Z")
	abstract boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!alc", name = "gi", descriptor = "()V")
	abstract void method24164();

	@OriginalMember(owner = "client!alc", name = "fy", descriptor = "(Lclient!dx;II)Z")
	abstract boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!alc", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V")
	abstract void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!alc", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;")
	abstract Class551 method24167(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "gg", descriptor = "()Z")
	abstract boolean method24168();

	@OriginalMember(owner = "client!alc", name = "gx", descriptor = "([Lclient!ajv;)I")
	abstract int method24169(@OriginalArg(0) Class77_Sub22[] arg0);

	@OriginalMember(owner = "client!alc", name = "gv", descriptor = "(Lclient!dx;)Z")
	abstract boolean method24170(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "gd", descriptor = "(Lclient!dx;)Z")
	abstract boolean method24171(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "gn", descriptor = "(Lclient!dx;)Z")
	abstract boolean method24172(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!alc", name = "gs", descriptor = "()Z")
	abstract boolean method24173();

	@OriginalMember(owner = "client!alc", name = "ci", descriptor = "()Z")
	abstract boolean method24174();
}
