package com.jagex;

import java.util.HashMap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xo")
public class Class650 {

	@OriginalMember(owner = "client!xo", name = "ka", descriptor = "I")
	static int anInt5740;

	@OriginalMember(owner = "client!xo", name = "tt", descriptor = "I")
	public static int anInt5741;

	@OriginalMember(owner = "client!xo", name = "c", descriptor = "Ljava/util/HashMap;")
	public HashMap aHashMap13;

	@OriginalMember(owner = "client!xo", name = "p", descriptor = "Lclient!lt;")
	Class386 aClass386_3;

	@OriginalMember(owner = "client!xo", name = "<init>", descriptor = "(Lclient!lt;)V", line = 11)
	public Class650(@OriginalArg(0) Class386 arg0) {
		this.method32884();
		this.aClass386_3 = arg0;
	}

	@OriginalMember(owner = "client!xo", name = "l", descriptor = "()V", line = 17)
	void method32883() {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class501.aClass501_4, 50);
	}

	@OriginalMember(owner = "client!xo", name = "p", descriptor = "(S)V", line = 17)
	void method32884() {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class501.aClass501_4, 50);
	}

	@OriginalMember(owner = "client!xo", name = "c", descriptor = "()V", line = 17)
	void method32885() {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class501.aClass501_4, 50);
	}

	@OriginalMember(owner = "client!xo", name = "v", descriptor = "()V", line = 17)
	void method32886() {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class501.aClass501_4, 50);
	}

	@OriginalMember(owner = "client!xo", name = "tt", descriptor = "(Lclient!yf;S)V", line = 8147)
	static final void method32887(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class77_Sub20 local18 = Class365.method28132(Class414.aClass414_55, client.aClass82_2.aClass16_1);
		local18.aClass77_Sub39_Sub1_2.method22408(local12);
		client.aClass82_2.method2004(local18);
	}

	@OriginalMember(owner = "client!xo", name = "aim", descriptor = "(Lclient!yf;I)V", line = 11023)
	static final void method32888(@OriginalArg(0) Class665 arg0) {
		if (Class706.aBoolean868) {
			@Pc(4) Class7[] local4 = Class295.method27035();
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local4.length;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}
}
