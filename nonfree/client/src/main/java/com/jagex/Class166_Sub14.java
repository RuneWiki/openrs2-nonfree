package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amn")
public class Class166_Sub14 extends Class166 {

	@OriginalMember(owner = "client!amn", name = "u", descriptor = "I")
	public static final int anInt2154 = 0;

	@OriginalMember(owner = "client!amn", name = "w", descriptor = "I")
	static final int anInt2155 = 2;

	@OriginalMember(owner = "client!amn", name = "l", descriptor = "I")
	public static final int anInt2156 = 1;

	@OriginalMember(owner = "client!amn", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub14(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amn", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amn", name = "o", descriptor = "(B)V", line = 21)
	public void method15651() {
		if (this.aClass93_Sub36_49.method14359() != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.aClass93_Sub36_49.method14365().method146()) {
			if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
				this.anInt2379 = this.method16542() * -88839937;
			}
		} else if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amn", name = "q", descriptor = "()V", line = 21)
	public void method15655() {
		if (this.aClass93_Sub36_49.method14359() != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.aClass93_Sub36_49.method14365().method146()) {
			if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
				this.anInt2379 = this.method16542() * -88839937;
			}
		} else if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amn", name = "x", descriptor = "()V", line = 21)
	public void method15656() {
		if (this.aClass93_Sub36_49.method14359() != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.aClass93_Sub36_49.method14365().method146()) {
			if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
				this.anInt2379 = this.method16542() * -88839937;
			}
		} else if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amn", name = "l", descriptor = "()I", line = 31)
	@Override
	int method16547() {
		return 1;
	}

	@OriginalMember(owner = "client!amn", name = "w", descriptor = "()I", line = 31)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!amn", name = "f", descriptor = "()I", line = 31)
	@Override
	int method16541() {
		return 1;
	}

	@OriginalMember(owner = "client!amn", name = "u", descriptor = "()I", line = 31)
	@Override
	int method16548() {
		return 1;
	}

	@OriginalMember(owner = "client!amn", name = "e", descriptor = "(B)I", line = 31)
	@Override
	int method16542() {
		return 1;
	}

	@OriginalMember(owner = "client!amn", name = "b", descriptor = "()Z", line = 35)
	public boolean method15652() {
		return this.aClass93_Sub36_49.method14359() == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!amn", name = "s", descriptor = "(B)Z", line = 35)
	public boolean method15653() {
		return this.aClass93_Sub36_49.method14359() == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!amn", name = "n", descriptor = "(II)I", line = 40)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14359() == Class702.aClass702_6) {
			return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!amn", name = "p", descriptor = "(I)I", line = 40)
	@Override
	public int method16540(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14359() == Class702.aClass702_6) {
			return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!amn", name = "z", descriptor = "(I)I", line = 40)
	@Override
	public int method16549(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14359() == Class702.aClass702_6) {
			return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!amn", name = "k", descriptor = "(II)V", line = 48)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amn", name = "d", descriptor = "(I)V", line = 48)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amn", name = "c", descriptor = "(I)V", line = 48)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amn", name = "y", descriptor = "(I)I", line = 52)
	public int method15654() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amn", name = "ap", descriptor = "(Lclient!arm;I)I", line = 1087)
	public static int method15657(@OriginalArg(0) Class93_Sub1_Sub7 arg0) {
		if (Class454.aBoolean773) {
			return 6;
		} else if (arg0 == null) {
			return 0;
		} else {
			@Pc(13) int local13 = arg0.anInt3012 * -92627949;
			if (Class702.method36720(local13)) {
				return 1;
			} else if (Class664.method32883(local13)) {
				return 2;
			} else if (Class118.method8413(local13)) {
				return 3;
			} else if (Class110_Sub6.method7672(local13)) {
				return 4;
			} else if (Class434.method28801(local13)) {
				return 7;
			} else if (local13 == 16) {
				return 8;
			} else {
				return 5;
			}
		}
	}
}
