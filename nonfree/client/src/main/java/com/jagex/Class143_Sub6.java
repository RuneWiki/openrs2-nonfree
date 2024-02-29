package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ali")
public class Class143_Sub6 extends Class143 {

	@OriginalMember(owner = "client!ali", name = "w", descriptor = "Z")
	boolean aBoolean353 = true;

	@OriginalMember(owner = "client!ali", name = "t", descriptor = "Z")
	public boolean aBoolean354 = false;

	@OriginalMember(owner = "client!ali", name = "<init>", descriptor = "(Lclient!akq;)V", line = 13)
	public Class143_Sub6(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ali", name = "<init>", descriptor = "(ILclient!akq;)V", line = 17)
	public Class143_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ali", name = "i", descriptor = "(B)V", line = 21)
	public void method15105() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 5 || this.anInt2324 * 189295939 == 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!ali", name = "o", descriptor = "()V", line = 21)
	public void method15106() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 5 || this.anInt2324 * 189295939 == 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!ali", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method16256() {
		this.aBoolean354 = true;
		return this.aClass77_Sub35_44.method14392().method36360() ? 3 : 1;
	}

	@OriginalMember(owner = "client!ali", name = "y", descriptor = "()I", line = 25)
	@Override
	int method16259() {
		this.aBoolean354 = true;
		return this.aClass77_Sub35_44.method14392().method36360() ? 3 : 1;
	}

	@OriginalMember(owner = "client!ali", name = "t", descriptor = "()I", line = 25)
	@Override
	int method16257() {
		this.aBoolean354 = true;
		return this.aClass77_Sub35_44.method14392().method36360() ? 3 : 1;
	}

	@OriginalMember(owner = "client!ali", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16260() {
		this.aBoolean354 = true;
		return this.aClass77_Sub35_44.method14392().method36360() ? 3 : 1;
	}

	@OriginalMember(owner = "client!ali", name = "k", descriptor = "(B)Z", line = 31)
	public boolean method15107() {
		return true;
	}

	@OriginalMember(owner = "client!ali", name = "b", descriptor = "()Z", line = 31)
	public boolean method15108() {
		return true;
	}

	@OriginalMember(owner = "client!ali", name = "z", descriptor = "(I)I", line = 35)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class155.method23614().method30918("jagdx") ? 3 : 2;
	}

	@OriginalMember(owner = "client!ali", name = "c", descriptor = "(II)I", line = 35)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class155.method23614().method30918("jagdx") ? 3 : 2;
	}

	@OriginalMember(owner = "client!ali", name = "s", descriptor = "(I)I", line = 35)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class155.method23614().method30918("jagdx") ? 3 : 2;
	}

	@OriginalMember(owner = "client!ali", name = "r", descriptor = "(I)I", line = 35)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class155.method23614().method30918("jagdx") ? 3 : 2;
	}

	@OriginalMember(owner = "client!ali", name = "g", descriptor = "(I)I", line = 35)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class155.method23614().method30918("jagdx") ? 3 : 2;
	}

	@OriginalMember(owner = "client!ali", name = "l", descriptor = "(II)V", line = 40)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.aBoolean354 = false;
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ali", name = "q", descriptor = "(I)V", line = 40)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.aBoolean354 = false;
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ali", name = "d", descriptor = "(I)V", line = 40)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.aBoolean354 = false;
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ali", name = "x", descriptor = "(I)V", line = 40)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.aBoolean354 = false;
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ali", name = "u", descriptor = "(I)I", line = 45)
	public int method15109() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!ali", name = "n", descriptor = "()I", line = 45)
	public int method15110() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!ali", name = "a", descriptor = "()I", line = 45)
	public int method15111() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!ali", name = "m", descriptor = "()Z", line = 49)
	boolean method15112() {
		return this.aBoolean353;
	}

	@OriginalMember(owner = "client!ali", name = "e", descriptor = "(I)Z", line = 49)
	boolean method15113() {
		return this.aBoolean353;
	}

	@OriginalMember(owner = "client!ali", name = "f", descriptor = "(ZI)V", line = 53)
	public void method15114(@OriginalArg(0) boolean arg0) {
		this.aBoolean353 = arg0;
	}

	@OriginalMember(owner = "client!ali", name = "h", descriptor = "(Z)V", line = 53)
	public void method15115(@OriginalArg(0) boolean arg0) {
		this.aBoolean353 = arg0;
	}

	@OriginalMember(owner = "client!ali", name = "aj", descriptor = "(Z)V", line = 53)
	public void method15116(@OriginalArg(0) boolean arg0) {
		this.aBoolean353 = arg0;
	}

	@OriginalMember(owner = "client!ali", name = "y", descriptor = "(JII)Ljava/lang/String;", line = 84)
	public static String method15117(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class694.method36377(arg0);
		@Pc(5) int local5 = Class61.aCalendar2.get(11);
		@Pc(9) int local9 = Class61.aCalendar2.get(12);
		@Pc(13) int local13 = Class61.aCalendar2.get(13);
		return Integer.toString(local5 / 10) + local5 % 10 + ":" + local9 / 10 + local9 % 10 + ":" + local13 / 10 + local13 % 10;
	}

	@OriginalMember(owner = "client!ali", name = "agt", descriptor = "(Lclient!yf;B)V", line = 10445)
	static final void method15118(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class615.aClass465_1.method29551(local13).anIntArray288[local23];
	}
}
