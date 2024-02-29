package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akl")
public final class Class77_Sub33 extends Class77 implements Interface62 {

	@OriginalMember(owner = "client!akl", name = "q", descriptor = "I")
	static final int anInt1727 = -1;

	@OriginalMember(owner = "client!akl", name = "d", descriptor = "C")
	char aChar11;

	@OriginalMember(owner = "client!akl", name = "x", descriptor = "I")
	int anInt1728;

	@OriginalMember(owner = "client!akl", name = "s", descriptor = "I")
	int anInt1729;

	@OriginalMember(owner = "client!akl", name = "r", descriptor = "J")
	long aLong93;

	@OriginalMember(owner = "client!akl", name = "g", descriptor = "I")
	int anInt1730;

	@OriginalMember(owner = "client!akl", name = "d", descriptor = "(IIIII)Lclient!aks;", line = 17)
	public static Class77_Sub36 method14159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class77_Sub36[] local2 = Class77_Sub36.aClass77_Sub36Array1;
		synchronized (Class77_Sub36.aClass77_Sub36Array1) {
			if (Class77_Sub36.anInt1775 * 2450901 == 0) {
				return new Class77_Sub36(arg0, arg1, arg2, arg3);
			} else {
				Class77_Sub36.aClass77_Sub36Array1[(Class77_Sub36.anInt1775 -= 1809361789) * 2450901].method14440(arg0, arg1, arg2, arg3);
				return Class77_Sub36.aClass77_Sub36Array1[Class77_Sub36.anInt1775 * 2450901];
			}
		}
	}

	@OriginalMember(owner = "client!akl", name = "<init>", descriptor = "()V", line = 175)
	Class77_Sub33() {
	}

	@OriginalMember(owner = "client!akl", name = "w", descriptor = "()I", line = 178)
	@Override
	public int method14145() {
		return this.anInt1728 * 1926402485;
	}

	@OriginalMember(owner = "client!akl", name = "p", descriptor = "(I)I", line = 178)
	@Override
	public int method14150() {
		return this.anInt1728 * 1926402485;
	}

	@OriginalMember(owner = "client!akl", name = "t", descriptor = "()C", line = 182)
	@Override
	public char method14151() {
		return this.aChar11;
	}

	@OriginalMember(owner = "client!akl", name = "q", descriptor = "()C", line = 182)
	@Override
	public char method14154() {
		return this.aChar11;
	}

	@OriginalMember(owner = "client!akl", name = "x", descriptor = "()C", line = 182)
	@Override
	public char method14153() {
		return this.aChar11;
	}

	@OriginalMember(owner = "client!akl", name = "c", descriptor = "(B)C", line = 182)
	@Override
	public char method14146() {
		return this.aChar11;
	}

	@OriginalMember(owner = "client!akl", name = "v", descriptor = "(B)I", line = 186)
	@Override
	public int method14158() {
		return this.anInt1729 * -387225769;
	}

	@OriginalMember(owner = "client!akl", name = "s", descriptor = "()I", line = 186)
	@Override
	public int method14152() {
		return this.anInt1729 * -387225769;
	}

	@OriginalMember(owner = "client!akl", name = "d", descriptor = "()I", line = 186)
	@Override
	public int method14147() {
		return this.anInt1729 * -387225769;
	}

	@OriginalMember(owner = "client!akl", name = "z", descriptor = "()J", line = 190)
	@Override
	public long method14155() {
		return this.aLong93 * -9064052320171598525L;
	}

	@OriginalMember(owner = "client!akl", name = "l", descriptor = "(I)J", line = 190)
	@Override
	public long method14148() {
		return this.aLong93 * -9064052320171598525L;
	}

	@OriginalMember(owner = "client!akl", name = "r", descriptor = "()I", line = 194)
	@Override
	public int method14156() {
		return this.anInt1730 * -923010969;
	}

	@OriginalMember(owner = "client!akl", name = "y", descriptor = "(B)I", line = 194)
	@Override
	public int method14149() {
		return this.anInt1730 * -923010969;
	}

	@OriginalMember(owner = "client!akl", name = "g", descriptor = "()I", line = 194)
	@Override
	public int method14157() {
		return this.anInt1730 * -923010969;
	}
}
