package com.jagex;

import java.awt.Image;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
class Class267 implements Iterator {

	@OriginalMember(owner = "client!gb", name = "al", descriptor = "I")
	static int anInt3830;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!gb", name = "ch", descriptor = "Lclient!gm;")
	static Class277 aClass277_10;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	int anInt3829;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gb", name = "this$0", descriptor = "Lclient!adn;")
	final Class80_Sub1_Sub1 this$0;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!adn;)V", line = 60)
	Class267(@OriginalArg(0) Class80_Sub1_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "hasNext", descriptor = "()Z", line = 64)
	@Override
	public boolean hasNext() {
		return this.anInt3829 * -1170563701 < this.this$0.method18318();
	}

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "()Z", line = 64)
	public boolean method26470() {
		return this.anInt3829 * -1170563701 < this.this$0.method18318();
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()Z", line = 64)
	public boolean method26471() {
		return this.anInt3829 * -1170563701 < this.this$0.method18318();
	}

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "()Z", line = 64)
	public boolean method26472() {
		return this.anInt3829 * -1170563701 < this.this$0.method18318();
	}

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "()Z", line = 64)
	public boolean method26473() {
		return this.anInt3829 * -1170563701 < this.this$0.method18318();
	}

	@OriginalMember(owner = "client!gb", name = "next", descriptor = "()Ljava/lang/Object;", line = 68)
	@Override
	public Object next() {
		@Pc(11) int local11 = (this.anInt3829 += -2060443101) * -1170563701 - 1;
		@Pc(19) Class75_Sub2 local19 = (Class75_Sub2) this.this$0.aClass232_6.method25835((long) local11);
		return local19 == null ? this.this$0.method1651(local11) : local19;
	}

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "()Ljava/lang/Object;", line = 68)
	public Object method26474() {
		@Pc(11) int local11 = (this.anInt3829 += -2060443101) * -1170563701 - 1;
		@Pc(19) Class75_Sub2 local19 = (Class75_Sub2) this.this$0.aClass232_6.method25835((long) local11);
		return local19 == null ? this.this$0.method1651(local11) : local19;
	}

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "()Ljava/lang/Object;", line = 68)
	public Object method26475() {
		@Pc(11) int local11 = (this.anInt3829 += -2060443101) * -1170563701 - 1;
		@Pc(19) Class75_Sub2 local19 = (Class75_Sub2) this.this$0.aClass232_6.method25835((long) local11);
		return local19 == null ? this.this$0.method1651(local11) : local19;
	}

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "()V", line = 75)
	public void method26476() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!gb", name = "remove", descriptor = "()V", line = 75)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "()V", line = 75)
	public void method26477() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!gb", name = "uo", descriptor = "(Lclient!yf;I)V", line = 8173)
	static final void method26478(@OriginalArg(0) Class665 arg0) {
		Class94_Sub4.aClass261_1.method26352(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
	}

	@OriginalMember(owner = "client!gb", name = "akl", descriptor = "(Lclient!yf;B)V", line = 11270)
	static final void method26479(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub22.method18346(client.anInt3390 * -1850530127) ? 1 : 0;
	}

	@OriginalMember(owner = "client!gb", name = "arl", descriptor = "(Lclient!yf;I)V", line = 12491)
	static final void method26480(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub36_1.method16112();
	}
}
