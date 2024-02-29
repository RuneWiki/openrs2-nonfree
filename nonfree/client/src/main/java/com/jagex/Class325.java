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

@OriginalClass("client!il")
public class Class325 implements Interface32 {

	@OriginalMember(owner = "client!il", name = "w", descriptor = "Ljava/lang/String;")
	String aString198;

	@OriginalMember(owner = "client!il", name = "c", descriptor = "Z")
	boolean aBoolean700;

	@OriginalMember(owner = "client!il", name = "t", descriptor = "Ljava/lang/String;")
	String aString199;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "Z")
	boolean aBoolean701;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "Z")
	boolean aBoolean702;

	@OriginalMember(owner = "client!il", name = "y", descriptor = "Z")
	boolean aBoolean703;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "Ljava/util/List;")
	List aList19 = new ArrayList();

	@OriginalMember(owner = "client!il", name = "q", descriptor = "Ljava/awt/geom/AffineTransform;")
	AffineTransform anAffineTransform1 = new AffineTransform();

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 30)
	Class325() {
	}

	@OriginalMember(owner = "client!il", name = "p", descriptor = "(IB)I", line = 33)
	final int method27501(@OriginalArg(0) int arg0) {
		return this.aBoolean701 ? (Class149_Sub4.anInt2368 * 1771907305 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!il", name = "r", descriptor = "(I)I", line = 33)
	final int method27502(@OriginalArg(0) int arg0) {
		return this.aBoolean701 ? (Class149_Sub4.anInt2368 * 1771907305 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!il", name = "s", descriptor = "(I)I", line = 33)
	final int method27503(@OriginalArg(0) int arg0) {
		return this.aBoolean701 ? (Class149_Sub4.anInt2368 * 1771907305 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(II)I", line = 38)
	final int method27504(@OriginalArg(0) int arg0) {
		return this.aBoolean703 ? (Class19.anInt108 * -1091172141 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "(I)I", line = 38)
	final int method27505(@OriginalArg(0) int arg0) {
		return this.aBoolean703 ? (Class19.anInt108 * -1091172141 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!il", name = "z", descriptor = "(Z)V", line = 43)
	@Override
	public void method27487() {
		if (!this.aBoolean702 && !this.aBoolean700) {
			this.aBoolean700 = true;
			try {
				@Pc(13) String[] local13 = Class398.method28452(client.aString158, '|');
				if (local13.length < 3) {
					this.aBoolean702 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class470.aCanvas6);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = Class398.method28452(local13[local30].trim(), '=');
						if (local42[0].equals("halign")) {
							this.aBoolean701 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean703 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = Class398.method28452(local42[1], ',');
								try {
									local88 = this.method27507(local81[0]);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList19.add(new Class100_Sub2(this, local88, Class679.method36041(local81[1]), Class679.method36041(local81[2])));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = Class398.method28452(local42[1], ',');
								try {
									local88 = this.method27507(local81[0]);
								} catch (@Pc(143) Exception local143) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList19.add(new Class100_Sub2_Sub1(this, local88, Class679.method36041(local81[1]), Class679.method36041(local81[2]), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = Class398.method28452(local42[1], ',');
								this.aList19.add(new Class100_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class679.method36041(local81[2]), Integer.decode(local81[3]), Class679.method36041(local81[4]), Class679.method36041(local81[5])));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(233) Exception local233) {
				this.aBoolean702 = true;
			}
		}
		if (this.aBoolean702) {
			this.method27511();
			return;
		}
		@Pc(246) Graphics local246 = Class470.aCanvas6.getGraphics();
		if (local246 == null) {
			Class470.aCanvas6.repaint();
			return;
		}
		try {
			this.aString198 = "" + Class307.aClass327_1.method27559() + "%";
			this.aString199 = Class307.aClass327_1.method27562();
			if (Class267.anImage4 == null) {
				Class267.anImage4 = Class470.aCanvas6.createImage(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
			}
			@Pc(283) Graphics local283 = Class267.anImage4.getGraphics();
			local283.setColor(Color.BLACK);
			local283.fillRect(0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
			@Pc(300) Iterator local300 = this.aList19.iterator();
			while (local300.hasNext()) {
				@Pc(307) Class100 local307 = (Class100) local300.next();
				local307.method18349(local283);
			}
			local246.drawImage(Class267.anImage4, 0, 0, null);
		} catch (@Pc(321) Exception local321) {
			this.aBoolean702 = true;
		}
	}

	@OriginalMember(owner = "client!il", name = "v", descriptor = "(ZS)V", line = 43)
	@Override
	public void method27490(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean702 && !this.aBoolean700) {
			this.aBoolean700 = true;
			try {
				@Pc(13) String[] local13 = Class398.method28452(client.aString158, '|');
				if (local13.length < 3) {
					this.aBoolean702 = true;
				} else {
					@Pc(26) MediaTracker local26 = new MediaTracker(Class470.aCanvas6);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
						@Pc(42) String[] local42 = Class398.method28452(local13[local30].trim(), '=');
						if (local42[0].equals("halign")) {
							this.aBoolean701 = Boolean.parseBoolean(local42[1]);
						} else if (local42[0].equals("valign")) {
							this.aBoolean703 = Boolean.parseBoolean(local42[1]);
						} else {
							@Pc(81) String[] local81;
							@Pc(88) Image local88;
							if (local42[0].equals("image")) {
								local81 = Class398.method28452(local42[1], ',');
								try {
									local88 = this.method27507(local81[0]);
								} catch (@Pc(90) Exception local90) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList19.add(new Class100_Sub2(this, local88, Class679.method36041(local81[1]), Class679.method36041(local81[2])));
								}
							} else if (local42[0].equals("rotatingimage")) {
								local81 = Class398.method28452(local42[1], ',');
								try {
									local88 = this.method27507(local81[0]);
								} catch (@Pc(143) Exception local143) {
									local88 = null;
								}
								if (local88 != null) {
									local26.addImage(local88, local28++);
									this.aList19.add(new Class100_Sub2_Sub1(this, local88, Class679.method36041(local81[1]), Class679.method36041(local81[2]), Float.parseFloat(local81[3])));
								}
							} else if (local42[0].equals("progress")) {
								local81 = Class398.method28452(local42[1], ',');
								this.aList19.add(new Class100_Sub1(this, Boolean.parseBoolean(local81[0]), local81[1], Class679.method36041(local81[2]), Integer.decode(local81[3]), Class679.method36041(local81[4]), Class679.method36041(local81[5])));
							}
						}
					}
					local26.waitForAll();
				}
			} catch (@Pc(233) Exception local233) {
				this.aBoolean702 = true;
			}
		}
		if (this.aBoolean702) {
			this.method27511();
			return;
		}
		@Pc(246) Graphics local246 = Class470.aCanvas6.getGraphics();
		if (local246 == null) {
			Class470.aCanvas6.repaint();
			return;
		}
		try {
			this.aString198 = "" + Class307.aClass327_1.method27559() + "%";
			this.aString199 = Class307.aClass327_1.method27562();
			if (Class267.anImage4 == null) {
				Class267.anImage4 = Class470.aCanvas6.createImage(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
			}
			@Pc(283) Graphics local283 = Class267.anImage4.getGraphics();
			local283.setColor(Color.BLACK);
			local283.fillRect(0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
			@Pc(300) Iterator local300 = this.aList19.iterator();
			while (local300.hasNext()) {
				@Pc(307) Class100 local307 = (Class100) local300.next();
				local307.method18349(local283);
			}
			local246.drawImage(Class267.anImage4, 0, 0, null);
		} catch (@Pc(321) Exception local321) {
			this.aBoolean702 = true;
		}
	}

	@OriginalMember(owner = "client!il", name = "k", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;", line = 137)
	Image method27506(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class331.anApplet2.getClass().getClassLoader().getResourceAsStream(arg0);
			@Pc(10) byte[] local10 = new byte[12000];
			@Pc(12) int local12 = 0;
			@Pc(16) int local16;
			while ((local16 = local1.read()) != -1) {
				local10[local12++] = (byte) local16;
			}
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(local10);
			local1.close();
			@Pc(33) Image local33 = local29;
			return local33;
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		} finally {
			if (local1 != null) {
				local1.close();
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "l", descriptor = "(Ljava/lang/String;B)Ljava/awt/Image;", line = 137)
	Image method27507(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class331.anApplet2.getClass().getClassLoader().getResourceAsStream(arg0);
			@Pc(10) byte[] local10 = new byte[12000];
			@Pc(12) int local12 = 0;
			@Pc(16) int local16;
			while ((local16 = local1.read()) != -1) {
				local10[local12++] = (byte) local16;
			}
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(local10);
			local1.close();
			@Pc(33) Image local33 = local29;
			return local33;
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		} finally {
			if (local1 != null) {
				local1.close();
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "j", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;", line = 137)
	Image method27508(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class331.anApplet2.getClass().getClassLoader().getResourceAsStream(arg0);
			@Pc(10) byte[] local10 = new byte[12000];
			@Pc(12) int local12 = 0;
			@Pc(16) int local16;
			while ((local16 = local1.read()) != -1) {
				local10[local12++] = (byte) local16;
			}
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(local10);
			local1.close();
			@Pc(33) Image local33 = local29;
			return local33;
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		} finally {
			if (local1 != null) {
				local1.close();
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "i", descriptor = "(Ljava/lang/String;)Ljava/awt/Image;", line = 137)
	Image method27509(@OriginalArg(0) String arg0) throws IOException {
		@Pc(1) InputStream local1 = null;
		try {
			local1 = Class331.anApplet2.getClass().getClassLoader().getResourceAsStream(arg0);
			@Pc(10) byte[] local10 = new byte[12000];
			@Pc(12) int local12 = 0;
			@Pc(16) int local16;
			while ((local16 = local1.read()) != -1) {
				local10[local12++] = (byte) local16;
			}
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(local10);
			local1.close();
			@Pc(33) Image local33 = local29;
			return local33;
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		} finally {
			if (local1 != null) {
				local1.close();
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "u", descriptor = "()V", line = 159)
	void method27510() {
		Class700.method36490(Class307.aClass327_1.method27559(), Class307.aClass327_1.method27562(), client.aColorArray1[client.anInt3379 * -859311063], client.aColorArray2[client.anInt3379 * -859311063], client.aColorArray3[client.anInt3379 * -859311063]);
	}

	@OriginalMember(owner = "client!il", name = "y", descriptor = "(B)V", line = 159)
	void method27511() {
		Class700.method36490(Class307.aClass327_1.method27559(), Class307.aClass327_1.method27562(), client.aColorArray1[client.anInt3379 * -859311063], client.aColorArray2[client.anInt3379 * -859311063], client.aColorArray3[client.anInt3379 * -859311063]);
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "()V", line = 159)
	void method27512() {
		Class700.method36490(Class307.aClass327_1.method27559(), Class307.aClass327_1.method27562(), client.aColorArray1[client.anInt3379 * -859311063], client.aColorArray2[client.anInt3379 * -859311063], client.aColorArray3[client.anInt3379 * -859311063]);
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "()V", line = 159)
	void method27513() {
		Class700.method36490(Class307.aClass327_1.method27559(), Class307.aClass327_1.method27562(), client.aColorArray1[client.anInt3379 * -859311063], client.aColorArray2[client.anInt3379 * -859311063], client.aColorArray3[client.anInt3379 * -859311063]);
	}

	@OriginalMember(owner = "client!il", name = "o", descriptor = "()V", line = 159)
	void method27514() {
		Class700.method36490(Class307.aClass327_1.method27559(), Class307.aClass327_1.method27562(), client.aColorArray1[client.anInt3379 * -859311063], client.aColorArray2[client.anInt3379 * -859311063], client.aColorArray3[client.anInt3379 * -859311063]);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "()V", line = 159)
	void method27515() {
		Class700.method36490(Class307.aClass327_1.method27559(), Class307.aClass327_1.method27562(), client.aColorArray1[client.anInt3379 * -859311063], client.aColorArray2[client.anInt3379 * -859311063], client.aColorArray3[client.anInt3379 * -859311063]);
	}

	@OriginalMember(owner = "client!il", name = "w", descriptor = "(B)V", line = 163)
	@Override
	public void method27492() {
		Class241.method26006();
	}

	@OriginalMember(owner = "client!il", name = "n", descriptor = "()V", line = 163)
	@Override
	public void method27489() {
		Class241.method26006();
	}

	@OriginalMember(owner = "client!il", name = "m", descriptor = "()V", line = 163)
	@Override
	public void method27484() {
		Class241.method26006();
	}

	@OriginalMember(owner = "client!il", name = "h", descriptor = "()V", line = 163)
	@Override
	public void method27493() {
		Class241.method26006();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "()V", line = 163)
	@Override
	public void method27488() {
		Class241.method26006();
	}

	@OriginalMember(owner = "client!il", name = "t", descriptor = "(B)V", line = 166)
	@Override
	public void method27482() {
	}

	@OriginalMember(owner = "client!il", name = "aj", descriptor = "()V", line = 166)
	@Override
	public void method27481() {
	}

	@OriginalMember(owner = "client!il", name = "ai", descriptor = "()I", line = 169)
	@Override
	public int method27483() {
		return 100;
	}

	@OriginalMember(owner = "client!il", name = "q", descriptor = "(B)I", line = 169)
	@Override
	public int method27491() {
		return 100;
	}

	@OriginalMember(owner = "client!il", name = "ao", descriptor = "(J)Z", line = 173)
	@Override
	public boolean method27496(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!il", name = "x", descriptor = "(J)Z", line = 173)
	@Override
	public boolean method27485(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!il", name = "ag", descriptor = "(J)Z", line = 173)
	@Override
	public boolean method27494(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!il", name = "al", descriptor = "(J)Z", line = 173)
	@Override
	public boolean method27495(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)I", line = 177)
	@Override
	public int method27486() {
		return 0;
	}

	@OriginalMember(owner = "client!il", name = "ar", descriptor = "()I", line = 177)
	@Override
	public int method27500() {
		return 0;
	}

	@OriginalMember(owner = "client!il", name = "ak", descriptor = "()I", line = 177)
	@Override
	public int method27497() {
		return 0;
	}

	@OriginalMember(owner = "client!il", name = "au", descriptor = "()I", line = 177)
	@Override
	public int method27498() {
		return 0;
	}

	@OriginalMember(owner = "client!il", name = "ax", descriptor = "()I", line = 177)
	@Override
	public int method27499() {
		return 0;
	}

	@OriginalMember(owner = "client!il", name = "i", descriptor = "(ILclient!aak;B)V", line = 257)
	static final void method27516(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1) {
		if (arg0 != -1 && arg1.method173((long) arg0) == null) {
			arg1.method184(new Class77(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!il", name = "x", descriptor = "(Lclient!sy;Lclient!anu;III)Z", line = 303)
	static boolean method27517(@OriginalArg(0) Interface61 arg0, @OriginalArg(1) Class35_Sub12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return false;
		}
		@Pc(12) Class599 local12 = (Class599) arg1.method18319(arg0.method13060());
		if (local12.aBoolean830 && !client.aBoolean613) {
			return false;
		}
		@Pc(24) int local24 = local12.anInt5544 * 196422211;
		if (local12.anIntArray511 != null) {
			for (@Pc(29) int local29 = 0; local29 < local12.anIntArray511.length; local29++) {
				if (local12.anIntArray511[local29] != -1) {
					@Pc(49) Class599 local49 = (Class599) arg1.method18319(local12.anIntArray511[local29]);
					if (local49.anInt5544 * 196422211 >= 0) {
						local24 = local49.anInt5544 * 196422211;
					}
				}
			}
		}
		if (local24 < 0) {
			return false;
		}
		Class156.anIntArray299[Class156.anInt3237 * -463245253] = local12.anInt5510 * -1562722583;
		Class156.anIntArray297[Class156.anInt3237 * -463245253] = arg2;
		Class156.anIntArray298[Class156.anInt3237 * -463245253] = arg3;
		Class156.anInt3237 += 138799347;
		return true;
	}

	@OriginalMember(owner = "client!il", name = "aer", descriptor = "(Lclient!yf;B)V", line = 9941)
	static final void method27518(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class18) Class537.aClass35_Sub7_1.method18319(local12)).anInt72 * -273654379;
	}
}
