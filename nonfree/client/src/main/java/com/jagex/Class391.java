package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lz")
public class Class391 {

	@OriginalMember(owner = "client!lz", name = "c", descriptor = "J")
	long aLong265;

	@OriginalMember(owner = "client!lz", name = "p", descriptor = "I")
	int anInt4592;

	@OriginalMember(owner = "client!lz", name = "<init>", descriptor = "(Lclient!ku;)V", line = 9)
	Class391(@OriginalArg(0) Class366 arg0) {
		this.aLong265 = arg0.anInt4537;
		this.anInt4592 = 1;
	}

	@OriginalMember(owner = "client!lz", name = "<init>", descriptor = "([Lclient!ku;)V", line = 14)
	Class391(@OriginalArg(0) Class366[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method28373(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!lz", name = "p", descriptor = "()I", line = 19)
	public final int method28364() {
		return this.anInt4592;
	}

	@OriginalMember(owner = "client!lz", name = "y", descriptor = "(I)Lclient!ku;", line = 23)
	public final Class366 method28365(@OriginalArg(0) int arg0) {
		return Class366.method28139(this.method28368(arg0));
	}

	@OriginalMember(owner = "client!lz", name = "w", descriptor = "(I)Lclient!ku;", line = 23)
	public final Class366 method28366(@OriginalArg(0) int arg0) {
		return Class366.method28139(this.method28368(arg0));
	}

	@OriginalMember(owner = "client!lz", name = "c", descriptor = "(I)Lclient!ku;", line = 23)
	public final Class366 method28367(@OriginalArg(0) int arg0) {
		return Class366.method28139(this.method28368(arg0));
	}

	@OriginalMember(owner = "client!lz", name = "v", descriptor = "(I)I", line = 27)
	final int method28368(@OriginalArg(0) int arg0) {
		return (int) (this.aLong265 >> Class366.anInt4541 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lz", name = "t", descriptor = "(I)I", line = 27)
	final int method28369(@OriginalArg(0) int arg0) {
		return (int) (this.aLong265 >> Class366.anInt4541 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lz", name = "q", descriptor = "(I)I", line = 27)
	final int method28370(@OriginalArg(0) int arg0) {
		return (int) (this.aLong265 >> Class366.anInt4541 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lz", name = "x", descriptor = "(I)I", line = 27)
	final int method28371(@OriginalArg(0) int arg0) {
		return (int) (this.aLong265 >> Class366.anInt4541 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lz", name = "g", descriptor = "(Lclient!ku;)V", line = 31)
	final void method28372(@OriginalArg(0) Class366 arg0) {
		this.aLong265 |= arg0.anInt4537 << Class366.anInt4541 * this.anInt4592++;
	}

	@OriginalMember(owner = "client!lz", name = "l", descriptor = "(Lclient!ku;)V", line = 31)
	final void method28373(@OriginalArg(0) Class366 arg0) {
		this.aLong265 |= arg0.anInt4537 << Class366.anInt4541 * this.anInt4592++;
	}

	@OriginalMember(owner = "client!lz", name = "d", descriptor = "(Lclient!ku;)V", line = 31)
	final void method28374(@OriginalArg(0) Class366 arg0) {
		this.aLong265 |= arg0.anInt4537 << Class366.anInt4541 * this.anInt4592++;
	}

	@OriginalMember(owner = "client!lz", name = "s", descriptor = "(Lclient!ku;)V", line = 31)
	final void method28375(@OriginalArg(0) Class366 arg0) {
		this.aLong265 |= arg0.anInt4537 << Class366.anInt4541 * this.anInt4592++;
	}

	@OriginalMember(owner = "client!lz", name = "r", descriptor = "(Lclient!ku;)V", line = 31)
	final void method28376(@OriginalArg(0) Class366 arg0) {
		this.aLong265 |= arg0.anInt4537 << Class366.anInt4541 * this.anInt4592++;
	}
}
