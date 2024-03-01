package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sy")
public class Class470 implements Interface56 {

	@OriginalMember(owner = "client!sy", name = "p", descriptor = "Lclient!sy;")
	static final Class470 aClass470_3 = new Class470(0);

	@OriginalMember(owner = "client!sy", name = "a", descriptor = "Lclient!sy;")
	static final Class470 aClass470_2 = new Class470(1);

	@OriginalMember(owner = "client!sy", name = "g", descriptor = "Lclient!sy;")
	static final Class470 aClass470_1 = new Class470(2);

	@OriginalMember(owner = "client!sy", name = "l", descriptor = "Lclient!sy;")
	static final Class470 aClass470_4 = new Class470(3);

	@OriginalMember(owner = "client!sy", name = "h", descriptor = "Lclient!sy;")
	static final Class470 aClass470_5 = new Class470(4);

	@OriginalMember(owner = "client!sy", name = "x", descriptor = "Lclient!sy;")
	static final Class470 aClass470_6 = new Class470(5);

	@OriginalMember(owner = "client!sy", name = "s", descriptor = "I")
	final int anInt5117;

	@OriginalMember(owner = "client!sy", name = "<init>", descriptor = "(I)V", line = 20)
	Class470(@OriginalArg(0) int arg0) {
		this.anInt5117 = arg0 * 984015981;
	}

	@OriginalMember(owner = "client!sy", name = "h", descriptor = "()I", line = 25)
	@Override
	public int method33766() {
		return this.anInt5117 * 1809892709;
	}

	@OriginalMember(owner = "client!sy", name = "a", descriptor = "(I)I", line = 25)
	@Override
	public int method33765() {
		return this.anInt5117 * 1809892709;
	}

	@OriginalMember(owner = "client!sy", name = "l", descriptor = "()I", line = 25)
	@Override
	public int method33767() {
		return this.anInt5117 * 1809892709;
	}

	@OriginalMember(owner = "client!sy", name = "x", descriptor = "()I", line = 25)
	@Override
	public int method33764() {
		return this.anInt5117 * 1809892709;
	}

	@OriginalMember(owner = "client!sy", name = "qc", descriptor = "(Lclient!vs;B)V", line = 6958)
	static final void method28765(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(24) int local24 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(29) Class630 local29 = Class3_Sub20.aClass625_1.method33783(local24);
		if (local29.method33850()) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local11.method23438(local24, local29.aString248);
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.method23442(local24, local29.anInt5585 * 100041865);
		}
	}

	@OriginalMember(owner = "client!sy", name = "tf", descriptor = "(Lclient!vs;I)V", line = 7669)
	static final void method28764(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1560622745;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(53) int local53 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 4];
		Class510.aClass183_1.method23589(Class160.aClass160_9, local13, local23, local43, Class141.aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local53, local33);
	}

	@OriginalMember(owner = "client!sy", name = "abv", descriptor = "(Lclient!vs;I)V", line = 8962)
	static final void method28762(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class306.method25731((String) arg0.anObjectArray42[arg0.anInt5315 * 996806575], (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1], Class469.aClass530_2);
	}

	@OriginalMember(owner = "client!sy", name = "aic", descriptor = "(Lclient!vs;I)V", line = 10556)
	static final void method28763(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(47) Class464 local47 = client.aClass370_1.method26942();
		Class545.method32618((local13 >> 14 & 0x3FFF) - local47.anInt5071 * -1567811631, (local13 & 0x3FFF) - local47.anInt5073 * 1360175441, local23 << 2, local33, local43);
	}

	@OriginalMember(owner = "client!sy", name = "lz", descriptor = "(Ljava/lang/String;S)I", line = 11318)
	public static final int method28766(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(8) int local8 = 0; local8 < client.anInt3174 * 918731051; local8++) {
			if (arg0.equalsIgnoreCase(client.aClass123Array1[local8].aString161)) {
				return local8;
			}
		}
		return -1;
	}
}
