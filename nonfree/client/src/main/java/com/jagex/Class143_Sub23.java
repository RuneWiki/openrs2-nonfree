package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ame")
public class Class143_Sub23 extends Class143 {

	@OriginalMember(owner = "client!ame", name = "s", descriptor = "Lclient!dg;")
	static Class89 aClass89_2;

	@OriginalMember(owner = "client!ame", name = "<init>", descriptor = "(Lclient!akq;)V", line = 8)
	public Class143_Sub23(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ame", name = "<init>", descriptor = "(ILclient!akq;)V", line = 12)
	public Class143_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ame", name = "i", descriptor = "(I)V", line = 16)
	public void method15759() {
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			this.anInt2324 = Class329.aClass329_5.anInt4094 * 1931346361;
			return;
		}
		@Pc(20) int local20 = this.aClass77_Sub35_44.method14392().method36352();
		if (local20 < 245) {
			this.anInt2324 = Class329.aClass329_6.anInt4094 * 1931346361;
		}
		if (this.anInt2324 * 189295939 == Class329.aClass329_3.anInt4094 * 1453209707 && local20 < 500) {
			this.anInt2324 = Class329.aClass329_1.anInt4094 * 1931346361;
		}
		if (this.anInt2324 * 189295939 < Class329.aClass329_6.anInt4094 * 1453209707 || this.anInt2324 * 189295939 > Class329.aClass329_4.anInt4094 * 1453209707) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!ame", name = "e", descriptor = "()V", line = 16)
	public void method15760() {
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			this.anInt2324 = Class329.aClass329_5.anInt4094 * 1931346361;
			return;
		}
		@Pc(20) int local20 = this.aClass77_Sub35_44.method14392().method36352();
		if (local20 < 245) {
			this.anInt2324 = Class329.aClass329_6.anInt4094 * 1931346361;
		}
		if (this.anInt2324 * 189295939 == Class329.aClass329_3.anInt4094 * 1453209707 && local20 < 500) {
			this.anInt2324 = Class329.aClass329_1.anInt4094 * 1931346361;
		}
		if (this.anInt2324 * 189295939 < Class329.aClass329_6.anInt4094 * 1453209707 || this.anInt2324 * 189295939 > Class329.aClass329_4.anInt4094 * 1453209707) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!ame", name = "p", descriptor = "(I)I", line = 28)
	@Override
	int method16256() {
		return this.aClass77_Sub35_44.method14392().method36362() ? Class329.aClass329_5.anInt4094 * 1453209707 : Class329.aClass329_6.anInt4094 * 1453209707;
	}

	@OriginalMember(owner = "client!ame", name = "y", descriptor = "()I", line = 28)
	@Override
	int method16259() {
		return this.aClass77_Sub35_44.method14392().method36362() ? Class329.aClass329_5.anInt4094 * 1453209707 : Class329.aClass329_6.anInt4094 * 1453209707;
	}

	@OriginalMember(owner = "client!ame", name = "t", descriptor = "()I", line = 28)
	@Override
	int method16257() {
		return this.aClass77_Sub35_44.method14392().method36362() ? Class329.aClass329_5.anInt4094 * 1453209707 : Class329.aClass329_6.anInt4094 * 1453209707;
	}

	@OriginalMember(owner = "client!ame", name = "w", descriptor = "()I", line = 28)
	@Override
	int method16260() {
		return this.aClass77_Sub35_44.method14392().method36362() ? Class329.aClass329_5.anInt4094 * 1453209707 : Class329.aClass329_6.anInt4094 * 1453209707;
	}

	@OriginalMember(owner = "client!ame", name = "k", descriptor = "(I)Z", line = 33)
	public boolean method15761() {
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass77_Sub35_44.method14392().method36352();
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!ame", name = "o", descriptor = "()Z", line = 33)
	public boolean method15762() {
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass77_Sub35_44.method14392().method36352();
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!ame", name = "f", descriptor = "()Z", line = 33)
	public boolean method15763() {
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass77_Sub35_44.method14392().method36352();
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!ame", name = "c", descriptor = "(II)I", line = 40)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass77_Sub35_44.method14392().method36352();
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class329.aClass329_3.anInt4094 * 1453209707 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ame", name = "g", descriptor = "(I)I", line = 40)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass77_Sub35_44.method14392().method36352();
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class329.aClass329_3.anInt4094 * 1453209707 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ame", name = "s", descriptor = "(I)I", line = 40)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass77_Sub35_44.method14392().method36352();
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class329.aClass329_3.anInt4094 * 1453209707 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ame", name = "r", descriptor = "(I)I", line = 40)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass77_Sub35_44.method14392().method36352();
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class329.aClass329_3.anInt4094 * 1453209707 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ame", name = "z", descriptor = "(I)I", line = 40)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass77_Sub35_44.method14392().method36352();
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class329.aClass329_3.anInt4094 * 1453209707 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ame", name = "l", descriptor = "(II)V", line = 48)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ame", name = "q", descriptor = "(I)V", line = 48)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ame", name = "d", descriptor = "(I)V", line = 48)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ame", name = "x", descriptor = "(I)V", line = 48)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ame", name = "u", descriptor = "(I)I", line = 52)
	public int method15764() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!ame", name = "b", descriptor = "()I", line = 52)
	public int method15765() {
		return this.anInt2324 * 189295939;
	}
}
