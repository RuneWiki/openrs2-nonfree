package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!x")
public class Class568 {

	@OriginalMember(owner = "client!x", name = "a", descriptor = "I")
	static int anInt5372;

	@OriginalMember(owner = "client!x", name = "m", descriptor = "Lclient!dw;")
	public static Class14 aClass14_13;

	@OriginalMember(owner = "client!x", name = "g", descriptor = "I")
	static int anInt5373;

	@OriginalMember(owner = "client!x", name = "l", descriptor = "I")
	static int anInt5374;

	@OriginalMember(owner = "client!x", name = "h", descriptor = "I")
	static int anInt5375;

	@OriginalMember(owner = "client!x", name = "x", descriptor = "I")
	static int anInt5376;

	@OriginalMember(owner = "client!x", name = "j", descriptor = "I")
	static int anInt5377;

	@OriginalMember(owner = "client!x", name = "p", descriptor = "I")
	static int anInt5378;

	@OriginalMember(owner = "client!x", name = "n", descriptor = "Lclient!yx;")
	static Class611 aClass611_12;

	@OriginalMember(owner = "client!x", name = "b", descriptor = "I")
	static int anInt5379;

	@OriginalMember(owner = "client!x", name = "k", descriptor = "Lclient!co;")
	static Class6 aClass6_36;

	@OriginalMember(owner = "client!x", name = "qr", descriptor = "I")
	static int anInt5380;

	@OriginalMember(owner = "client!x", name = "<init>", descriptor = "()V", line = 37)
	Class568() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!x", name = "y", descriptor = "(Lclient!ny;)V", line = 42)
	public static void method32956(@OriginalArg(0) Class359 arg0) {
		anInt5378 = arg0.method26687("p11_full") * 311447873;
		anInt5372 = arg0.method26687("p12_full") * -1208045323;
		anInt5373 = arg0.method26687("b12_full") * -1269131453;
	}

	@OriginalMember(owner = "client!x", name = "c", descriptor = "(Lclient!ny;)V", line = 48)
	public static void method32958(@OriginalArg(0) Class359 arg0) {
		anInt5374 = arg0.method26687("hint_headicons") * 1542186419;
		anInt5375 = arg0.method26687("hint_mapmarkers") * 766778101;
		anInt5376 = arg0.method26687("mapflag") * 202456049;
		Class264.anInt4207 = arg0.method26687("cross") * -1858728797;
		Class529.anInt5305 = arg0.method26687("mapdots") * 874382867;
		Class519.anInt5284 = arg0.method26687("name_icons") * 1904520153;
		anInt5379 = arg0.method26687("floorshadows") * -86295779;
		Class230.anInt3737 = arg0.method26687("compass") * -1979983511;
		FileFilter_Sub1.anInt2088 = arg0.method26687("otherlevel") * -739314191;
		anInt5377 = arg0.method26687("hint_mapedge") * 1547839981;
	}

	@OriginalMember(owner = "client!x", name = "b", descriptor = "(Lclient!ny;)V", line = 48)
	public static void method32960(@OriginalArg(0) Class359 arg0) {
		anInt5374 = arg0.method26687("hint_headicons") * 1542186419;
		anInt5375 = arg0.method26687("hint_mapmarkers") * 766778101;
		anInt5376 = arg0.method26687("mapflag") * 202456049;
		Class264.anInt4207 = arg0.method26687("cross") * -1858728797;
		Class529.anInt5305 = arg0.method26687("mapdots") * 874382867;
		Class519.anInt5284 = arg0.method26687("name_icons") * 1904520153;
		anInt5379 = arg0.method26687("floorshadows") * -86295779;
		Class230.anInt3737 = arg0.method26687("compass") * -1979983511;
		FileFilter_Sub1.anInt2088 = arg0.method26687("otherlevel") * -739314191;
		anInt5377 = arg0.method26687("hint_mapedge") * 1547839981;
	}

	@OriginalMember(owner = "client!x", name = "n", descriptor = "()[I", line = 61)
	public static int[] method32961() {
		return new int[] { anInt5378 * 1732591297, anInt5372 * -349930659, anInt5373 * -779866773 };
	}

	@OriginalMember(owner = "client!x", name = "e", descriptor = "()[I", line = 61)
	public static int[] method32962() {
		return new int[] { anInt5378 * 1732591297, anInt5372 * -349930659, anInt5373 * -779866773 };
	}

	@OriginalMember(owner = "client!x", name = "z", descriptor = "()[I", line = 61)
	public static int[] method32966() {
		return new int[] { anInt5378 * 1732591297, anInt5372 * -349930659, anInt5373 * -779866773 };
	}

	@OriginalMember(owner = "client!x", name = "j", descriptor = "()[I", line = 61)
	public static int[] method32973() {
		return new int[] { anInt5378 * 1732591297, anInt5372 * -349930659, anInt5373 * -779866773 };
	}

	@OriginalMember(owner = "client!x", name = "q", descriptor = "(Lclient!de;)V", line = 65)
	public static void method32957(@OriginalArg(0) Class21 arg0) {
		Class418.aClass14_11 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, anInt5378 * 1732591297, true, true);
		aClass611_12 = Class379.aClass312_1.method25786(client.anInterface34_1, anInt5378 * 1732591297);
		Class454.aClass14_12 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, anInt5372 * -349930659, true, true);
		Class222.aClass611_7 = Class379.aClass312_1.method25786(client.anInterface34_1, anInt5372 * -349930659);
		aClass14_13 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, anInt5373 * -779866773, true, true);
		Class224.aClass611_8 = Class379.aClass312_1.method25786(client.anInterface34_1, anInt5373 * -779866773);
	}

	@OriginalMember(owner = "client!x", name = "r", descriptor = "(Lclient!de;)V", line = 65)
	public static void method32963(@OriginalArg(0) Class21 arg0) {
		Class418.aClass14_11 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, anInt5378 * 1732591297, true, true);
		aClass611_12 = Class379.aClass312_1.method25786(client.anInterface34_1, anInt5378 * 1732591297);
		Class454.aClass14_12 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, anInt5372 * -349930659, true, true);
		Class222.aClass611_7 = Class379.aClass312_1.method25786(client.anInterface34_1, anInt5372 * -349930659);
		aClass14_13 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, anInt5373 * -779866773, true, true);
		Class224.aClass611_8 = Class379.aClass312_1.method25786(client.anInterface34_1, anInt5373 * -779866773);
	}

	@OriginalMember(owner = "client!x", name = "d", descriptor = "(Lclient!de;)V", line = 65)
	public static void method32964(@OriginalArg(0) Class21 arg0) {
		Class418.aClass14_11 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, anInt5378 * 1732591297, true, true);
		aClass611_12 = Class379.aClass312_1.method25786(client.anInterface34_1, anInt5378 * 1732591297);
		Class454.aClass14_12 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, anInt5372 * -349930659, true, true);
		Class222.aClass611_7 = Class379.aClass312_1.method25786(client.anInterface34_1, anInt5372 * -349930659);
		aClass14_13 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, anInt5373 * -779866773, true, true);
		Class224.aClass611_8 = Class379.aClass312_1.method25786(client.anInterface34_1, anInt5373 * -779866773);
	}

	@OriginalMember(owner = "client!x", name = "m", descriptor = "(Lclient!ny;)I", line = 74)
	public static int method32959(@OriginalArg(0) Class359 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method26674(anInt5374 * 1855541627)) {
			local1++;
		}
		if (arg0.method26674(anInt5375 * 1066549597)) {
			local1++;
		}
		if (arg0.method26674(anInt5376 * 489968913)) {
			local1++;
		}
		if (arg0.method26674(Class264.anInt4207 * 1856440075)) {
			local1++;
		}
		if (arg0.method26674(Class529.anInt5305 * -617565157)) {
			local1++;
		}
		if (arg0.method26674(Class519.anInt5284 * 1071850601)) {
			local1++;
		}
		if (arg0.method26674(anInt5379 * -808362187)) {
			local1++;
		}
		if (arg0.method26674(Class230.anInt3737 * 1195525849)) {
			local1++;
		}
		if (arg0.method26674(FileFilter_Sub1.anInt2088 * 235232017)) {
			local1++;
		}
		if (arg0.method26674(anInt5377 * -379151387)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!x", name = "t", descriptor = "(Lclient!ny;)I", line = 74)
	public static int method32968(@OriginalArg(0) Class359 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method26674(anInt5374 * 1855541627)) {
			local1++;
		}
		if (arg0.method26674(anInt5375 * 1066549597)) {
			local1++;
		}
		if (arg0.method26674(anInt5376 * 489968913)) {
			local1++;
		}
		if (arg0.method26674(Class264.anInt4207 * 1856440075)) {
			local1++;
		}
		if (arg0.method26674(Class529.anInt5305 * -617565157)) {
			local1++;
		}
		if (arg0.method26674(Class519.anInt5284 * 1071850601)) {
			local1++;
		}
		if (arg0.method26674(anInt5379 * -808362187)) {
			local1++;
		}
		if (arg0.method26674(Class230.anInt3737 * 1195525849)) {
			local1++;
		}
		if (arg0.method26674(FileFilter_Sub1.anInt2088 * 235232017)) {
			local1++;
		}
		if (arg0.method26674(anInt5377 * -379151387)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!x", name = "v", descriptor = "(Lclient!ny;)I", line = 74)
	public static int method32969(@OriginalArg(0) Class359 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method26674(anInt5374 * 1855541627)) {
			local1++;
		}
		if (arg0.method26674(anInt5375 * 1066549597)) {
			local1++;
		}
		if (arg0.method26674(anInt5376 * 489968913)) {
			local1++;
		}
		if (arg0.method26674(Class264.anInt4207 * 1856440075)) {
			local1++;
		}
		if (arg0.method26674(Class529.anInt5305 * -617565157)) {
			local1++;
		}
		if (arg0.method26674(Class519.anInt5284 * 1071850601)) {
			local1++;
		}
		if (arg0.method26674(anInt5379 * -808362187)) {
			local1++;
		}
		if (arg0.method26674(Class230.anInt3737 * 1195525849)) {
			local1++;
		}
		if (arg0.method26674(FileFilter_Sub1.anInt2088 * 235232017)) {
			local1++;
		}
		if (arg0.method26674(anInt5377 * -379151387)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!x", name = "w", descriptor = "(Lclient!de;Lclient!ny;)V", line = 93)
	public static void method32965(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class359 arg1) {
		@Pc(6) Class15[] local6 = Class137.method22942(arg1, anInt5374 * 1855541627, 0);
		Class331.aClass6Array12 = new Class6[local6.length];
		@Pc(12) int local12;
		for (local12 = 0; local12 < local6.length; local12++) {
			Class331.aClass6Array12[local12] = arg0.method17089(local6[local12], true);
		}
		local6 = Class137.method22942(arg1, anInt5375 * 1066549597, 0);
		Class542.aClass6Array15 = new Class6[local6.length];
		for (local12 = 0; local12 < local6.length; local12++) {
			Class542.aClass6Array15[local12] = arg0.method17089(local6[local12], true);
		}
		local6 = Class137.method22942(arg1, anInt5376 * 489968913, 0);
		Class68.aClass6Array5 = new Class6[local6.length];
		@Pc(68) byte local68 = 25;
		@Pc(70) int local70;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class68.aClass6Array5[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class264.anInt4207 * 1856440075, 0);
		Class145.aClass6Array11 = new Class6[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class145.aClass6Array11[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class529.anInt5305 * -617565157, 0);
		Class486.aClass6Array14 = new Class6[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class486.aClass6Array14[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class519.anInt5284 * 1071850601, 0);
		Class19_Sub1.aClass6Array10 = new Class6[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class19_Sub1.aClass6Array10[local70] = arg0.method17089(local6[local70], true);
		}
		aClass6_36 = arg0.method17089(Class137.method22938(arg1, Class230.anInt3737 * 1195525849, 0), true);
		Class19_Sub1.aClass6_23 = arg0.method17089(Class137.method22938(arg1, FileFilter_Sub1.anInt2088 * 235232017, 0), true);
		local6 = Class137.method22942(arg1, anInt5377 * -379151387, 0);
		Class16.aClass6Array3 = new Class6[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class16.aClass6Array3[local70] = arg0.method17089(local6[local70], true);
		}
	}

	@OriginalMember(owner = "client!x", name = "o", descriptor = "(Lclient!de;Lclient!ny;)V", line = 93)
	public static void method32970(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class359 arg1) {
		@Pc(6) Class15[] local6 = Class137.method22942(arg1, anInt5374 * 1855541627, 0);
		Class331.aClass6Array12 = new Class6[local6.length];
		@Pc(12) int local12;
		for (local12 = 0; local12 < local6.length; local12++) {
			Class331.aClass6Array12[local12] = arg0.method17089(local6[local12], true);
		}
		local6 = Class137.method22942(arg1, anInt5375 * 1066549597, 0);
		Class542.aClass6Array15 = new Class6[local6.length];
		for (local12 = 0; local12 < local6.length; local12++) {
			Class542.aClass6Array15[local12] = arg0.method17089(local6[local12], true);
		}
		local6 = Class137.method22942(arg1, anInt5376 * 489968913, 0);
		Class68.aClass6Array5 = new Class6[local6.length];
		@Pc(68) byte local68 = 25;
		@Pc(70) int local70;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class68.aClass6Array5[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class264.anInt4207 * 1856440075, 0);
		Class145.aClass6Array11 = new Class6[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class145.aClass6Array11[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class529.anInt5305 * -617565157, 0);
		Class486.aClass6Array14 = new Class6[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class486.aClass6Array14[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class519.anInt5284 * 1071850601, 0);
		Class19_Sub1.aClass6Array10 = new Class6[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class19_Sub1.aClass6Array10[local70] = arg0.method17089(local6[local70], true);
		}
		aClass6_36 = arg0.method17089(Class137.method22938(arg1, Class230.anInt3737 * 1195525849, 0), true);
		Class19_Sub1.aClass6_23 = arg0.method17089(Class137.method22938(arg1, FileFilter_Sub1.anInt2088 * 235232017, 0), true);
		local6 = Class137.method22942(arg1, anInt5377 * -379151387, 0);
		Class16.aClass6Array3 = new Class6[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class16.aClass6Array3[local70] = arg0.method17089(local6[local70], true);
		}
	}

	@OriginalMember(owner = "client!x", name = "i", descriptor = "(Lclient!de;Lclient!ny;)V", line = 93)
	public static void method32971(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class359 arg1) {
		@Pc(6) Class15[] local6 = Class137.method22942(arg1, anInt5374 * 1855541627, 0);
		Class331.aClass6Array12 = new Class6[local6.length];
		@Pc(12) int local12;
		for (local12 = 0; local12 < local6.length; local12++) {
			Class331.aClass6Array12[local12] = arg0.method17089(local6[local12], true);
		}
		local6 = Class137.method22942(arg1, anInt5375 * 1066549597, 0);
		Class542.aClass6Array15 = new Class6[local6.length];
		for (local12 = 0; local12 < local6.length; local12++) {
			Class542.aClass6Array15[local12] = arg0.method17089(local6[local12], true);
		}
		local6 = Class137.method22942(arg1, anInt5376 * 489968913, 0);
		Class68.aClass6Array5 = new Class6[local6.length];
		@Pc(68) byte local68 = 25;
		@Pc(70) int local70;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class68.aClass6Array5[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class264.anInt4207 * 1856440075, 0);
		Class145.aClass6Array11 = new Class6[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class145.aClass6Array11[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class529.anInt5305 * -617565157, 0);
		Class486.aClass6Array14 = new Class6[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class486.aClass6Array14[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class519.anInt5284 * 1071850601, 0);
		Class19_Sub1.aClass6Array10 = new Class6[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class19_Sub1.aClass6Array10[local70] = arg0.method17089(local6[local70], true);
		}
		aClass6_36 = arg0.method17089(Class137.method22938(arg1, Class230.anInt3737 * 1195525849, 0), true);
		Class19_Sub1.aClass6_23 = arg0.method17089(Class137.method22938(arg1, FileFilter_Sub1.anInt2088 * 235232017, 0), true);
		local6 = Class137.method22942(arg1, anInt5377 * -379151387, 0);
		Class16.aClass6Array3 = new Class6[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class16.aClass6Array3[local70] = arg0.method17089(local6[local70], true);
		}
	}

	@OriginalMember(owner = "client!x", name = "f", descriptor = "(Lclient!de;Lclient!ny;)V", line = 93)
	public static void method32972(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class359 arg1) {
		@Pc(6) Class15[] local6 = Class137.method22942(arg1, anInt5374 * 1855541627, 0);
		Class331.aClass6Array12 = new Class6[local6.length];
		@Pc(12) int local12;
		for (local12 = 0; local12 < local6.length; local12++) {
			Class331.aClass6Array12[local12] = arg0.method17089(local6[local12], true);
		}
		local6 = Class137.method22942(arg1, anInt5375 * 1066549597, 0);
		Class542.aClass6Array15 = new Class6[local6.length];
		for (local12 = 0; local12 < local6.length; local12++) {
			Class542.aClass6Array15[local12] = arg0.method17089(local6[local12], true);
		}
		local6 = Class137.method22942(arg1, anInt5376 * 489968913, 0);
		Class68.aClass6Array5 = new Class6[local6.length];
		@Pc(68) byte local68 = 25;
		@Pc(70) int local70;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class68.aClass6Array5[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class264.anInt4207 * 1856440075, 0);
		Class145.aClass6Array11 = new Class6[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class145.aClass6Array11[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class529.anInt5305 * -617565157, 0);
		Class486.aClass6Array14 = new Class6[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class486.aClass6Array14[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class519.anInt5284 * 1071850601, 0);
		Class19_Sub1.aClass6Array10 = new Class6[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class19_Sub1.aClass6Array10[local70] = arg0.method17089(local6[local70], true);
		}
		aClass6_36 = arg0.method17089(Class137.method22938(arg1, Class230.anInt3737 * 1195525849, 0), true);
		Class19_Sub1.aClass6_23 = arg0.method17089(Class137.method22938(arg1, FileFilter_Sub1.anInt2088 * 235232017, 0), true);
		local6 = Class137.method22942(arg1, anInt5377 * -379151387, 0);
		Class16.aClass6Array3 = new Class6[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class16.aClass6Array3[local70] = arg0.method17089(local6[local70], true);
		}
	}

	@OriginalMember(owner = "client!x", name = "k", descriptor = "()V", line = 131)
	static void method32967() {
		Class418.aClass14_11 = null;
		Class454.aClass14_12 = null;
		aClass14_13 = null;
		Class331.aClass6Array12 = null;
		Class542.aClass6Array15 = null;
		Class68.aClass6Array5 = null;
		Class145.aClass6Array11 = null;
		Class486.aClass6Array14 = null;
		Class19_Sub1.aClass6Array10 = null;
		aClass6_36 = null;
		Class19_Sub1.aClass6_23 = null;
		Class16.aClass6Array3 = null;
	}

	@OriginalMember(owner = "client!x", name = "aj", descriptor = "(Lclient!vs;I)V", line = 4033)
	static final void method32978(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		if (arg0.anIntArray496[arg0.anInt5319 * 960738381] >= arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]) {
			arg0.anInt5318 += arg0.anIntArray497[arg0.anInt5318 * -2140198955] * -836839043;
		}
	}

	@OriginalMember(owner = "client!x", name = "fu", descriptor = "(Lclient!vs;I)V", line = 4998)
	static final void method32977(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class285.method25475(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!x", name = "acc", descriptor = "(Lclient!vs;B)V", line = 9068)
	static final void method32974(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Character.toLowerCase((char) local12);
	}

	@OriginalMember(owner = "client!x", name = "adb", descriptor = "(Lclient!vs;I)V", line = 9312)
	static final void method32979(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3186 * -1581600013;
	}

	@OriginalMember(owner = "client!x", name = "amq", descriptor = "(Lclient!vs;I)V", line = 11232)
	static final void method32975(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class190.anInt3677 * 1011660873;
	}

	@OriginalMember(owner = "client!x", name = "anv", descriptor = "(Lclient!vs;S)V", line = 11421)
	static final void method32976(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 0 ? 0 : 1);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aClass370_1.method26968();
	}
}
