package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yv")
public class Class678 {

	@OriginalMember(owner = "client!yv", name = "p", descriptor = "Lclient!vh;")
	final Class595 aClass595_4;

	@OriginalMember(owner = "client!yv", name = "c", descriptor = "I")
	final int anInt5804;

	@OriginalMember(owner = "client!yv", name = "v", descriptor = "I")
	final int anInt5805;

	@OriginalMember(owner = "client!yv", name = "<init>", descriptor = "(Lclient!vh;III)V", line = 12)
	public Class678(@OriginalArg(0) Class595 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass595_4 = arg0;
		this.anInt5804 = arg1 * 1832602797;
		this.anInt5805 = arg3 * -583340817;
	}

	@OriginalMember(owner = "client!yv", name = "p", descriptor = "(I)I", line = 19)
	int method36018() {
		return client.anIntArray326[this.anInt5804 * -526387419];
	}

	@OriginalMember(owner = "client!yv", name = "l", descriptor = "()I", line = 19)
	int method36019() {
		return client.anIntArray326[this.anInt5804 * -526387419];
	}

	@OriginalMember(owner = "client!yv", name = "y", descriptor = "()I", line = 19)
	int method36020() {
		return client.anIntArray326[this.anInt5804 * -526387419];
	}

	@OriginalMember(owner = "client!yv", name = "c", descriptor = "(B)Lclient!sy;", line = 23)
	public Interface61 method36021() {
		@Pc(3) Interface61 local3 = this.method36024();
		if (local3 == null) {
			return null;
		} else if (local3.method13060() == this.anInt5805 * -68042225) {
			return local3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "t", descriptor = "()Lclient!sy;", line = 23)
	public Interface61 method36022() {
		@Pc(3) Interface61 local3 = this.method36024();
		if (local3 == null) {
			return null;
		} else if (local3.method13060() == this.anInt5805 * -68042225) {
			return local3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "w", descriptor = "()Lclient!sy;", line = 23)
	public Interface61 method36023() {
		@Pc(3) Interface61 local3 = this.method36024();
		if (local3 == null) {
			return null;
		} else if (local3.method13060() == this.anInt5805 * -68042225) {
			return local3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "v", descriptor = "(I)Lclient!sy;", line = 30)
	Interface61 method36024() {
		@Pc(5) int local5 = this.aClass595_4.anInt5505 * -217302955;
		@Pc(9) Class595 local9 = client.aClass517_1.method30409();
		@Pc(20) int local20 = this.aClass595_4.anInt5504 * -424199969 - local9.anInt5504 * -424199969;
		@Pc(31) int local31 = this.aClass595_4.anInt5506 * -1166289421 - local9.anInt5506 * -1166289421;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass517_1.method30411() || local31 >= client.aClass517_1.method30417() || client.aClass517_1.method30435() == null) {
			return null;
		}
		switch(this.method36018()) {
			case 0:
				return (Interface61) client.aClass517_1.method30435().method31179(local5, local20, local31);
			case 1:
				return (Interface61) client.aClass517_1.method30435().method31187(local5, local20, local31);
			case 2:
				return (Interface61) client.aClass517_1.method30435().method31191(local5, local20, local31, client.anInterface63_1);
			case 3:
				return (Interface61) client.aClass517_1.method30435().method31195(local5, local20, local31);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "q", descriptor = "()Lclient!sy;", line = 30)
	Interface61 method36025() {
		@Pc(5) int local5 = this.aClass595_4.anInt5505 * -217302955;
		@Pc(9) Class595 local9 = client.aClass517_1.method30409();
		@Pc(20) int local20 = this.aClass595_4.anInt5504 * -424199969 - local9.anInt5504 * -424199969;
		@Pc(31) int local31 = this.aClass595_4.anInt5506 * -1166289421 - local9.anInt5506 * -1166289421;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass517_1.method30411() || local31 >= client.aClass517_1.method30417() || client.aClass517_1.method30435() == null) {
			return null;
		}
		switch(this.method36018()) {
			case 0:
				return (Interface61) client.aClass517_1.method30435().method31179(local5, local20, local31);
			case 1:
				return (Interface61) client.aClass517_1.method30435().method31187(local5, local20, local31);
			case 2:
				return (Interface61) client.aClass517_1.method30435().method31191(local5, local20, local31, client.anInterface63_1);
			case 3:
				return (Interface61) client.aClass517_1.method30435().method31195(local5, local20, local31);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "x", descriptor = "()Lclient!sy;", line = 30)
	Interface61 method36026() {
		@Pc(5) int local5 = this.aClass595_4.anInt5505 * -217302955;
		@Pc(9) Class595 local9 = client.aClass517_1.method30409();
		@Pc(20) int local20 = this.aClass595_4.anInt5504 * -424199969 - local9.anInt5504 * -424199969;
		@Pc(31) int local31 = this.aClass595_4.anInt5506 * -1166289421 - local9.anInt5506 * -1166289421;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass517_1.method30411() || local31 >= client.aClass517_1.method30417() || client.aClass517_1.method30435() == null) {
			return null;
		}
		switch(this.method36018()) {
			case 0:
				return (Interface61) client.aClass517_1.method30435().method31179(local5, local20, local31);
			case 1:
				return (Interface61) client.aClass517_1.method30435().method31187(local5, local20, local31);
			case 2:
				return (Interface61) client.aClass517_1.method30435().method31191(local5, local20, local31, client.anInterface63_1);
			case 3:
				return (Interface61) client.aClass517_1.method30435().method31195(local5, local20, local31);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "fg", descriptor = "(I)V", line = 2310)
	public static void method36027() {
		@Pc(2) Container local2 = Class94.method7650();
		@Pc(6) int local6 = local2.getSize().width;
		@Pc(10) int local10 = local2.getSize().height;
		if (local2 == Class460.aFrame2) {
			@Pc(16) Insets local16 = Class460.aFrame2.getInsets();
			local6 -= local16.right + local16.left;
			local10 -= local16.top + local16.bottom;
		}
		if (Class402.anInt4694 * -166028671 == local6 && local10 == client.anInt3365 * 8272787 && !client.aBoolean598) {
			return;
		}
		if (Class284.aClass86_9 == null || Class284.aClass86_9.method20052()) {
			Class274.method26549();
		} else {
			Class402.anInt4694 = local6 * 1199809921;
			client.anInt3365 = local10 * 226957979;
		}
		client.aLong242 = (Class280.method26667() + 500L) * -92619617144807657L;
		client.aBoolean598 = false;
	}

	@OriginalMember(owner = "client!yv", name = "ame", descriptor = "(Lclient!yf;S)V", line = 11662)
	static final void method36028(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(51) Class447 local51 = Class447.method29120((float) local13, (float) local23, (float) local33);
		if (local51.aFloat277 == -1.0F) {
			local51.aFloat277 = Float.POSITIVE_INFINITY;
		}
		if (local51.aFloat276 == -1.0F) {
			local51.aFloat276 = Float.POSITIVE_INFINITY;
		}
		if (local51.aFloat278 == -1.0F) {
			local51.aFloat278 = Float.POSITIVE_INFINITY;
		}
		Class597.aClass107_Sub1_2.method8814(local51);
		Class597.aClass107_Sub1_2.method8799((float) local43 / 1000.0F);
		local51.method29130();
	}

	@OriginalMember(owner = "client!yv", name = "avc", descriptor = "(Lclient!yf;I)V", line = 13101)
	static final void method36029(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 0);
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
