package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aip")
public class Class60_Sub22 extends Class60 {

	@OriginalMember(owner = "client!aip", name = "x", descriptor = "I")
	public static final int anInt1937 = 2;

	@OriginalMember(owner = "client!aip", name = "s", descriptor = "I")
	static final int anInt1938 = 1;

	@OriginalMember(owner = "client!aip", name = "u", descriptor = "I")
	public static final int anInt1939 = 0;

	@OriginalMember(owner = "client!aip", name = "d", descriptor = "Z")
	static boolean aBoolean340;

	@OriginalMember(owner = "client!aip", name = "<init>", descriptor = "(Lclient!aht;)V", line = 12)
	public Class60_Sub22(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aip", name = "<init>", descriptor = "(ILclient!aht;)V", line = 16)
	public Class60_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aip", name = "o", descriptor = "()V", line = 20)
	public void method13719() {
		if (this.anInt2079 * -1373670555 < 0 && this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aip", name = "v", descriptor = "(I)V", line = 20)
	public void method13720() {
		if (this.anInt2079 * -1373670555 < 0 && this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aip", name = "p", descriptor = "(I)I", line = 24)
	@Override
	int method14603() {
		return 1;
	}

	@OriginalMember(owner = "client!aip", name = "s", descriptor = "()I", line = 24)
	@Override
	int method14604() {
		return 1;
	}

	@OriginalMember(owner = "client!aip", name = "h", descriptor = "()I", line = 24)
	@Override
	int method14602() {
		return 1;
	}

	@OriginalMember(owner = "client!aip", name = "x", descriptor = "()I", line = 24)
	@Override
	int method14607() {
		return 1;
	}

	@OriginalMember(owner = "client!aip", name = "u", descriptor = "()I", line = 24)
	@Override
	int method14605() {
		return 1;
	}

	@OriginalMember(owner = "client!aip", name = "y", descriptor = "()I", line = 24)
	@Override
	int method14606() {
		return 1;
	}

	@OriginalMember(owner = "client!aip", name = "b", descriptor = "()I", line = 24)
	@Override
	int method14615() {
		return 1;
	}

	@OriginalMember(owner = "client!aip", name = "t", descriptor = "(I)Z", line = 28)
	public boolean method13718() {
		return true;
	}

	@OriginalMember(owner = "client!aip", name = "i", descriptor = "()Z", line = 28)
	public boolean method13721() {
		return true;
	}

	@OriginalMember(owner = "client!aip", name = "f", descriptor = "()Z", line = 28)
	public boolean method13722() {
		return true;
	}

	@OriginalMember(owner = "client!aip", name = "k", descriptor = "()Z", line = 28)
	public boolean method13723() {
		return true;
	}

	@OriginalMember(owner = "client!aip", name = "a", descriptor = "(IB)I", line = 32)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!aip", name = "c", descriptor = "(I)I", line = 32)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!aip", name = "z", descriptor = "(I)I", line = 32)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!aip", name = "n", descriptor = "(I)V", line = 37)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aip", name = "j", descriptor = "(I)V", line = 37)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aip", name = "l", descriptor = "(IB)V", line = 37)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aip", name = "w", descriptor = "(I)I", line = 41)
	public int method13717() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aip", name = "z", descriptor = "(I)Lclient!ww;", line = 136)
	public static Class564 method13724() {
		return Class338.aClass564_1 == null ? Class564.aClass564_5 : Class338.aClass564_1;
	}
}
