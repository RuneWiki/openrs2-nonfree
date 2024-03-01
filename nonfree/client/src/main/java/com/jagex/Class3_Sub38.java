package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agx")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!agx", name = "y", descriptor = "I")
	public static final int anInt1346 = 32;

	@OriginalMember(owner = "client!agx", name = "h", descriptor = "I")
	public static final int anInt1347 = 2;

	@OriginalMember(owner = "client!agx", name = "x", descriptor = "I")
	public static final int anInt1348 = 4;

	@OriginalMember(owner = "client!agx", name = "s", descriptor = "I")
	public static final int anInt1349 = 8;

	@OriginalMember(owner = "client!agx", name = "u", descriptor = "I")
	public static final int anInt1350 = 16;

	@OriginalMember(owner = "client!agx", name = "l", descriptor = "I")
	public static final int anInt1351 = 1;

	@OriginalMember(owner = "client!agx", name = "b", descriptor = "I")
	public static final int anInt1352 = 64;

	@OriginalMember(owner = "client!agx", name = "c", descriptor = "Lclient!agx;")
	static final Class3_Sub38 aClass3_Sub38_1 = new Class3_Sub38(0, -1);

	@OriginalMember(owner = "client!agx", name = "z", descriptor = "I")
	public final int anInt1353;

	@OriginalMember(owner = "client!agx", name = "j", descriptor = "I")
	public final int anInt1354;

	@OriginalMember(owner = "client!agx", name = "<init>", descriptor = "(II)V", line = 17)
	public Class3_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1353 = arg0 * -639019741;
		this.anInt1354 = arg1 * 26926825;
	}

	@OriginalMember(owner = "client!agx", name = "p", descriptor = "(B)Z", line = 23)
	public final boolean method11804() {
		return (this.anInt1353 * 1263633035 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "y", descriptor = "()Z", line = 23)
	public final boolean method11811() {
		return (this.anInt1353 * 1263633035 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "c", descriptor = "(I)Z", line = 27)
	public final boolean method11805(@OriginalArg(0) int arg0) {
		return (this.anInt1353 * 1263633035 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "a", descriptor = "(IB)Z", line = 27)
	public final boolean method11807(@OriginalArg(0) int arg0) {
		return (this.anInt1353 * 1263633035 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "b", descriptor = "(I)Z", line = 27)
	public final boolean method11814(@OriginalArg(0) int arg0) {
		return (this.anInt1353 * 1263633035 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "g", descriptor = "(I)I", line = 31)
	public final int method11806() {
		return Class3_Sub40.method19106(this.anInt1353 * 1263633035);
	}

	@OriginalMember(owner = "client!agx", name = "z", descriptor = "(I)I", line = 35)
	static final int method11813(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!agx", name = "j", descriptor = "()I", line = 39)
	public final int method11817() {
		return this.anInt1353 * 1263633035 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!agx", name = "h", descriptor = "(B)I", line = 39)
	public final int method11818() {
		return this.anInt1353 * 1263633035 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!agx", name = "x", descriptor = "(I)Z", line = 43)
	public final boolean method11808() {
		return (this.anInt1353 * 1263633035 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "f", descriptor = "()Z", line = 43)
	public final boolean method11812() {
		return (this.anInt1353 * 1263633035 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "i", descriptor = "()Z", line = 43)
	public final boolean method11815() {
		return (this.anInt1353 * 1263633035 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "n", descriptor = "()Z", line = 43)
	public final boolean method11816() {
		return (this.anInt1353 * 1263633035 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "k", descriptor = "()Z", line = 47)
	public final boolean method11803() {
		return (this.anInt1353 * 1263633035 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "s", descriptor = "(B)Z", line = 47)
	public final boolean method11809() {
		return (this.anInt1353 * 1263633035 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!agx", name = "u", descriptor = "(B)Z", line = 51)
	public final boolean method11810() {
		return (this.anInt1353 * 1263633035 >> 23 & 0x1) != 0;
	}
}
