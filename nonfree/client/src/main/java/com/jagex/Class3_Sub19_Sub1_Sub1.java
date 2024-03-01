package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aof")
public final class Class3_Sub19_Sub1_Sub1 extends Class3_Sub19_Sub1 {

	@OriginalMember(owner = "client!aof", name = "z", descriptor = "[I")
	int[] anIntArray272 = null;

	@OriginalMember(owner = "client!aof", name = "j", descriptor = "[I")
	int[] anIntArray273 = null;

	@OriginalMember(owner = "client!aof", name = "c", descriptor = "Lclient!acd;")
	Class24_Sub1 aClass24_Sub1_2;

	@OriginalMember(owner = "client!aof", name = "<init>", descriptor = "(Lclient!acd;Lclient!fr;)V", line = 14)
	Class3_Sub19_Sub1_Sub1(@OriginalArg(0) Class24_Sub1 arg0, @OriginalArg(1) Class181 arg1) {
		super(arg1);
		this.aClass24_Sub1_2 = arg0;
		this.anIntArray272 = arg1.anIntArray373;
		this.anIntArray273 = arg1.anIntArray374;
	}

	@OriginalMember(owner = "client!aof", name = "p", descriptor = "(I)Z", line = 21)
	@Override
	public boolean method20811(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aof", name = "k", descriptor = "()I", line = 25)
	final int method20796() {
		return this.anIntArray272[this.aClass24_Sub1_2.method6628()];
	}

	@OriginalMember(owner = "client!aof", name = "at", descriptor = "()I", line = 29)
	final int method20795() {
		return this.anIntArray273[this.aClass24_Sub1_2.method6628()];
	}

	@OriginalMember(owner = "client!aof", name = "i", descriptor = "(I)I", line = 33)
	@Override
	public final int method20825(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray272[arg0];
		@Pc(9) int local9 = this.anIntArray273[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!aof", name = "x", descriptor = "(I)I", line = 33)
	@Override
	public final int method20815(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray272[arg0];
		@Pc(9) int local9 = this.anIntArray273[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!aof", name = "j", descriptor = "(I)I", line = 33)
	@Override
	public final int method20824(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray272[arg0];
		@Pc(9) int local9 = this.anIntArray273[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!aof", name = "n", descriptor = "(I)I", line = 33)
	@Override
	public final int method20814(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray272[arg0];
		@Pc(9) int local9 = this.anIntArray273[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!aof", name = "f", descriptor = "(I)I", line = 33)
	@Override
	public final int method20810(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray272[arg0];
		@Pc(9) int local9 = this.anIntArray273[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}
}
