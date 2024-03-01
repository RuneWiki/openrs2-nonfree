package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public class Class561 {

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
	int anInt5360;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	int anInt5361;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "Z")
	boolean aBoolean825;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "Z")
	boolean aBoolean826;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(IIZZ)V", line = 9)
	Class561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt5360 = arg0 * -1814107211;
		this.anInt5361 = arg1 * 74580377;
		this.aBoolean825 = arg2;
		this.aBoolean826 = arg3;
	}

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "(I)I", line = 17)
	public int method32852() {
		return this.anInt5360 * -79762787;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)I", line = 21)
	public int method32853() {
		return this.anInt5361 * -1977630039;
	}

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "(Lclient!ahb;I)Lclient!kt;", line = 21)
	public static Class49 method32865(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20375();
		@Pc(10) Class277 local10 = Class3_Sub30.method11638()[arg0.method20269()];
		@Pc(17) Class276 local17 = Class400.method27575()[arg0.method20269()];
		@Pc(21) int local21 = arg0.method20272();
		@Pc(25) int local25 = arg0.method20272();
		return new Class49(local3, local10, local17, local21, local25);
	}

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "(B)Z", line = 25)
	public boolean method32851() {
		return this.aBoolean825;
	}

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "()Z", line = 25)
	public boolean method32856() {
		return this.aBoolean825;
	}

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "()Z", line = 25)
	public boolean method32857() {
		return this.aBoolean825;
	}

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "()Z", line = 25)
	public boolean method32861() {
		return this.aBoolean825;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "()Z", line = 29)
	public boolean method32854() {
		return this.aBoolean826;
	}

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "(S)Z", line = 29)
	public boolean method32855() {
		return this.aBoolean826;
	}

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "()Z", line = 29)
	public boolean method32858() {
		return this.aBoolean826;
	}

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "()Z", line = 29)
	public boolean method32859() {
		return this.aBoolean826;
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "()Z", line = 29)
	public boolean method32860() {
		return this.aBoolean826;
	}

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "()Z", line = 29)
	public boolean method32862() {
		return this.aBoolean826;
	}

	@OriginalMember(owner = "client!ws", name = "eb", descriptor = "(Lclient!vs;I)V", line = 4793)
	static final void method32863(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class80.method21592(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ws", name = "mq", descriptor = "(Lclient!vs;B)V", line = 6353)
	static final void method32864(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class403.method27632(local11, local14, arg0);
	}
}
