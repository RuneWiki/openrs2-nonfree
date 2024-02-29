package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anh")
public class Class35_Sub4 extends Class35 {

	@OriginalMember(owner = "client!anh", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;Lclient!pw;)V", line = 13)
	public Class35_Sub4(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) Class478 arg3) {
		super(arg0, arg1, arg2, Class647.aClass647_44, 64, new Class144_Sub1(arg3));
	}

	@OriginalMember(owner = "client!anh", name = "au", descriptor = "(I)V", line = 17)
	public void method16771(@OriginalArg(0) int arg0) {
		((Class144) this.anInterface5_26).method14994(arg0);
	}

	@OriginalMember(owner = "client!anh", name = "ak", descriptor = "(I)V", line = 17)
	public void method16772(@OriginalArg(0) int arg0) {
		((Class144) this.anInterface5_26).method14994(arg0);
	}

	@OriginalMember(owner = "client!anh", name = "ao", descriptor = "(II)V", line = 17)
	public void method16773(@OriginalArg(0) int arg0) {
		((Class144) this.anInterface5_26).method14994(arg0);
	}

	@OriginalMember(owner = "client!anh", name = "ax", descriptor = "(I)V", line = 17)
	public void method16774(@OriginalArg(0) int arg0) {
		((Class144) this.anInterface5_26).method14994(arg0);
	}

	@OriginalMember(owner = "client!anh", name = "d", descriptor = "(I)V", line = 21)
	@Override
	public void method18331() {
		super.method18331();
		((Class144) this.anInterface5_26).method14995();
	}

	@OriginalMember(owner = "client!anh", name = "j", descriptor = "()V", line = 21)
	@Override
	public void method18329() {
		super.method18331();
		((Class144) this.anInterface5_26).method14995();
	}

	@OriginalMember(owner = "client!anh", name = "k", descriptor = "()V", line = 21)
	@Override
	public void method18328() {
		super.method18331();
		((Class144) this.anInterface5_26).method14995();
	}

	@OriginalMember(owner = "client!anh", name = "i", descriptor = "()V", line = 21)
	@Override
	public void method18330() {
		super.method18331();
		((Class144) this.anInterface5_26).method14995();
	}

	@OriginalMember(owner = "client!anh", name = "u", descriptor = "()V", line = 21)
	@Override
	public void method18332() {
		super.method18331();
		((Class144) this.anInterface5_26).method14995();
	}

	@OriginalMember(owner = "client!anh", name = "g", descriptor = "(IS)V", line = 26)
	@Override
	public void method18333(@OriginalArg(0) int arg0) {
		super.method18333(arg0);
		((Class144) this.anInterface5_26).method14997(arg0);
	}

	@OriginalMember(owner = "client!anh", name = "e", descriptor = "(I)V", line = 26)
	@Override
	public void method18334(@OriginalArg(0) int arg0) {
		super.method18333(arg0);
		((Class144) this.anInterface5_26).method14997(arg0);
	}

	@OriginalMember(owner = "client!anh", name = "f", descriptor = "(I)V", line = 26)
	@Override
	public void method18335(@OriginalArg(0) int arg0) {
		super.method18333(arg0);
		((Class144) this.anInterface5_26).method14997(arg0);
	}

	@OriginalMember(owner = "client!anh", name = "m", descriptor = "()V", line = 31)
	@Override
	public void method18341() {
		super.method18336();
		((Class144) this.anInterface5_26).method15002();
	}

	@OriginalMember(owner = "client!anh", name = "z", descriptor = "(I)V", line = 31)
	@Override
	public void method18336() {
		super.method18336();
		((Class144) this.anInterface5_26).method15002();
	}

	@OriginalMember(owner = "client!anh", name = "o", descriptor = "()V", line = 31)
	@Override
	public void method18337() {
		super.method18336();
		((Class144) this.anInterface5_26).method15002();
	}

	@OriginalMember(owner = "client!anh", name = "n", descriptor = "()V", line = 31)
	@Override
	public void method18339() {
		super.method18336();
		((Class144) this.anInterface5_26).method15002();
	}

	@OriginalMember(owner = "client!anh", name = "a", descriptor = "()V", line = 31)
	@Override
	public void method18340() {
		super.method18336();
		((Class144) this.anInterface5_26).method15002();
	}

	@OriginalMember(owner = "client!anh", name = "b", descriptor = "()V", line = 31)
	@Override
	public void method18338() {
		super.method18336();
		((Class144) this.anInterface5_26).method15002();
	}

	@OriginalMember(owner = "client!anh", name = "g", descriptor = "(II)V", line = 127)
	public static void method16775(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(9, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!anh", name = "ec", descriptor = "(Lclient!yf;I)V", line = 5346)
	static final void method16776(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class600.method32039(local11, local14, arg0);
	}
}
