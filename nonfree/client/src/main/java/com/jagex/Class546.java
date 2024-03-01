package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public class Class546 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sc", name = "this$0", descriptor = "Lclient!sz;")
	final Class565 this$0;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[S")
	short[] aShortArray131;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[Lclient!jg;")
	Class360[] aClass360Array2;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[Lclient!jg;")
	Class360[] aClass360Array1;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!jg;")
	Class360 aClass360_1;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	int anInt5290;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(Lclient!py;Lclient!xq;B)I", line = 12)
	static int method30973(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class667 arg1) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method32906() > 1) {
			@Pc(13) int local13 = arg0.method30063() - 1;
			return local13 * arg1.method32906() + arg0.method30062(local13);
		} else {
			return arg0.method30062(arg1.anInt5849 * -1772702343);
		}
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!sz;)V", line = 174)
	Class546(@OriginalArg(0) Class565 arg0) {
		this.this$0 = arg0;
		this.aShortArray131 = new short[2];
		this.aClass360Array2 = new Class360[16];
		this.aClass360Array1 = new Class360[16];
		this.aClass360_1 = new Class360(8);
		this.anInt5290 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(II)V", line = 177)
	void method30963(@OriginalArg(0) int arg0) {
		while (this.anInt5290 * -309545431 < arg0) {
			this.aClass360Array2[this.anInt5290 * -309545431] = new Class360(3);
			this.aClass360Array1[this.anInt5290 * -309545431] = new Class360(3);
			this.anInt5290 += -1740945895;
		}
	}

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "()V", line = 184)
	void method30962() {
		Class294.method26596(this.aShortArray131);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5290 * -309545431; local5++) {
			this.aClass360Array2[local5].method27793();
			this.aClass360Array1[local5].method27793();
		}
		this.aClass360_1.method27793();
	}

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "(B)V", line = 184)
	void method30964() {
		Class294.method26596(this.aShortArray131);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5290 * -309545431; local5++) {
			this.aClass360Array2[local5].method27793();
			this.aClass360Array1[local5].method27793();
		}
		this.aClass360_1.method27793();
	}

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "()V", line = 184)
	void method30966() {
		Class294.method26596(this.aShortArray131);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5290 * -309545431; local5++) {
			this.aClass360Array2[local5].method27793();
			this.aClass360Array1[local5].method27793();
		}
		this.aClass360_1.method27793();
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "()V", line = 184)
	void method30967() {
		Class294.method26596(this.aShortArray131);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5290 * -309545431; local5++) {
			this.aClass360Array2[local5].method27793();
			this.aClass360Array1[local5].method27793();
		}
		this.aClass360_1.method27793();
	}

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "()V", line = 184)
	void method30968() {
		Class294.method26596(this.aShortArray131);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5290 * -309545431; local5++) {
			this.aClass360Array2[local5].method27793();
			this.aClass360Array1[local5].method27793();
		}
		this.aClass360_1.method27793();
	}

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "(Lclient!jp;IB)I", line = 193)
	int method30965(@OriginalArg(0) Class365 arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg0.method27905(this.aShortArray131, 0) == 0) {
			return this.aClass360Array2[arg1].method27794(arg0);
		}
		@Pc(16) byte local16 = 8;
		@Pc(33) int local33;
		if (arg0.method27905(this.aShortArray131, 1) == 0) {
			local33 = local16 + this.aClass360Array1[arg1].method27794(arg0);
		} else {
			local33 = local16 + 8 + this.aClass360_1.method27794(arg0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!sc", name = "ar", descriptor = "(Ljava/lang/String;B)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;", line = 504)
	public static TwitchWebcamDevice method30970(@OriginalArg(0) String arg0) {
		if (Class625.aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(6) int local6 = 0; local6 < Class625.aTwitchWebcamDeviceArray1.length; local6++) {
			if (Class625.aTwitchWebcamDeviceArray1[local6].e.equals(arg0)) {
				return Class625.aTwitchWebcamDeviceArray1[local6];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "(S)V", line = 515)
	public static void method30969() {
		@Pc(2) Class240 local2 = Class658.aClass240_91;
		synchronized (Class658.aClass240_91) {
			Class658.aClass240_91.method25837();
		}
		local2 = Class658.aClass240_92;
		synchronized (Class658.aClass240_92) {
			Class658.aClass240_92.method25837();
		}
	}

	@OriginalMember(owner = "client!sc", name = "ip", descriptor = "(Lclient!yf;I)V", line = 6563)
	static final void method30975(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class293.method26592(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "zc", descriptor = "(Lclient!yf;I)V", line = 9565)
	static final void method30971(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(33) Class93_Sub22 local33 = Class102.method2592(Class446.aClass446_36, client.aClass175_1.aClass24_2);
		local33.aClass93_Sub41_Sub2_1.method22454(Class46.method894(local13) + Class46.method894(local27));
		local33.aClass93_Sub41_Sub2_1.method22402(local13);
		local33.aClass93_Sub41_Sub2_1.method22402(local27);
		client.aClass175_1.method24351(local33);
	}

	@OriginalMember(owner = "client!sc", name = "ayp", descriptor = "(Lclient!yf;B)V", line = 13984)
	static final void method30972(@OriginalArg(0) Class681 arg0) {
		@Pc(1) String local1 = null;
		if (Class120.aClass499_1 != null) {
			local1 = Class120.aClass499_1.method30140();
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local1;
	}

	@OriginalMember(owner = "client!sc", name = "ayl", descriptor = "(Lclient!yf;I)V", line = 14078)
	static final void method30974(@OriginalArg(0) Class681 arg0) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 0);
		Class106_Sub1.method5148();
		client.aBoolean601 = false;
	}
}
