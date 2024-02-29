package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zr")
public abstract class Class700 {

	@OriginalMember(owner = "client!zr", name = "<init>", descriptor = "()V", line = 7)
	Class700() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zr", name = "y", descriptor = "([BZ)Ljava/lang/Object;", line = 12)
	public static Object method36482(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(11) ByteBuffer local11 = ByteBuffer.allocateDirect(arg0.length);
			local11.position(0);
			local11.put(arg0);
			return local11;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!zr", name = "w", descriptor = "([BZ)Ljava/lang/Object;", line = 12)
	public static Object method36483(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(11) ByteBuffer local11 = ByteBuffer.allocateDirect(arg0.length);
			local11.position(0);
			local11.put(arg0);
			return local11;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!zr", name = "l", descriptor = "([BZ)Ljava/lang/Object;", line = 12)
	public static Object method36484(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(11) ByteBuffer local11 = ByteBuffer.allocateDirect(arg0.length);
			local11.position(0);
			local11.put(arg0);
			return local11;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!zr", name = "p", descriptor = "(I)[Lclient!mk;", line = 12)
	public static Class402[] method36485() {
		return new Class402[] { Class402.aClass402_12, Class402.aClass402_11, Class402.aClass402_10 };
	}

	@OriginalMember(owner = "client!zr", name = "q", descriptor = "(Ljava/lang/Object;Z)[B", line = 25)
	public static byte[] method36486(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return arg1 ? Arrays.copyOf(local11, local11.length) : local11;
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(26) ByteBuffer local26 = (ByteBuffer) arg0;
			@Pc(30) byte[] local30 = new byte[local26.capacity()];
			local26.position(0);
			local26.get(local30);
			return local30;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!zr", name = "t", descriptor = "(Ljava/lang/Object;Z)[B", line = 25)
	public static byte[] method36487(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return arg1 ? Arrays.copyOf(local11, local11.length) : local11;
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(26) ByteBuffer local26 = (ByteBuffer) arg0;
			@Pc(30) byte[] local30 = new byte[local26.capacity()];
			local26.position(0);
			local26.get(local30);
			return local30;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!zr", name = "x", descriptor = "(Ljava/lang/Object;II)[B", line = 43)
	public static byte[] method36488(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return Arrays.copyOfRange(local11, arg1, arg1 + arg2);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(24) ByteBuffer local24 = (ByteBuffer) arg0;
			@Pc(27) byte[] local27 = new byte[arg2];
			local24.position(arg1);
			local24.get(local27, 0, arg2);
			return local27;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!zr", name = "d", descriptor = "(Ljava/lang/Object;II)[B", line = 43)
	public static byte[] method36489(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return Arrays.copyOfRange(local11, arg1, arg1 + arg2);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(24) ByteBuffer local24 = (ByteBuffer) arg0;
			@Pc(27) byte[] local27 = new byte[arg2];
			local24.position(arg1);
			local24.get(local27, 0, arg2);
			return local27;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!zr", name = "ak", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V", line = 718)
	public static final void method36490(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Class470.aCanvas6.getGraphics();
			if (Class470.aFont2 == null) {
				Class470.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(77) int local77;
			@Pc(85) int local85;
			try {
				if (Class267.anImage4 == null) {
					Class267.anImage4 = Class470.aCanvas6.createImage(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
				}
				@Pc(56) Graphics local56 = Class267.anImage4.getGraphics();
				local56.setColor(Color.black);
				local56.fillRect(0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
				local77 = Class149_Sub4.anInt2368 * 1771907305 / 2 - 152;
				local85 = Class19.anInt108 * -1091172141 / 2 - 18;
				local56.setColor(arg3);
				local56.drawRect(local77, local85, 303, 33);
				local56.setColor(arg2);
				local56.fillRect(local77 + 2, local85 + 2, arg0 * 3, 30);
				local56.setColor(Color.black);
				local56.drawRect(local77 + 1, local85 + 1, 301, 31);
				local56.fillRect(local77 + 2 + arg0 * 3, local85 + 2, 300 - arg0 * 3, 30);
				local56.setFont(Class470.aFont2);
				local56.setColor(arg4);
				local56.drawString(arg1, local77 + (304 - arg1.length() * 6) / 2, local85 + 22);
				if (Class504.aString152 != null) {
					local56.setFont(Class470.aFont2);
					local56.setColor(arg4);
					local56.drawString(Class504.aString152, Class149_Sub4.anInt2368 * 1771907305 / 2 - Class504.aString152.length() * 6 / 2, Class19.anInt108 * -1091172141 / 2 - 26);
				}
				local2.drawImage(Class267.anImage4, 0, 0, null);
			} catch (@Pc(201) Exception local201) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
				local77 = Class149_Sub4.anInt2368 * 1771907305 / 2 - 152;
				local85 = Class19.anInt108 * -1091172141 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local77, local85, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local77 + 2, local85 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local77 + 1, local85 + 1, 301, 31);
				local2.fillRect(local77 + 2 + arg0 * 3, local85 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class470.aFont2);
				local2.setColor(arg4);
				if (Class504.aString152 != null) {
					local2.setFont(Class470.aFont2);
					local2.setColor(arg4);
					local2.drawString(Class504.aString152, Class149_Sub4.anInt2368 * 1771907305 / 2 - Class504.aString152.length() * 6 / 2, Class19.anInt108 * -1091172141 / 2 - 26);
				}
				local2.drawString(arg1, local77 + (304 - arg1.length() * 6) / 2, local85 + 22);
			}
		} catch (@Pc(339) Exception local339) {
			Class470.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!zr", name = "kx", descriptor = "(IIIIIIIII)V", line = 10287)
	static final void method36491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Class211.method25607(arg0, null)) {
			Class143_Sub38.method16162(Class35_Sub11.aClass273Array1[arg0].method26533(), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7 < 0);
		} else if (arg7 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 108; local14++) {
				client.aBooleanArray17[local14] = true;
			}
		} else {
			client.aBooleanArray17[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!zr", name = "ahl", descriptor = "(Lclient!yf;I)V", line = 10641)
	static final void method36492(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
	}

	@OriginalMember(owner = "client!zr", name = "ang", descriptor = "(Lclient!yf;I)V", line = 11872)
	static final void method36493(@OriginalArg(0) Class665 arg0) {
		if (Class597.aClass107_Sub1_2.method8879() != Class321.aClass321_3) {
			throw new RuntimeException();
		}
		((Class149_Sub3) Class597.aClass107_Sub1_2.method8873()).method16723(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
	}
}
