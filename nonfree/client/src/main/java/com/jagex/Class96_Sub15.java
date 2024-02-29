package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afr")
public class Class96_Sub15 extends Class96 {

	@OriginalMember(owner = "client!afr", name = "ph", descriptor = "I")
	static int anInt893;

	@OriginalMember(owner = "client!afr", name = "c", descriptor = "I")
	final int anInt888;

	@OriginalMember(owner = "client!afr", name = "v", descriptor = "I")
	final int anInt889;

	@OriginalMember(owner = "client!afr", name = "l", descriptor = "I")
	final int anInt890;

	@OriginalMember(owner = "client!afr", name = "y", descriptor = "I")
	final int anInt891;

	@OriginalMember(owner = "client!afr", name = "w", descriptor = "I")
	final int anInt892;

	@OriginalMember(owner = "client!afr", name = "<init>", descriptor = "(Lclient!akv;)V", line = 13)
	Class96_Sub15(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt888 = arg0.method22483() * -949564249;
		@Pc(13) int local13 = arg0.method22500();
		this.anInt889 = (local13 >>> 16) * -292605581;
		this.anInt890 = (local13 & 0xFFFF) * -337019611;
		this.anInt891 = arg0.method22478() * -1735220489;
		this.anInt892 = arg0.method22478() * 1439041887;
	}

	@OriginalMember(owner = "client!afr", name = "w", descriptor = "()V", line = 23)
	@Override
	public void method19913() {
		Class128_Sub1.aClass225Array1[this.anInt888 * 1881283351].method25777(this.anInt891 * -1552892217, this.anInt889 * -316580933, this.anInt890 * -1933814099, this.anInt892 * 1884852895);
	}

	@OriginalMember(owner = "client!afr", name = "c", descriptor = "(I)V", line = 23)
	@Override
	public void method19911() {
		Class128_Sub1.aClass225Array1[this.anInt888 * 1881283351].method25777(this.anInt891 * -1552892217, this.anInt889 * -316580933, this.anInt890 * -1933814099, this.anInt892 * 1884852895);
	}

	@OriginalMember(owner = "client!afr", name = "y", descriptor = "()V", line = 23)
	@Override
	public void method19912() {
		Class128_Sub1.aClass225Array1[this.anInt888 * 1881283351].method25777(this.anInt891 * -1552892217, this.anInt889 * -316580933, this.anInt890 * -1933814099, this.anInt892 * 1884852895);
	}
}
