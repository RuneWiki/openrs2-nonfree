package com.jagex;

import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public abstract class Class27 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!hs", name = "this$0", descriptor = "Lclient!hc;")
	final Class217 this$0;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
	int anInt2228;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
	int anInt2227;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!hc;II)V", line = 178)
	Class27(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.this$0 = arg0;
		this.anInt2228 = arg1 * 677187269;
		this.anInt2227 = arg2 * -334465001;
	}

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "(I)Lclient!vs;", line = 182)
	static final Class536 method15271() {
		if (Class525.anInt5301 * 982706207 == Class525.anArrayList3.size()) {
			Class525.anArrayList3.add(new Class536());
		}
		@Pc(18) Class536 local18 = (Class536) Class525.anArrayList3.get(Class525.anInt5301 * 982706207);
		Class525.anInt5301 += 1635947487;
		return local18;
	}

	@OriginalMember(owner = "client!hs", name = "rt", descriptor = "(Lclient!vs;I)V", line = 7264)
	static final void method15272(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >>> 16];
		@Pc(27) Class178 local27 = Class356.method26654(local22, local16);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local27 == null ? -1 : local27.anInt3570 * 954808515;
	}

	@OriginalMember(owner = "client!hs", name = "afr", descriptor = "(Lclient!vs;I)V", line = 9855)
	static final void method15273(@OriginalArg(0) Class536 arg0) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "(Ljava/awt/Graphics;B)V")
	abstract void method15267(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method15268(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method15269(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method15270(@OriginalArg(0) Graphics arg0);
}
