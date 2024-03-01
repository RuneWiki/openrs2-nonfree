package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public class Class252 {

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	int anInt4182;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "J")
	long aLong254;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!io;)V", line = 9)
	Class252(@OriginalArg(0) Class240 arg0) {
		this.aLong254 = arg0.anInt3756;
		this.anInt4182 = 1;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([Lclient!io;)V", line = 14)
	Class252(@OriginalArg(0) Class240[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method25201(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "()I", line = 19)
	public final int method25198() {
		return this.anInt4182;
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "()I", line = 19)
	public final int method25204() {
		return this.anInt4182;
	}

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "(I)Lclient!io;", line = 23)
	public final Class240 method25197(@OriginalArg(0) int arg0) {
		return Class240.method24626(this.method25210(arg0));
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Lclient!io;", line = 23)
	public final Class240 method25199(@OriginalArg(0) int arg0) {
		return Class240.method24626(this.method25210(arg0));
	}

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "(I)Lclient!io;", line = 23)
	public final Class240 method25203(@OriginalArg(0) int arg0) {
		return Class240.method24626(this.method25210(arg0));
	}

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "(I)I", line = 27)
	final int method25205(@OriginalArg(0) int arg0) {
		return (int) (this.aLong254 >> Class240.anInt3759 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I", line = 27)
	final int method25206(@OriginalArg(0) int arg0) {
		return (int) (this.aLong254 >> Class240.anInt3759 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "(I)I", line = 27)
	final int method25209(@OriginalArg(0) int arg0) {
		return (int) (this.aLong254 >> Class240.anInt3759 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)I", line = 27)
	final int method25210(@OriginalArg(0) int arg0) {
		return (int) (this.aLong254 >> Class240.anInt3759 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "(Lclient!io;)V", line = 31)
	final void method25200(@OriginalArg(0) Class240 arg0) {
		this.aLong254 |= arg0.anInt3756 << Class240.anInt3759 * this.anInt4182++;
	}

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "(Lclient!io;)V", line = 31)
	final void method25201(@OriginalArg(0) Class240 arg0) {
		this.aLong254 |= arg0.anInt3756 << Class240.anInt3759 * this.anInt4182++;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Lclient!io;)V", line = 31)
	final void method25202(@OriginalArg(0) Class240 arg0) {
		this.aLong254 |= arg0.anInt3756 << Class240.anInt3759 * this.anInt4182++;
	}

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "(Lclient!io;)V", line = 31)
	final void method25207(@OriginalArg(0) Class240 arg0) {
		this.aLong254 |= arg0.anInt3756 << Class240.anInt3759 * this.anInt4182++;
	}

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "(Lclient!io;)V", line = 31)
	final void method25208(@OriginalArg(0) Class240 arg0) {
		this.aLong254 |= arg0.anInt3756 << Class240.anInt3759 * this.anInt4182++;
	}
}
