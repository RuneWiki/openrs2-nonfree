package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agq")
public class Class3_Sub32 extends Class3 implements Interface59 {

	@OriginalMember(owner = "client!agq", name = "h", descriptor = "I")
	static int anInt1341;

	@OriginalMember(owner = "client!agq", name = "l", descriptor = "[Lclient!agq;")
	static Class3_Sub32[] aClass3_Sub32Array1 = new Class3_Sub32[0];

	@OriginalMember(owner = "client!agq", name = "u", descriptor = "I")
	public int anInt1343;

	@OriginalMember(owner = "client!agq", name = "y", descriptor = "I")
	public int anInt1344;

	@OriginalMember(owner = "client!agq", name = "x", descriptor = "I")
	public int anInt1345;

	@OriginalMember(owner = "client!agq", name = "s", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!agq", name = "ah", descriptor = "(IIII)Lclient!agq;", line = 17)
	public static Class3_Sub32 method11711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class3_Sub32[] local2 = aClass3_Sub32Array1;
		synchronized (aClass3_Sub32Array1) {
			if (anInt1341 * 2037424989 == 0) {
				return new Class3_Sub32(arg0, arg1, arg2, arg3);
			} else {
				aClass3_Sub32Array1[(anInt1341 -= -676345611) * 2037424989].method11704(arg0, arg1, arg2, arg3);
				return aClass3_Sub32Array1[anInt1341 * 2037424989];
			}
		}
	}

	@OriginalMember(owner = "client!agq", name = "an", descriptor = "(IIII)Lclient!agq;", line = 17)
	public static Class3_Sub32 method11712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class3_Sub32[] local2 = aClass3_Sub32Array1;
		synchronized (aClass3_Sub32Array1) {
			if (anInt1341 * 2037424989 == 0) {
				return new Class3_Sub32(arg0, arg1, arg2, arg3);
			} else {
				aClass3_Sub32Array1[(anInt1341 -= -676345611) * 2037424989].method11704(arg0, arg1, arg2, arg3);
				return aClass3_Sub32Array1[anInt1341 * 2037424989];
			}
		}
	}

	@OriginalMember(owner = "client!agq", name = "ai", descriptor = "(Lclient!agq;)Lclient!agq;", line = 27)
	public static Class3_Sub32 method11703(@OriginalArg(0) Class3_Sub32 arg0) {
		@Pc(2) Class3_Sub32[] local2 = aClass3_Sub32Array1;
		synchronized (aClass3_Sub32Array1) {
			if (anInt1341 * 2037424989 == 0) {
				return new Class3_Sub32(arg0);
			} else {
				aClass3_Sub32Array1[(anInt1341 -= -676345611) * 2037424989].method11705(arg0);
				return aClass3_Sub32Array1[anInt1341 * 2037424989];
			}
		}
	}

	@OriginalMember(owner = "client!agq", name = "as", descriptor = "(Lclient!agq;)Lclient!agq;", line = 27)
	public static Class3_Sub32 method11720(@OriginalArg(0) Class3_Sub32 arg0) {
		@Pc(2) Class3_Sub32[] local2 = aClass3_Sub32Array1;
		synchronized (aClass3_Sub32Array1) {
			if (anInt1341 * 2037424989 == 0) {
				return new Class3_Sub32(arg0);
			} else {
				aClass3_Sub32Array1[(anInt1341 -= -676345611) * 2037424989].method11705(arg0);
				return aClass3_Sub32Array1[anInt1341 * 2037424989];
			}
		}
	}

	@OriginalMember(owner = "client!agq", name = "aj", descriptor = "(Lclient!agq;)Lclient!agq;", line = 27)
	public static Class3_Sub32 method11726(@OriginalArg(0) Class3_Sub32 arg0) {
		@Pc(2) Class3_Sub32[] local2 = aClass3_Sub32Array1;
		synchronized (aClass3_Sub32Array1) {
			if (anInt1341 * 2037424989 == 0) {
				return new Class3_Sub32(arg0);
			} else {
				aClass3_Sub32Array1[(anInt1341 -= -676345611) * 2037424989].method11705(arg0);
				return aClass3_Sub32Array1[anInt1341 * 2037424989];
			}
		}
	}

	@OriginalMember(owner = "client!agq", name = "aq", descriptor = "(IZ)Lclient!agq;", line = 37)
	public static Class3_Sub32 method11729(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) Class3_Sub32[] local2 = aClass3_Sub32Array1;
		synchronized (aClass3_Sub32Array1) {
			if (anInt1341 * 2037424989 == 0) {
				return new Class3_Sub32(arg0, arg1);
			} else {
				aClass3_Sub32Array1[(anInt1341 -= -676345611) * 2037424989].method11713(arg0, arg1);
				return aClass3_Sub32Array1[anInt1341 * 2037424989];
			}
		}
	}

	@OriginalMember(owner = "client!agq", name = "<init>", descriptor = "()V", line = 46)
	public Class3_Sub32() {
		this.anInt1342 = -1041055183;
	}

	@OriginalMember(owner = "client!agq", name = "<init>", descriptor = "(IIII)V", line = 50)
	public Class3_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1342 = arg0 * 1041055183;
		this.anInt1343 = arg1 * 856948829;
		this.anInt1345 = arg2 * -78001219;
		this.anInt1344 = arg3 * 618120789;
	}

	@OriginalMember(owner = "client!agq", name = "<init>", descriptor = "(Lclient!agq;)V", line = 57)
	Class3_Sub32(@OriginalArg(0) Class3_Sub32 arg0) {
		this.anInt1342 = arg0.anInt1342;
		this.anInt1343 = arg0.anInt1343;
		this.anInt1345 = arg0.anInt1345;
		this.anInt1344 = arg0.anInt1344;
	}

	@OriginalMember(owner = "client!agq", name = "<init>", descriptor = "(IZ)V", line = 64)
	Class3_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1342 = -1041055183;
		} else {
			this.anInt1342 = (arg0 >> 28 & 0x3) * 1041055183;
			this.anInt1343 = ((arg0 >> 14 & 0x3FFF) << 9) * 856948829;
			this.anInt1345 = 0;
			this.anInt1344 = ((arg0 & 0x3FFF) << 9) * 618120789;
			if (arg1) {
				this.anInt1343 += 335568128;
				this.anInt1344 += -674867968;
			}
		}
	}

	@OriginalMember(owner = "client!agq", name = "f", descriptor = "(IIIIS)V", line = 79)
	void method11704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1342 = arg0 * 1041055183;
		this.anInt1343 = arg1 * 856948829;
		this.anInt1345 = arg2 * -78001219;
		this.anInt1344 = arg3 * 618120789;
	}

	@OriginalMember(owner = "client!agq", name = "av", descriptor = "(IIII)V", line = 79)
	void method11714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1342 = arg0 * 1041055183;
		this.anInt1343 = arg1 * 856948829;
		this.anInt1345 = arg2 * -78001219;
		this.anInt1344 = arg3 * 618120789;
	}

	@OriginalMember(owner = "client!agq", name = "ax", descriptor = "(IIII)V", line = 79)
	void method11715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1342 = arg0 * 1041055183;
		this.anInt1343 = arg1 * 856948829;
		this.anInt1345 = arg2 * -78001219;
		this.anInt1344 = arg3 * 618120789;
	}

	@OriginalMember(owner = "client!agq", name = "k", descriptor = "(Lclient!agq;I)V", line = 86)
	void method11705(@OriginalArg(0) Class3_Sub32 arg0) {
		this.anInt1342 = arg0.anInt1342;
		this.anInt1343 = arg0.anInt1343;
		this.anInt1345 = arg0.anInt1345;
		this.anInt1344 = arg0.anInt1344;
	}

	@OriginalMember(owner = "client!agq", name = "az", descriptor = "(Lclient!agq;)V", line = 86)
	void method11716(@OriginalArg(0) Class3_Sub32 arg0) {
		this.anInt1342 = arg0.anInt1342;
		this.anInt1343 = arg0.anInt1343;
		this.anInt1345 = arg0.anInt1345;
		this.anInt1344 = arg0.anInt1344;
	}

	@OriginalMember(owner = "client!agq", name = "at", descriptor = "(IZI)V", line = 93)
	void method11713(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1342 = -1041055183;
			return;
		}
		this.anInt1342 = (arg0 >> 28 & 0x3) * 1041055183;
		this.anInt1343 = ((arg0 >> 14 & 0x3FFF) << 9) * 856948829;
		this.anInt1345 = 0;
		this.anInt1344 = ((arg0 & 0x3FFF) << 9) * 618120789;
		if (arg1) {
			this.anInt1343 += 335568128;
			this.anInt1344 += -674867968;
		}
	}

	@OriginalMember(owner = "client!agq", name = "al", descriptor = "(IZ)V", line = 93)
	void method11717(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1342 = -1041055183;
			return;
		}
		this.anInt1342 = (arg0 >> 28 & 0x3) * 1041055183;
		this.anInt1343 = ((arg0 >> 14 & 0x3FFF) << 9) * 856948829;
		this.anInt1345 = 0;
		this.anInt1344 = ((arg0 & 0x3FFF) << 9) * 618120789;
		if (arg1) {
			this.anInt1343 += 335568128;
			this.anInt1344 += -674867968;
		}
	}

	@OriginalMember(owner = "client!agq", name = "ao", descriptor = "(IZ)V", line = 93)
	void method11718(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1342 = -1041055183;
			return;
		}
		this.anInt1342 = (arg0 >> 28 & 0x3) * 1041055183;
		this.anInt1343 = ((arg0 >> 14 & 0x3FFF) << 9) * 856948829;
		this.anInt1345 = 0;
		this.anInt1344 = ((arg0 & 0x3FFF) << 9) * 618120789;
		if (arg1) {
			this.anInt1343 += 335568128;
			this.anInt1344 += -674867968;
		}
	}

	@OriginalMember(owner = "client!agq", name = "ap", descriptor = "(IZ)V", line = 93)
	void method11719(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1342 = -1041055183;
			return;
		}
		this.anInt1342 = (arg0 >> 28 & 0x3) * 1041055183;
		this.anInt1343 = ((arg0 >> 14 & 0x3FFF) << 9) * 856948829;
		this.anInt1345 = 0;
		this.anInt1344 = ((arg0 & 0x3FFF) << 9) * 618120789;
		if (arg1) {
			this.anInt1343 += 335568128;
			this.anInt1344 += -674867968;
		}
	}

	@OriginalMember(owner = "client!agq", name = "ab", descriptor = "(IZ)V", line = 93)
	void method11723(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1342 = -1041055183;
			return;
		}
		this.anInt1342 = (arg0 >> 28 & 0x3) * 1041055183;
		this.anInt1343 = ((arg0 >> 14 & 0x3FFF) << 9) * 856948829;
		this.anInt1345 = 0;
		this.anInt1344 = ((arg0 & 0x3FFF) << 9) * 618120789;
		if (arg1) {
			this.anInt1343 += 335568128;
			this.anInt1344 += -674867968;
		}
	}

	@OriginalMember(owner = "client!agq", name = "af", descriptor = "(I)Lclient!mh;", line = 107)
	public Class320 method11706() {
		return new Class320((float) (this.anInt1343 * 2061226997), (float) (this.anInt1345 * -799586411), (float) (this.anInt1344 * 615450365));
	}

	@OriginalMember(owner = "client!agq", name = "au", descriptor = "()Lclient!mh;", line = 107)
	public Class320 method11721() {
		return new Class320((float) (this.anInt1343 * 2061226997), (float) (this.anInt1345 * -799586411), (float) (this.anInt1344 * 615450365));
	}

	@OriginalMember(owner = "client!agq", name = "ay", descriptor = "()Lclient!mh;", line = 107)
	public Class320 method11722() {
		return new Class320((float) (this.anInt1343 * 2061226997), (float) (this.anInt1345 * -799586411), (float) (this.anInt1344 * 615450365));
	}

	@OriginalMember(owner = "client!agq", name = "ak", descriptor = "(Lclient!ahb;B)V", line = 111)
	void method11707(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.method20250(this.anInt1342 * 452765999);
		arg0.method20254(this.anInt1343 * 2061226997);
		arg0.method20254(this.anInt1345 * -799586411);
		arg0.method20254(this.anInt1344 * 615450365);
	}

	@OriginalMember(owner = "client!agq", name = "ag", descriptor = "(Lclient!ahb;)V", line = 111)
	void method11710(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.method20250(this.anInt1342 * 452765999);
		arg0.method20254(this.anInt1343 * 2061226997);
		arg0.method20254(this.anInt1345 * -799586411);
		arg0.method20254(this.anInt1344 * 615450365);
	}

	@OriginalMember(owner = "client!agq", name = "am", descriptor = "(Lclient!ahb;)V", line = 111)
	void method11724(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.method20250(this.anInt1342 * 452765999);
		arg0.method20254(this.anInt1343 * 2061226997);
		arg0.method20254(this.anInt1345 * -799586411);
		arg0.method20254(this.anInt1344 * 615450365);
	}

	@OriginalMember(owner = "client!agq", name = "ar", descriptor = "(Lclient!ahb;)V", line = 111)
	void method11725(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.method20250(this.anInt1342 * 452765999);
		arg0.method20254(this.anInt1343 * 2061226997);
		arg0.method20254(this.anInt1345 * -799586411);
		arg0.method20254(this.anInt1344 * 615450365);
	}

	@OriginalMember(owner = "client!agq", name = "ae", descriptor = "()I", line = 118)
	static int method11708() {
		return 13;
	}

	@OriginalMember(owner = "client!agq", name = "ad", descriptor = "()I", line = 118)
	static int method11727() {
		return 13;
	}

	@OriginalMember(owner = "client!agq", name = "toString", descriptor = "()Ljava/lang/String;", line = 123)
	@Override
	public String toString() {
		return "Level: " + this.anInt1342 * 452765999 + " Coord: " + this.anInt1343 * 2061226997 + "," + this.anInt1345 * -799586411 + "," + this.anInt1344 * 615450365 + " Coord Split: " + (this.anInt1343 * 2061226997 >> 15) + "," + (this.anInt1344 * 615450365 >> 15) + "," + (this.anInt1343 * 2061226997 >> 9 & 0x3F) + "," + (this.anInt1344 * 615450365 >> 9 & 0x3F) + "," + (this.anInt1343 * 2061226997 & 0x1FF) + "," + (this.anInt1344 * 615450365 & 0x1FF);
	}

	@OriginalMember(owner = "client!agq", name = "ox", descriptor = "()Ljava/lang/String;", line = 123)
	public String method11709() {
		return "Level: " + this.anInt1342 * 452765999 + " Coord: " + this.anInt1343 * 2061226997 + "," + this.anInt1345 * -799586411 + "," + this.anInt1344 * 615450365 + " Coord Split: " + (this.anInt1343 * 2061226997 >> 15) + "," + (this.anInt1344 * 615450365 >> 15) + "," + (this.anInt1343 * 2061226997 >> 9 & 0x3F) + "," + (this.anInt1344 * 615450365 >> 9 & 0x3F) + "," + (this.anInt1343 * 2061226997 & 0x1FF) + "," + (this.anInt1344 * 615450365 & 0x1FF);
	}

	@OriginalMember(owner = "client!agq", name = "ou", descriptor = "()Ljava/lang/String;", line = 123)
	public String method11728() {
		return "Level: " + this.anInt1342 * 452765999 + " Coord: " + this.anInt1343 * 2061226997 + "," + this.anInt1345 * -799586411 + "," + this.anInt1344 * 615450365 + " Coord Split: " + (this.anInt1343 * 2061226997 >> 15) + "," + (this.anInt1344 * 615450365 >> 15) + "," + (this.anInt1343 * 2061226997 >> 9 & 0x3F) + "," + (this.anInt1344 * 615450365 >> 9 & 0x3F) + "," + (this.anInt1343 * 2061226997 & 0x1FF) + "," + (this.anInt1344 * 615450365 & 0x1FF);
	}

	@OriginalMember(owner = "client!agq", name = "p", descriptor = "(I)I", line = 127)
	@Override
	public int method11700() {
		return Class177.method23427();
	}

	@OriginalMember(owner = "client!agq", name = "l", descriptor = "()I", line = 127)
	@Override
	public int method11694() {
		return Class177.method23427();
	}

	@OriginalMember(owner = "client!agq", name = "h", descriptor = "(Lclient!ahb;)V", line = 131)
	@Override
	public void method11701(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method11707(arg0);
	}

	@OriginalMember(owner = "client!agq", name = "x", descriptor = "(Lclient!ahb;)V", line = 131)
	@Override
	public void method11696(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method11707(arg0);
	}

	@OriginalMember(owner = "client!agq", name = "a", descriptor = "(Lclient!ahb;I)V", line = 131)
	@Override
	public void method11692(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method11707(arg0);
	}

	@OriginalMember(owner = "client!agq", name = "s", descriptor = "(Lclient!ahb;)V", line = 131)
	@Override
	public void method11697(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method11707(arg0);
	}

	@OriginalMember(owner = "client!agq", name = "g", descriptor = "(Lclient!ahb;I)V", line = 135)
	@Override
	public void method11698(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt1342 = arg0.method20269() * 1041055183;
		this.anInt1343 = arg0.method20275() * 856948829;
		this.anInt1345 = arg0.method20275() * -78001219;
		this.anInt1344 = arg0.method20275() * 618120789;
	}

	@OriginalMember(owner = "client!agq", name = "u", descriptor = "(Lclient!ahb;)V", line = 135)
	@Override
	public void method11693(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt1342 = arg0.method20269() * 1041055183;
		this.anInt1343 = arg0.method20275() * 856948829;
		this.anInt1345 = arg0.method20275() * -78001219;
		this.anInt1344 = arg0.method20275() * 618120789;
	}

	@OriginalMember(owner = "client!agq", name = "b", descriptor = "(Lclient!ahb;)V", line = 135)
	@Override
	public void method11695(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt1342 = arg0.method20269() * 1041055183;
		this.anInt1343 = arg0.method20275() * 856948829;
		this.anInt1345 = arg0.method20275() * -78001219;
		this.anInt1344 = arg0.method20275() * 618120789;
	}

	@OriginalMember(owner = "client!agq", name = "y", descriptor = "(Lclient!ahb;)V", line = 135)
	@Override
	public void method11699(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt1342 = arg0.method20269() * 1041055183;
		this.anInt1343 = arg0.method20275() * 856948829;
		this.anInt1345 = arg0.method20275() * -78001219;
		this.anInt1344 = arg0.method20275() * 618120789;
	}

	@OriginalMember(owner = "client!agq", name = "c", descriptor = "(Lclient!ahb;)V", line = 135)
	@Override
	public void method11691(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt1342 = arg0.method20269() * 1041055183;
		this.anInt1343 = arg0.method20275() * 856948829;
		this.anInt1345 = arg0.method20275() * -78001219;
		this.anInt1344 = arg0.method20275() * 618120789;
	}

	@OriginalMember(owner = "client!agq", name = "z", descriptor = "(Lclient!ahb;)V", line = 135)
	@Override
	public void method11702(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt1342 = arg0.method20269() * 1041055183;
		this.anInt1343 = arg0.method20275() * 856948829;
		this.anInt1345 = arg0.method20275() * -78001219;
		this.anInt1344 = arg0.method20275() * 618120789;
	}

	@OriginalMember(owner = "client!agq", name = "a", descriptor = "(B)V", line = 191)
	static final void method11730() {
		Class525.anInt5301 -= 1635947487;
	}
}
