package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ama")
public final class Class3_Sub22_Sub1 extends Class3_Sub22 {

	@OriginalMember(owner = "client!ama", name = "n", descriptor = "I")
	static int anInt2632;

	@OriginalMember(owner = "client!ama", name = "z", descriptor = "[Lclient!ama;")
	static Class3_Sub22_Sub1[] aClass3_Sub22_Sub1Array1 = new Class3_Sub22_Sub1[0];

	@OriginalMember(owner = "client!ama", name = "q", descriptor = "J")
	long aLong136;

	@OriginalMember(owner = "client!ama", name = "e", descriptor = "I")
	int anInt2633;

	@OriginalMember(owner = "client!ama", name = "r", descriptor = "I")
	int anInt2634;

	@OriginalMember(owner = "client!ama", name = "d", descriptor = "I")
	int anInt2635;

	@OriginalMember(owner = "client!ama", name = "m", descriptor = "I")
	int anInt2636;

	@OriginalMember(owner = "client!ama", name = "an", descriptor = "(I)V", line = 182)
	static void method18683(@OriginalArg(0) int arg0) {
		Class511.anInt5259 = arg0 * 694523433;
		aClass3_Sub22_Sub1Array1 = new Class3_Sub22_Sub1[arg0];
		anInt2632 = 0;
	}

	@OriginalMember(owner = "client!ama", name = "as", descriptor = "(I)V", line = 182)
	static void method18684(@OriginalArg(0) int arg0) {
		Class511.anInt5259 = arg0 * 694523433;
		aClass3_Sub22_Sub1Array1 = new Class3_Sub22_Sub1[arg0];
		anInt2632 = 0;
	}

	@OriginalMember(owner = "client!ama", name = "aj", descriptor = "(I)V", line = 182)
	static void method18686(@OriginalArg(0) int arg0) {
		Class511.anInt5259 = arg0 * 694523433;
		aClass3_Sub22_Sub1Array1 = new Class3_Sub22_Sub1[arg0];
		anInt2632 = 0;
	}

	@OriginalMember(owner = "client!ama", name = "aq", descriptor = "(IIIJI)Lclient!ama;", line = 188)
	static Class3_Sub22_Sub1 method18682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class3_Sub22_Sub1[] local2 = aClass3_Sub22_Sub1Array1;
		synchronized (aClass3_Sub22_Sub1Array1) {
			@Pc(12) Class3_Sub22_Sub1 local12;
			if (anInt2632 * -1771933737 == 0) {
				local12 = new Class3_Sub22_Sub1();
			} else {
				local12 = aClass3_Sub22_Sub1Array1[(anInt2632 -= 983364583) * -1771933737];
			}
			local12.anInt2633 = arg0 * -725828027;
			local12.anInt2634 = arg1 * 164664527;
			local12.anInt2635 = arg2 * -2134540119;
			local12.aLong136 = arg3 * 2578075271522973873L;
			local12.anInt2636 = arg4 * -1589676499;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ama", name = "ai", descriptor = "(IIIJI)Lclient!ama;", line = 188)
	static Class3_Sub22_Sub1 method18685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class3_Sub22_Sub1[] local2 = aClass3_Sub22_Sub1Array1;
		synchronized (aClass3_Sub22_Sub1Array1) {
			@Pc(12) Class3_Sub22_Sub1 local12;
			if (anInt2632 * -1771933737 == 0) {
				local12 = new Class3_Sub22_Sub1();
			} else {
				local12 = aClass3_Sub22_Sub1Array1[(anInt2632 -= 983364583) * -1771933737];
			}
			local12.anInt2633 = arg0 * -725828027;
			local12.anInt2634 = arg1 * 164664527;
			local12.anInt2635 = arg2 * -2134540119;
			local12.aLong136 = arg3 * 2578075271522973873L;
			local12.anInt2636 = arg4 * -1589676499;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ama", name = "<init>", descriptor = "()V", line = 201)
	Class3_Sub22_Sub1() {
	}

	@OriginalMember(owner = "client!ama", name = "p", descriptor = "(B)I", line = 204)
	@Override
	public int method19853() {
		return this.anInt2633 * -210000755;
	}

	@OriginalMember(owner = "client!ama", name = "y", descriptor = "()I", line = 204)
	@Override
	public int method19860() {
		return this.anInt2633 * -210000755;
	}

	@OriginalMember(owner = "client!ama", name = "u", descriptor = "()I", line = 204)
	@Override
	public int method19869() {
		return this.anInt2633 * -210000755;
	}

	@OriginalMember(owner = "client!ama", name = "b", descriptor = "()I", line = 208)
	@Override
	public int method19863() {
		return this.anInt2634 * -1649937873;
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(I)I", line = 208)
	@Override
	public int method19854() {
		return this.anInt2634 * -1649937873;
	}

	@OriginalMember(owner = "client!ama", name = "g", descriptor = "(I)I", line = 212)
	@Override
	public int method19867() {
		return this.anInt2635 * -1765334119;
	}

	@OriginalMember(owner = "client!ama", name = "c", descriptor = "()I", line = 212)
	@Override
	public int method19858() {
		return this.anInt2635 * -1765334119;
	}

	@OriginalMember(owner = "client!ama", name = "h", descriptor = "(I)J", line = 216)
	@Override
	public long method19857() {
		return this.aLong136 * 2986801039573962833L;
	}

	@OriginalMember(owner = "client!ama", name = "n", descriptor = "()J", line = 216)
	@Override
	public long method19852() {
		return this.aLong136 * 2986801039573962833L;
	}

	@OriginalMember(owner = "client!ama", name = "z", descriptor = "()J", line = 216)
	@Override
	public long method19855() {
		return this.aLong136 * 2986801039573962833L;
	}

	@OriginalMember(owner = "client!ama", name = "j", descriptor = "()J", line = 216)
	@Override
	public long method19864() {
		return this.aLong136 * 2986801039573962833L;
	}

	@OriginalMember(owner = "client!ama", name = "l", descriptor = "(I)I", line = 220)
	@Override
	public int method19856() {
		return this.anInt2636 * -725726811;
	}

	@OriginalMember(owner = "client!ama", name = "f", descriptor = "()I", line = 220)
	@Override
	public int method19865() {
		return this.anInt2636 * -725726811;
	}

	@OriginalMember(owner = "client!ama", name = "i", descriptor = "()I", line = 220)
	@Override
	public int method19866() {
		return this.anInt2636 * -725726811;
	}

	@OriginalMember(owner = "client!ama", name = "s", descriptor = "(I)V", line = 224)
	@Override
	public void method19859() {
		@Pc(2) Class3_Sub22_Sub1[] local2 = aClass3_Sub22_Sub1Array1;
		synchronized (aClass3_Sub22_Sub1Array1) {
			if (anInt2632 * -1771933737 < Class511.anInt5259 * -1992268263 - 1) {
				aClass3_Sub22_Sub1Array1[(anInt2632 += 983364583) * -1771933737 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ama", name = "k", descriptor = "()V", line = 224)
	@Override
	public void method19868() {
		@Pc(2) Class3_Sub22_Sub1[] local2 = aClass3_Sub22_Sub1Array1;
		synchronized (aClass3_Sub22_Sub1Array1) {
			if (anInt2632 * -1771933737 < Class511.anInt5259 * -1992268263 - 1) {
				aClass3_Sub22_Sub1Array1[(anInt2632 += 983364583) * -1771933737 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ama", name = "at", descriptor = "()V", line = 224)
	@Override
	public void method19861() {
		@Pc(2) Class3_Sub22_Sub1[] local2 = aClass3_Sub22_Sub1Array1;
		synchronized (aClass3_Sub22_Sub1Array1) {
			if (anInt2632 * -1771933737 < Class511.anInt5259 * -1992268263 - 1) {
				aClass3_Sub22_Sub1Array1[(anInt2632 += 983364583) * -1771933737 - 1] = this;
			}
		}
	}
}
