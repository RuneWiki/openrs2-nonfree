package com.jagex;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahx")
public final class Class65_Sub1 extends Class65 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ahx", name = "db", descriptor = "I")
	static final int anInt1778 = 128;

	@OriginalMember(owner = "client!ahx", name = "dh", descriptor = "I")
	static final int anInt1779 = 112;

	@OriginalMember(owner = "client!ahx", name = "dq", descriptor = "[I")
	static int[] anIntArray202 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ahx", name = "dg", descriptor = "Ljava/awt/Component;")
	Component aComponent2;

	@OriginalMember(owner = "client!ahx", name = "dp", descriptor = "Lclient!wk;")
	Class553 aClass553_27 = new Class553();

	@OriginalMember(owner = "client!ahx", name = "dk", descriptor = "Lclient!wk;")
	Class553 aClass553_28 = new Class553();

	@OriginalMember(owner = "client!ahx", name = "dy", descriptor = "[Z")
	boolean[] aBooleanArray12 = new boolean[112];

	@OriginalMember(owner = "client!ahx", name = "w", descriptor = "()V", line = 20)
	static void method13164() {
		anIntArray202[44] = 71;
		anIntArray202[45] = 26;
		anIntArray202[46] = 72;
		anIntArray202[47] = 73;
		anIntArray202[59] = 57;
		anIntArray202[61] = 27;
		anIntArray202[91] = 42;
		anIntArray202[92] = 74;
		anIntArray202[93] = 43;
		anIntArray202[192] = 28;
		anIntArray202[222] = 58;
		anIntArray202[520] = 59;
	}

	@OriginalMember(owner = "client!ahx", name = "i", descriptor = "()V", line = 20)
	static void method13165() {
		anIntArray202[44] = 71;
		anIntArray202[45] = 26;
		anIntArray202[46] = 72;
		anIntArray202[47] = 73;
		anIntArray202[59] = 57;
		anIntArray202[61] = 27;
		anIntArray202[91] = 42;
		anIntArray202[92] = 74;
		anIntArray202[93] = 43;
		anIntArray202[192] = 28;
		anIntArray202[222] = 58;
		anIntArray202[520] = 59;
	}

	@OriginalMember(owner = "client!ahx", name = "o", descriptor = "()V", line = 20)
	static void method13167() {
		anIntArray202[44] = 71;
		anIntArray202[45] = 26;
		anIntArray202[46] = 72;
		anIntArray202[47] = 73;
		anIntArray202[59] = 57;
		anIntArray202[61] = 27;
		anIntArray202[91] = 42;
		anIntArray202[92] = 74;
		anIntArray202[93] = 43;
		anIntArray202[192] = 28;
		anIntArray202[222] = 58;
		anIntArray202[520] = 59;
	}

	@OriginalMember(owner = "client!ahx", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 34)
	Class65_Sub1(@OriginalArg(0) Component arg0) {
		Class407.method27661();
		this.method13157(arg0);
	}

	@OriginalMember(owner = "client!ahx", name = "d", descriptor = "(Ljava/awt/Component;B)V", line = 40)
	void method13157(@OriginalArg(0) Component arg0) {
		this.method13158();
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ahx", name = "f", descriptor = "(Ljava/awt/Component;)V", line = 40)
	void method13166(@OriginalArg(0) Component arg0) {
		this.method13158();
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ahx", name = "q", descriptor = "(I)V", line = 47)
	void method13158() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(16) int local16 = 0; local16 < 112; local16++) {
			this.aBooleanArray12[local16] = false;
		}
		this.aClass553_27.method32701();
		this.aClass553_28.method32701();
	}

	@OriginalMember(owner = "client!ahx", name = "k", descriptor = "()V", line = 47)
	void method13176() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(16) int local16 = 0; local16 < 112; local16++) {
			this.aBooleanArray12[local16] = false;
		}
		this.aClass553_27.method32701();
		this.aClass553_28.method32701();
	}

	@OriginalMember(owner = "client!ahx", name = "l", descriptor = "(Ljava/lang/CharSequence;Lclient!zm;I)Ljava/lang/String;", line = 52)
	public static String method13183(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class623 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(9) int local9 = arg0.length();
		while (local6 < local9 && Class228.method24520(arg0.charAt(local6))) {
			local6++;
		}
		while (local9 > local6 && Class228.method24520(arg0.charAt(local9 - 1))) {
			local9--;
		}
		@Pc(37) int local37 = local9 - local6;
		if (local37 < 1 || local37 > Class584.method33269(arg1)) {
			return null;
		}
		@Pc(52) StringBuilder local52 = new StringBuilder(local37);
		for (@Pc(54) int local54 = local6; local54 < local9; local54++) {
			@Pc(61) char local61 = arg0.charAt(local54);
			if (Class135.method22923(local61)) {
				@Pc(70) char local70 = Class197.method24123(local61);
				if (local70 != 0) {
					local52.append(local70);
				}
			}
		}
		if (local52.length() == 0) {
			return null;
		} else {
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "at", descriptor = "(ICI)V", line = 57)
	void method13168(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class3_Sub28 local3 = new Class3_Sub28();
		local3.anInt1328 = arg0 * -316739825;
		local3.aChar11 = arg1;
		local3.anInt1327 = arg2 * -635964799;
		local3.aLong69 = Class176.method23413() * -3564609389710501267L;
		this.aClass553_28.method32702(local3);
	}

	@OriginalMember(owner = "client!ahx", name = "m", descriptor = "(ICIB)V", line = 57)
	void method13169(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class3_Sub28 local3 = new Class3_Sub28();
		local3.anInt1328 = arg0 * -316739825;
		local3.aChar11 = arg1;
		local3.anInt1327 = arg2 * -635964799;
		local3.aLong69 = Class176.method23413() * -3564609389710501267L;
		this.aClass553_28.method32702(local3);
	}

	@OriginalMember(owner = "client!ahx", name = "af", descriptor = "(ICI)V", line = 57)
	void method13179(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class3_Sub28 local3 = new Class3_Sub28();
		local3.anInt1328 = arg0 * -316739825;
		local3.aChar11 = arg1;
		local3.anInt1327 = arg2 * -635964799;
		local3.aLong69 = Class176.method23413() * -3564609389710501267L;
		this.aClass553_28.method32702(local3);
	}

	@OriginalMember(owner = "client!ahx", name = "l", descriptor = "(S)Lclient!qd;", line = 66)
	@Override
	public Interface46 method13138() {
		return (Interface46) this.aClass553_27.method32718();
	}

	@OriginalMember(owner = "client!ahx", name = "x", descriptor = "()Lclient!qd;", line = 66)
	@Override
	public Interface46 method13140() {
		return (Interface46) this.aClass553_27.method32718();
	}

	@OriginalMember(owner = "client!ahx", name = "g", descriptor = "(IB)Z", line = 70)
	@Override
	public boolean method13145(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray12[arg0] : false;
	}

	@OriginalMember(owner = "client!ahx", name = "y", descriptor = "(I)Z", line = 70)
	@Override
	public boolean method13142(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray12[arg0] : false;
	}

	@OriginalMember(owner = "client!ahx", name = "s", descriptor = "(I)Z", line = 70)
	@Override
	public boolean method13137(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray12[arg0] : false;
	}

	@OriginalMember(owner = "client!ahx", name = "u", descriptor = "(I)Z", line = 70)
	@Override
	public boolean method13141(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray12[arg0] : false;
	}

	@OriginalMember(owner = "client!ahx", name = "a", descriptor = "(I)V", line = 75)
	@Override
	public synchronized void method13135() {
		this.aClass553_27.method32701();
		for (@Pc(9) Class3_Sub28 local9 = (Class3_Sub28) this.aClass553_28.method32718(); local9 != null; local9 = (Class3_Sub28) this.aClass553_28.method32718()) {
			local9.anInt1330 = this.method13156() * -1049729465;
			if (local9.anInt1328 * -1944838161 == 0) {
				if (!this.aBooleanArray12[local9.anInt1327 * 1258179969]) {
					@Pc(37) Class3_Sub28 local37 = new Class3_Sub28();
					local37.anInt1328 = 0;
					local37.aChar11 = (char) 65535;
					local37.anInt1327 = local9.anInt1327;
					local37.aLong69 = local9.aLong69;
					local37.anInt1330 = local9.anInt1330;
					this.aClass553_27.method32702(local37);
					this.aBooleanArray12[local9.anInt1327 * 1258179969] = true;
				}
				local9.anInt1328 = -633479650;
				this.aClass553_27.method32702(local9);
			} else if (local9.anInt1328 * -1944838161 == 1) {
				if (this.aBooleanArray12[local9.anInt1327 * 1258179969]) {
					this.aClass553_27.method32702(local9);
					this.aBooleanArray12[local9.anInt1327 * 1258179969] = false;
				}
			} else if (local9.anInt1328 * -1944838161 == -1) {
				for (@Pc(119) int local119 = 0; local119 < 112; local119++) {
					if (this.aBooleanArray12[local119]) {
						@Pc(131) Class3_Sub28 local131 = new Class3_Sub28();
						local131.anInt1328 = -316739825;
						local131.aChar11 = (char) 65535;
						local131.anInt1327 = local119 * -635964799;
						local131.aLong69 = local9.aLong69;
						local131.anInt1330 = local9.anInt1330;
						this.aClass553_27.method32702(local131);
						this.aBooleanArray12[local119] = false;
					}
				}
			} else if (local9.anInt1328 * -1944838161 == 3) {
				this.aClass553_27.method32702(local9);
			}
		}
	}

	@OriginalMember(owner = "client!ahx", name = "b", descriptor = "()V", line = 75)
	@Override
	public synchronized void method13139() {
		this.aClass553_27.method32701();
		for (@Pc(9) Class3_Sub28 local9 = (Class3_Sub28) this.aClass553_28.method32718(); local9 != null; local9 = (Class3_Sub28) this.aClass553_28.method32718()) {
			local9.anInt1330 = this.method13156() * -1049729465;
			if (local9.anInt1328 * -1944838161 == 0) {
				if (!this.aBooleanArray12[local9.anInt1327 * 1258179969]) {
					@Pc(37) Class3_Sub28 local37 = new Class3_Sub28();
					local37.anInt1328 = 0;
					local37.aChar11 = (char) 65535;
					local37.anInt1327 = local9.anInt1327;
					local37.aLong69 = local9.aLong69;
					local37.anInt1330 = local9.anInt1330;
					this.aClass553_27.method32702(local37);
					this.aBooleanArray12[local9.anInt1327 * 1258179969] = true;
				}
				local9.anInt1328 = -633479650;
				this.aClass553_27.method32702(local9);
			} else if (local9.anInt1328 * -1944838161 == 1) {
				if (this.aBooleanArray12[local9.anInt1327 * 1258179969]) {
					this.aClass553_27.method32702(local9);
					this.aBooleanArray12[local9.anInt1327 * 1258179969] = false;
				}
			} else if (local9.anInt1328 * -1944838161 == -1) {
				for (@Pc(119) int local119 = 0; local119 < 112; local119++) {
					if (this.aBooleanArray12[local119]) {
						@Pc(131) Class3_Sub28 local131 = new Class3_Sub28();
						local131.anInt1328 = -316739825;
						local131.aChar11 = (char) 65535;
						local131.anInt1327 = local119 * -635964799;
						local131.aLong69 = local9.aLong69;
						local131.anInt1330 = local9.anInt1330;
						this.aClass553_27.method32702(local131);
						this.aBooleanArray12[local119] = false;
					}
				}
			} else if (local9.anInt1328 * -1944838161 == 3) {
				this.aClass553_27.method32702(local9);
			}
		}
	}

	@OriginalMember(owner = "client!ahx", name = "v", descriptor = "(B)I", line = 119)
	int method13156() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray12[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray12[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray12[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ahx", name = "ak", descriptor = "()I", line = 119)
	int method13171() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray12[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray12[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray12[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ahx", name = "aa", descriptor = "()I", line = 119)
	int method13172() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray12[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray12[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray12[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ahx", name = "h", descriptor = "(I)V", line = 127)
	@Override
	public void method13146() {
		this.method13158();
	}

	@OriginalMember(owner = "client!ahx", name = "c", descriptor = "()V", line = 127)
	@Override
	public void method13144() {
		this.method13158();
	}

	@OriginalMember(owner = "client!ahx", name = "z", descriptor = "()V", line = 127)
	@Override
	public void method13143() {
		this.method13158();
	}

	@OriginalMember(owner = "client!ahx", name = "t", descriptor = "(Ljava/awt/event/KeyEvent;IB)V", line = 131)
	void method13160(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray202.length) {
			local2 = anIntArray202[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method13169(arg1, (char) 65535, local2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "aj", descriptor = "(Ljava/awt/event/KeyEvent;I)V", line = 131)
	void method13162(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray202.length) {
			local2 = anIntArray202[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method13169(arg1, (char) 65535, local2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "as", descriptor = "(Ljava/awt/event/KeyEvent;I)V", line = 131)
	void method13173(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray202.length) {
			local2 = anIntArray202[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method13169(arg1, (char) 65535, local2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "ah", descriptor = "(Ljava/awt/event/KeyEvent;I)V", line = 131)
	void method13174(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray202.length) {
			local2 = anIntArray202[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method13169(arg1, (char) 65535, local2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "an", descriptor = "(Ljava/awt/event/KeyEvent;I)V", line = 131)
	void method13175(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray202.length) {
			local2 = anIntArray202[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method13169(arg1, (char) 65535, local2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "av", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 147)
	public synchronized void method13161(@OriginalArg(0) KeyEvent arg0) {
		this.method13160(arg0, 0);
	}

	@OriginalMember(owner = "client!ahx", name = "ai", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 147)
	public synchronized void method13177(@OriginalArg(0) KeyEvent arg0) {
		this.method13160(arg0, 0);
	}

	@OriginalMember(owner = "client!ahx", name = "aq", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 147)
	public synchronized void method13178(@OriginalArg(0) KeyEvent arg0) {
		this.method13160(arg0, 0);
	}

	@OriginalMember(owner = "client!ahx", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 147)
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method13160(arg0, 0);
	}

	@OriginalMember(owner = "client!ahx", name = "az", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	public synchronized void method13159(@OriginalArg(0) KeyEvent arg0) {
		this.method13160(arg0, 1);
	}

	@OriginalMember(owner = "client!ahx", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method13160(arg0, 1);
	}

	@OriginalMember(owner = "client!ahx", name = "ax", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	public synchronized void method13170(@OriginalArg(0) KeyEvent arg0) {
		this.method13160(arg0, 1);
	}

	@OriginalMember(owner = "client!ahx", name = "al", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	public synchronized void method13180(@OriginalArg(0) KeyEvent arg0) {
		this.method13160(arg0, 1);
	}

	@OriginalMember(owner = "client!ahx", name = "ao", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	public synchronized void method13181(@OriginalArg(0) KeyEvent arg0) {
		this.method13160(arg0, 1);
	}

	@OriginalMember(owner = "client!ahx", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != 65535 && Class209.method24243(local2)) {
			this.method13169(3, local2, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "ap", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
	public synchronized void method13182(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != 65535 && Class209.method24243(local2)) {
			this.method13169(3, local2, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 161)
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ahx", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 164)
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method13169(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!ahx", name = "cw", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 164)
	public synchronized void method13163(@OriginalArg(0) FocusEvent arg0) {
		this.method13169(-1, '\u0000', 0);
	}
}
