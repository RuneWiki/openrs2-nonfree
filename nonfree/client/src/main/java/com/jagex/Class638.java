package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public class Class638 implements Iterator {

	@OriginalMember(owner = "client!wi", name = "hq", descriptor = "Lclient!api;")
	public static Class32_Sub22 aClass32_Sub22_1;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
	int anInt5749;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[Lclient!wm;")
	Class640[] aClass640Array1;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([Lclient!wm;)V", line = 91)
	Class638(@OriginalArg(0) Class640[] arg0) {
		this.aClass640Array1 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "hasNext", descriptor = "()Z", line = 96)
	@Override
	public boolean hasNext() {
		return this.anInt5749 * 1030763051 < this.aClass640Array1.length;
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "()Z", line = 96)
	public boolean method32457() {
		return this.anInt5749 * 1030763051 < this.aClass640Array1.length;
	}

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "()Z", line = 96)
	public boolean method32458() {
		return this.anInt5749 * 1030763051 < this.aClass640Array1.length;
	}

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "()Ljava/lang/Object;", line = 100)
	public Object method32456() {
		return this.aClass640Array1[(this.anInt5749 += -1533215613) * 1030763051 - 1];
	}

	@OriginalMember(owner = "client!wi", name = "next", descriptor = "()Ljava/lang/Object;", line = 100)
	@Override
	public Object next() {
		return this.aClass640Array1[(this.anInt5749 += -1533215613) * 1030763051 - 1];
	}

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "()Ljava/lang/Object;", line = 100)
	public Object method32459() {
		return this.aClass640Array1[(this.anInt5749 += -1533215613) * 1030763051 - 1];
	}

	@OriginalMember(owner = "client!wi", name = "remove", descriptor = "()V", line = 104)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "()V", line = 104)
	public void method32460() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "()V", line = 104)
	public void method32461() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wi", name = "ax", descriptor = "(Lclient!yf;I)V", line = 4970)
	static final void method32462(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5888 -= 957530791;
	}

	@OriginalMember(owner = "client!wi", name = "tc", descriptor = "(Lclient!yf;I)V", line = 8370)
	static final void method32465(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		Class229.method25619(local16, arg0);
	}

	@OriginalMember(owner = "client!wi", name = "tw", descriptor = "(Lclient!hf;Lclient!yf;B)V", line = 8425)
	static final void method32463(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1) {
		arg1.anInt5891 -= -987882558;
		@Pc(15) int local15 = arg1.anIntArray519[arg1.anInt5891 * -1497248091] - 1;
		@Pc(25) int local25 = arg1.anIntArray519[arg1.anInt5891 * -1497248091 + 1];
		@Pc(35) int local35 = arg1.anIntArray519[arg1.anInt5891 * -1497248091 + 2];
		@Pc(47) int local47 = Math.max(1, arg1.anIntArray519[arg1.anInt5891 * -1497248091 + 3]);
		@Pc(53) float local53 = (float) local35 / (float) local47;
		@Pc(63) int local63 = arg1.anIntArray519[arg1.anInt5891 * -1497248091 + 4];
		@Pc(73) int local73 = arg1.anIntArray519[arg1.anInt5891 * -1497248091 + 5];
		@Pc(83) int local83 = arg1.anIntArray519[arg1.anInt5891 * -1497248091 + 6];
		@Pc(93) int local93 = arg1.anIntArray519[arg1.anInt5891 * -1497248091 + 7];
		@Pc(103) int local103 = arg1.anIntArray519[arg1.anInt5891 * -1497248091 + 8];
		@Pc(113) int local113 = arg1.anIntArray519[arg1.anInt5891 * -1497248091 + 9];
		if (arg0.anInt4001 * 1553054515 != 6) {
			throw new RuntimeException("");
		} else if (local15 >= 0 && local15 < 12) {
			Class420.method28740(arg0, local15, local25, local53, local63, local73, local83, local93, local103, local113);
			Class354.method27696(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wi", name = "um", descriptor = "(Lclient!yf;I)V", line = 8563)
	static final void method32464(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.method24971(local16) ? 1 : 0;
	}

	@OriginalMember(owner = "client!wi", name = "afs", descriptor = "(Lclient!yf;B)V", line = 10573)
	static final void method32466(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class93_Sub32.method13931((char) local12) ? 1 : 0;
	}
}
