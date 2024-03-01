package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public class Class537 {

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "Lclient!sr;")
	final Class464 aClass464_4;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
	final int anInt5320;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
	final int anInt5321;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!sr;III)V", line = 12)
	public Class537(@OriginalArg(0) Class464 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass464_4 = arg0;
		this.anInt5320 = arg1 * -1964589;
		this.anInt5321 = arg3 * 765498989;
	}

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "(I)I", line = 19)
	int method32542() {
		return client.anIntArray295[this.anInt5320 * 1155373659];
	}

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "()I", line = 19)
	int method32546() {
		return client.anIntArray295[this.anInt5320 * 1155373659];
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Lclient!pp;", line = 23)
	public Interface43 method32544() {
		@Pc(3) Interface43 local3 = this.method32545();
		if (local3 == null) {
			return null;
		} else if (local3.method11163() == this.anInt5321 * 1644880741) {
			return local3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "()Lclient!pp;", line = 23)
	public Interface43 method32547() {
		@Pc(3) Interface43 local3 = this.method32545();
		if (local3 == null) {
			return null;
		} else if (local3.method11163() == this.anInt5321 * 1644880741) {
			return local3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "()Lclient!pp;", line = 30)
	Interface43 method32543() {
		@Pc(5) int local5 = this.aClass464_4.anInt5072 * 324147675;
		@Pc(9) Class464 local9 = client.aClass370_1.method26942();
		@Pc(20) int local20 = this.aClass464_4.anInt5071 * -1567811631 - local9.anInt5071 * -1567811631;
		@Pc(31) int local31 = this.aClass464_4.anInt5073 * 1360175441 - local9.anInt5073 * 1360175441;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass370_1.method26943() || local31 >= client.aClass370_1.method27062() || client.aClass370_1.method26950() == null) {
			return null;
		}
		switch(this.method32542()) {
			case 0:
				return (Interface43) client.aClass370_1.method26950().method28066(local5, local20, local31);
			case 1:
				return (Interface43) client.aClass370_1.method26950().method28200(local5, local20, local31);
			case 2:
				return (Interface43) client.aClass370_1.method26950().method28150(local5, local20, local31, client.anInterface48_1);
			case 3:
				return (Interface43) client.aClass370_1.method26950().method28053(local5, local20, local31);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "(I)Lclient!pp;", line = 30)
	Interface43 method32545() {
		@Pc(5) int local5 = this.aClass464_4.anInt5072 * 324147675;
		@Pc(9) Class464 local9 = client.aClass370_1.method26942();
		@Pc(20) int local20 = this.aClass464_4.anInt5071 * -1567811631 - local9.anInt5071 * -1567811631;
		@Pc(31) int local31 = this.aClass464_4.anInt5073 * 1360175441 - local9.anInt5073 * 1360175441;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass370_1.method26943() || local31 >= client.aClass370_1.method27062() || client.aClass370_1.method26950() == null) {
			return null;
		}
		switch(this.method32542()) {
			case 0:
				return (Interface43) client.aClass370_1.method26950().method28066(local5, local20, local31);
			case 1:
				return (Interface43) client.aClass370_1.method26950().method28200(local5, local20, local31);
			case 2:
				return (Interface43) client.aClass370_1.method26950().method28150(local5, local20, local31, client.anInterface48_1);
			case 3:
				return (Interface43) client.aClass370_1.method26950().method28053(local5, local20, local31);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "()Lclient!pp;", line = 30)
	Interface43 method32548() {
		@Pc(5) int local5 = this.aClass464_4.anInt5072 * 324147675;
		@Pc(9) Class464 local9 = client.aClass370_1.method26942();
		@Pc(20) int local20 = this.aClass464_4.anInt5071 * -1567811631 - local9.anInt5071 * -1567811631;
		@Pc(31) int local31 = this.aClass464_4.anInt5073 * 1360175441 - local9.anInt5073 * 1360175441;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass370_1.method26943() || local31 >= client.aClass370_1.method27062() || client.aClass370_1.method26950() == null) {
			return null;
		}
		switch(this.method32542()) {
			case 0:
				return (Interface43) client.aClass370_1.method26950().method28066(local5, local20, local31);
			case 1:
				return (Interface43) client.aClass370_1.method26950().method28200(local5, local20, local31);
			case 2:
				return (Interface43) client.aClass370_1.method26950().method28150(local5, local20, local31, client.anInterface48_1);
			case 3:
				return (Interface43) client.aClass370_1.method26950().method28053(local5, local20, local31);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "()Lclient!pp;", line = 30)
	Interface43 method32549() {
		@Pc(5) int local5 = this.aClass464_4.anInt5072 * 324147675;
		@Pc(9) Class464 local9 = client.aClass370_1.method26942();
		@Pc(20) int local20 = this.aClass464_4.anInt5071 * -1567811631 - local9.anInt5071 * -1567811631;
		@Pc(31) int local31 = this.aClass464_4.anInt5073 * 1360175441 - local9.anInt5073 * 1360175441;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass370_1.method26943() || local31 >= client.aClass370_1.method27062() || client.aClass370_1.method26950() == null) {
			return null;
		}
		switch(this.method32542()) {
			case 0:
				return (Interface43) client.aClass370_1.method26950().method28066(local5, local20, local31);
			case 1:
				return (Interface43) client.aClass370_1.method26950().method28200(local5, local20, local31);
			case 2:
				return (Interface43) client.aClass370_1.method26950().method28150(local5, local20, local31, client.anInterface48_1);
			case 3:
				return (Interface43) client.aClass370_1.method26950().method28053(local5, local20, local31);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "dz", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4692)
	static final void method32551(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean635 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "sn", descriptor = "(Lclient!vs;B)V", line = 7491)
	static final void method32550(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(19) Class3_Sub23 local19 = Class269.method25284(Class311.aClass311_96, client.aClass82_2.aClass577_2);
		local19.aClass3_Sub41_Sub1_1.method20250(local13.length() + 1);
		local19.aClass3_Sub41_Sub1_1.method20260(local13);
		client.aClass82_2.method21601(local19);
	}
}
