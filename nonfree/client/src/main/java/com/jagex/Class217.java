package com.jagex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public class Class217 implements Interface18 {

	@OriginalMember(owner = "client!hc", name = "en", descriptor = "Lclient!qt;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Z")
	boolean aBoolean668;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Z")
	boolean aBoolean669;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Z")
	boolean aBoolean670;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
	boolean aBoolean671;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "Ljava/lang/String;")
	String aString183;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Ljava/lang/String;")
	String aString184;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Ljava/util/List;")
	List aList13 = new ArrayList();

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Ljava/awt/geom/AffineTransform;")
	AffineTransform anAffineTransform1 = new AffineTransform();

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "(B)[Lclient!nt;", line = 14)
	public static Class356[] method24346() {
		return new Class356[] { Class356.aClass356_1, Class356.aClass356_3, Class356.aClass356_2 };
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 30)
	Class217() {
	}

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "(II)I", line = 33)
	final int method24333(@OriginalArg(0) int arg0) {
		return this.aBoolean670 ? (Class128.anInt3317 * 2037417253 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "(I)I", line = 33)
	final int method24337(@OriginalArg(0) int arg0) {
		return this.aBoolean670 ? (Class128.anInt3317 * 2037417253 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)I", line = 33)
	final int method24345(@OriginalArg(0) int arg0) {
		return this.aBoolean670 ? (Class128.anInt3317 * 2037417253 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)I", line = 38)
	final int method24334(@OriginalArg(0) int arg0) {
		return this.aBoolean668 ? (Class575.anInt5428 * 1261116487 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "(I)I", line = 38)
	final int method24335(@OriginalArg(0) int arg0) {
		return this.aBoolean668 ? (Class575.anInt5428 * 1261116487 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "(I)I", line = 38)
	final int method24338(@OriginalArg(0) int arg0) {
		return this.aBoolean668 ? (Class575.anInt5428 * 1261116487 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)I", line = 38)
	final int method24339(@OriginalArg(0) int arg0) {
		return this.aBoolean668 ? (Class575.anInt5428 * 1261116487 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(ZB)V", line = 43)
	@Override
	public void method24497(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean669 && !this.aBoolean671) {
			this.aBoolean671 = true;
			try {
				@Pc(13) String[] local13 = Class230.method24546(client.aString155, '|');
				if (local13.length < 3) {
					this.aBoolean669 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class106.aCanvas6);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = Class230.method24546(local13[local30].trim(), '=');
						if (local42[0].equals("halign")) {
							this.aBoolean670 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean668 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = Class230.method24546(local42[1], ',');
								try {
									local88 = this.method24336(local81[0]);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList13.add(new Class27_Sub2(this, local88, Class70.method33883(local81[1]), Class70.method33883(local81[2])));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = Class230.method24546(local42[1], ',');
								try {
									local88 = this.method24336(local81[0]);
								} catch (@Pc(142) Exception local142) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList13.add(new Class27_Sub2_Sub1(this, local88, Class70.method33883(local81[1]), Class70.method33883(local81[2]), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = Class230.method24546(local42[1], ',');
								this.aList13.add(new Class27_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class70.method33883(local81[2]), Integer.decode(local81[3]), Class70.method33883(local81[4]), Class70.method33883(local81[5])));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(231) Exception local231) {
				this.aBoolean669 = true;
			}
		}
		if (this.aBoolean669) {
			this.method24341();
			return;
		}
		@Pc(244) Graphics local244 = Class106.aCanvas6.getGraphics();
		if (local244 == null) {
			Class106.aCanvas6.repaint();
			return;
		}
		try {
			this.aString183 = "" + Class5.aClass221_4.method24391() + "%";
			this.aString184 = Class5.aClass221_4.method24385();
			if (Class160.anImage4 == null) {
				Class160.anImage4 = Class106.aCanvas6.createImage(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
			}
			@Pc(279) Graphics local279 = Class160.anImage4.getGraphics();
			local279.setColor(Color.BLACK);
			local279.fillRect(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
			@Pc(296) Iterator local296 = this.aList13.iterator();
			while (local296.hasNext()) {
				@Pc(303) Class27 local303 = (Class27) local296.next();
				local303.method15267(local279);
			}
			local244.drawImage(Class160.anImage4, 0, 0, null);
		} catch (@Pc(317) Exception local317) {
			this.aBoolean669 = true;
		}
	}

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "(Z)V", line = 43)
	@Override
	public void method24485() {
		if (!this.aBoolean669 && !this.aBoolean671) {
			this.aBoolean671 = true;
			try {
				@Pc(13) String[] local13 = Class230.method24546(client.aString155, '|');
				if (local13.length < 3) {
					this.aBoolean669 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class106.aCanvas6);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = Class230.method24546(local13[local30].trim(), '=');
						if (local42[0].equals("halign")) {
							this.aBoolean670 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean668 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = Class230.method24546(local42[1], ',');
								try {
									local88 = this.method24336(local81[0]);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList13.add(new Class27_Sub2(this, local88, Class70.method33883(local81[1]), Class70.method33883(local81[2])));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = Class230.method24546(local42[1], ',');
								try {
									local88 = this.method24336(local81[0]);
								} catch (@Pc(142) Exception local142) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList13.add(new Class27_Sub2_Sub1(this, local88, Class70.method33883(local81[1]), Class70.method33883(local81[2]), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = Class230.method24546(local42[1], ',');
								this.aList13.add(new Class27_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class70.method33883(local81[2]), Integer.decode(local81[3]), Class70.method33883(local81[4]), Class70.method33883(local81[5])));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(231) Exception local231) {
				this.aBoolean669 = true;
			}
		}
		if (this.aBoolean669) {
			this.method24341();
			return;
		}
		@Pc(244) Graphics local244 = Class106.aCanvas6.getGraphics();
		if (local244 == null) {
			Class106.aCanvas6.repaint();
			return;
		}
		try {
			this.aString183 = "" + Class5.aClass221_4.method24391() + "%";
			this.aString184 = Class5.aClass221_4.method24385();
			if (Class160.anImage4 == null) {
				Class160.anImage4 = Class106.aCanvas6.createImage(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
			}
			@Pc(279) Graphics local279 = Class160.anImage4.getGraphics();
			local279.setColor(Color.BLACK);
			local279.fillRect(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
			@Pc(296) Iterator local296 = this.aList13.iterator();
			while (local296.hasNext()) {
				@Pc(303) Class27 local303 = (Class27) local296.next();
				local303.method15267(local279);
			}
			local244.drawImage(Class160.anImage4, 0, 0, null);
		} catch (@Pc(317) Exception local317) {
			this.aBoolean669 = true;
		}
	}

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;", line = 139)
	Image method24336(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(5) InputStream local5 = Class524.anApplet2.getClass().getClassLoader().getResourceAsStream(arg0);
			@Pc(8) byte[] local8 = new byte[11000];
			@Pc(10) int local10 = 0;
			@Pc(14) int local14;
			while ((local14 = local5.read()) != -1) {
				local8[local10++] = (byte) local14;
			}
			return Toolkit.getDefaultToolkit().createImage(local8);
		} catch (@Pc(30) Exception local30) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;", line = 139)
	Image method24340(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(5) InputStream local5 = Class524.anApplet2.getClass().getClassLoader().getResourceAsStream(arg0);
			@Pc(8) byte[] local8 = new byte[11000];
			@Pc(10) int local10 = 0;
			@Pc(14) int local14;
			while ((local14 = local5.read()) != -1) {
				local8[local10++] = (byte) local14;
			}
			return Toolkit.getDefaultToolkit().createImage(local8);
		} catch (@Pc(30) Exception local30) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)V", line = 153)
	void method24341() {
		Class155.method23170(Class5.aClass221_4.method24391(), Class5.aClass221_4.method24385(), client.aColorArray1[client.anInt3130 * 548516575], client.aColorArray2[client.anInt3130 * 548516575], client.aColorArray3[client.anInt3130 * 548516575]);
	}

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "()V", line = 153)
	void method24342() {
		Class155.method23170(Class5.aClass221_4.method24391(), Class5.aClass221_4.method24385(), client.aColorArray1[client.anInt3130 * 548516575], client.aColorArray2[client.anInt3130 * 548516575], client.aColorArray3[client.anInt3130 * 548516575]);
	}

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "()V", line = 153)
	void method24343() {
		Class155.method23170(Class5.aClass221_4.method24391(), Class5.aClass221_4.method24385(), client.aColorArray1[client.anInt3130 * 548516575], client.aColorArray2[client.anInt3130 * 548516575], client.aColorArray3[client.anInt3130 * 548516575]);
	}

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "()V", line = 153)
	void method24344() {
		Class155.method23170(Class5.aClass221_4.method24391(), Class5.aClass221_4.method24385(), client.aColorArray1[client.anInt3130 * 548516575], client.aColorArray2[client.anInt3130 * 548516575], client.aColorArray3[client.anInt3130 * 548516575]);
	}

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "(B)V", line = 157)
	@Override
	public void method24486() {
		Class490.method29245();
	}

	@OriginalMember(owner = "client!hc", name = "at", descriptor = "()V", line = 157)
	@Override
	public void method24484() {
		Class490.method29245();
	}

	@OriginalMember(owner = "client!hc", name = "af", descriptor = "()V", line = 157)
	@Override
	public void method24491() {
		Class490.method29245();
	}

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "(I)V", line = 160)
	@Override
	public void method24483() {
	}

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "()V", line = 160)
	@Override
	public void method24496() {
	}

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "()I", line = 163)
	@Override
	public int method24489() {
		return 100;
	}

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "(I)I", line = 163)
	@Override
	public int method24490() {
		return 100;
	}

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "()I", line = 163)
	@Override
	public int method24492() {
		return 100;
	}

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "(J)Z", line = 167)
	@Override
	public boolean method24493(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "(J)Z", line = 167)
	@Override
	public boolean method24487(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "()I", line = 171)
	@Override
	public int method24494() {
		return 0;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I", line = 171)
	@Override
	public int method24488() {
		return 0;
	}

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "()I", line = 171)
	@Override
	public int method24495() {
		return 0;
	}

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "([J[Ljava/lang/Object;III)V", line = 212)
	static void method24350(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) Object local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method24350(arg0, arg1, arg2, local10 - 1);
		method24350(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!hc", name = "cu", descriptor = "(Lclient!vs;B)V", line = 4416)
	static final void method24349(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class506.method29547(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!hc", name = "mt", descriptor = "(Lclient!vs;I)V", line = 6395)
	static final void method24347(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class283.method25457(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!hc", name = "ml", descriptor = "(Ljava/lang/String;ZI)V", line = 11692)
	public static void method24351(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) String local2 = arg0.toLowerCase();
		Class21_Sub1.anInt289 = 0;
		if (client.anInt3177 * 315283673 == client.anInt3176 * 682716235 && arg1 == client.aBoolean607 && local2.equals(Class331.aString207)) {
			return;
		}
		Class331.aString207 = local2;
		client.anInt3177 = client.anInt3176 * 1385224131;
		client.aBoolean607 = arg1;
		@Pc(30) short[] local30 = new short[16];
		@Pc(32) int local32 = 0;
		@Pc(38) int local38 = arg1 ? 32768 : 0;
		@Pc(52) int local52 = local38 + (arg1 ? Class622.aClass580_2.anInt5445 * 1554273555 : Class622.aClass580_2.anInt5443 * -1342818835);
		for (@Pc(54) int local54 = local38; local54 < local52; local54++) {
			@Pc(62) Class3_Sub1_Sub13 local62 = Class622.aClass580_2.method33211(local54);
			if (local62.aBoolean475 && local62.method19278().toLowerCase().indexOf(local2) != -1) {
				if (local32 >= 50) {
					Class177.anInt3474 = -1267492223;
					Class354.aShortArray108 = null;
					return;
				}
				if (local32 >= local30.length) {
					@Pc(93) short[] local93 = new short[local30.length * 2];
					for (@Pc(95) int local95 = 0; local95 < local32; local95++) {
						local93[local95] = local30[local95];
					}
					local30 = local93;
				}
				local30[local32++] = (short) local54;
			}
		}
		Class354.aShortArray108 = local30;
		Class177.anInt3474 = local32 * 1267492223;
		@Pc(127) String[] local127 = new String[Class177.anInt3474 * -908764545];
		for (@Pc(129) int local129 = 0; local129 < Class177.anInt3474 * -908764545; local129++) {
			local127[local129] = Class622.aClass580_2.method33211(local30[local129]).method19278();
		}
		Class439.method28216(local127, Class354.aShortArray108);
	}

	@OriginalMember(owner = "client!hc", name = "arn", descriptor = "(Lclient!vs;I)V", line = 12164)
	static final void method24348(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class134.anInt3382 * -403295307;
	}
}
