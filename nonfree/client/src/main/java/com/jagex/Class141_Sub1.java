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

@OriginalClass("client!akx")
public final class Class141_Sub1 extends Class141 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!akx", name = "dq", descriptor = "I")
	static final int anInt1999 = 128;

	@OriginalMember(owner = "client!akx", name = "dh", descriptor = "I")
	static final int anInt2000 = 112;

	@OriginalMember(owner = "client!akx", name = "dm", descriptor = "[I")
	static int[] anIntArray219 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!akx", name = "dy", descriptor = "Ljava/awt/Component;")
	Component aComponent2;

	@OriginalMember(owner = "client!akx", name = "dn", descriptor = "Lclient!zm;")
	Class695 aClass695_27 = new Class695();

	@OriginalMember(owner = "client!akx", name = "dv", descriptor = "Lclient!zm;")
	Class695 aClass695_26 = new Class695();

	@OriginalMember(owner = "client!akx", name = "da", descriptor = "[Z")
	boolean[] aBooleanArray9 = new boolean[112];

	@OriginalMember(owner = "client!akx", name = "m", descriptor = "()V", line = 20)
	static void method14799() {
		anIntArray219[44] = 71;
		anIntArray219[45] = 26;
		anIntArray219[46] = 72;
		anIntArray219[47] = 73;
		anIntArray219[59] = 57;
		anIntArray219[61] = 27;
		anIntArray219[91] = 42;
		anIntArray219[92] = 74;
		anIntArray219[93] = 43;
		anIntArray219[192] = 28;
		anIntArray219[222] = 58;
		anIntArray219[520] = 59;
	}

	@OriginalMember(owner = "client!akx", name = "h", descriptor = "()V", line = 20)
	static void method14800() {
		anIntArray219[44] = 71;
		anIntArray219[45] = 26;
		anIntArray219[46] = 72;
		anIntArray219[47] = 73;
		anIntArray219[59] = 57;
		anIntArray219[61] = 27;
		anIntArray219[91] = 42;
		anIntArray219[92] = 74;
		anIntArray219[93] = 43;
		anIntArray219[192] = 28;
		anIntArray219[222] = 58;
		anIntArray219[520] = 59;
	}

	@OriginalMember(owner = "client!akx", name = "a", descriptor = "()V", line = 20)
	static void method14801() {
		anIntArray219[44] = 71;
		anIntArray219[45] = 26;
		anIntArray219[46] = 72;
		anIntArray219[47] = 73;
		anIntArray219[59] = 57;
		anIntArray219[61] = 27;
		anIntArray219[91] = 42;
		anIntArray219[92] = 74;
		anIntArray219[93] = 43;
		anIntArray219[192] = 28;
		anIntArray219[222] = 58;
		anIntArray219[520] = 59;
	}

	@OriginalMember(owner = "client!akx", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 34)
	Class141_Sub1(@OriginalArg(0) Component arg0) {
		Class115_Sub1.method9834();
		this.method14802(arg0);
	}

	@OriginalMember(owner = "client!akx", name = "e", descriptor = "(Ljava/awt/Component;I)V", line = 40)
	void method14802(@OriginalArg(0) Component arg0) {
		this.method14808();
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!akx", name = "ai", descriptor = "(Ljava/awt/Component;)V", line = 40)
	void method14803(@OriginalArg(0) Component arg0) {
		this.method14808();
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!akx", name = "ag", descriptor = "(Ljava/awt/Component;)V", line = 40)
	void method14804(@OriginalArg(0) Component arg0) {
		this.method14808();
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!akx", name = "ao", descriptor = "(Ljava/awt/Component;)V", line = 40)
	void method14805(@OriginalArg(0) Component arg0) {
		this.method14808();
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!akx", name = "aj", descriptor = "(Ljava/awt/Component;)V", line = 40)
	void method14806(@OriginalArg(0) Component arg0) {
		this.method14808();
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!akx", name = "al", descriptor = "(Ljava/awt/Component;)V", line = 40)
	void method14807(@OriginalArg(0) Component arg0) {
		this.method14808();
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!akx", name = "f", descriptor = "(B)V", line = 47)
	void method14808() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(17) int local17 = 0; local17 < 112; local17++) {
			this.aBooleanArray9[local17] = false;
		}
		this.aClass695_27.method36380();
		this.aClass695_26.method36380();
	}

	@OriginalMember(owner = "client!akx", name = "ak", descriptor = "()V", line = 47)
	void method14809() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(17) int local17 = 0; local17 < 112; local17++) {
			this.aBooleanArray9[local17] = false;
		}
		this.aClass695_27.method36380();
		this.aClass695_26.method36380();
	}

	@OriginalMember(owner = "client!akx", name = "ax", descriptor = "(ICI)V", line = 57)
	void method14810(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class77_Sub33 local3 = new Class77_Sub33();
		local3.anInt1728 = arg0 * 1512084637;
		local3.aChar11 = arg1;
		local3.anInt1729 = arg2 * 964326503;
		local3.aLong93 = Class280.method26667() * 8265134375462934379L;
		this.aClass695_26.method36383(local3);
	}

	@OriginalMember(owner = "client!akx", name = "ar", descriptor = "(ICI)V", line = 57)
	void method14811(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class77_Sub33 local3 = new Class77_Sub33();
		local3.anInt1728 = arg0 * 1512084637;
		local3.aChar11 = arg1;
		local3.anInt1729 = arg2 * 964326503;
		local3.aLong93 = Class280.method26667() * 8265134375462934379L;
		this.aClass695_26.method36383(local3);
	}

	@OriginalMember(owner = "client!akx", name = "au", descriptor = "(ICI)V", line = 57)
	void method14812(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class77_Sub33 local3 = new Class77_Sub33();
		local3.anInt1728 = arg0 * 1512084637;
		local3.aChar11 = arg1;
		local3.anInt1729 = arg2 * 964326503;
		local3.aLong93 = Class280.method26667() * 8265134375462934379L;
		this.aClass695_26.method36383(local3);
	}

	@OriginalMember(owner = "client!akx", name = "o", descriptor = "(ICII)V", line = 57)
	void method14813(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class77_Sub33 local3 = new Class77_Sub33();
		local3.anInt1728 = arg0 * 1512084637;
		local3.aChar11 = arg1;
		local3.anInt1729 = arg2 * 964326503;
		local3.aLong93 = Class280.method26667() * 8265134375462934379L;
		this.aClass695_26.method36383(local3);
	}

	@OriginalMember(owner = "client!akx", name = "l", descriptor = "(I)Lclient!tl;", line = 66)
	@Override
	public Interface62 method14785() {
		return (Interface62) this.aClass695_27.method36388();
	}

	@OriginalMember(owner = "client!akx", name = "q", descriptor = "()Lclient!tl;", line = 66)
	@Override
	public Interface62 method14789() {
		return (Interface62) this.aClass695_27.method36388();
	}

	@OriginalMember(owner = "client!akx", name = "w", descriptor = "()Lclient!tl;", line = 66)
	@Override
	public Interface62 method14783() {
		return (Interface62) this.aClass695_27.method36388();
	}

	@OriginalMember(owner = "client!akx", name = "t", descriptor = "()Lclient!tl;", line = 66)
	@Override
	public Interface62 method14788() {
		return (Interface62) this.aClass695_27.method36388();
	}

	@OriginalMember(owner = "client!akx", name = "x", descriptor = "()Lclient!tl;", line = 66)
	@Override
	public Interface62 method14790() {
		return (Interface62) this.aClass695_27.method36388();
	}

	@OriginalMember(owner = "client!akx", name = "v", descriptor = "(IB)Z", line = 70)
	@Override
	public boolean method14784(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray9[arg0] : false;
	}

	@OriginalMember(owner = "client!akx", name = "r", descriptor = "(I)Z", line = 70)
	@Override
	public boolean method14793(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray9[arg0] : false;
	}

	@OriginalMember(owner = "client!akx", name = "d", descriptor = "(I)Z", line = 70)
	@Override
	public boolean method14797(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray9[arg0] : false;
	}

	@OriginalMember(owner = "client!akx", name = "s", descriptor = "(I)Z", line = 70)
	@Override
	public boolean method14792(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray9[arg0] : false;
	}

	@OriginalMember(owner = "client!akx", name = "g", descriptor = "()V", line = 75)
	@Override
	public synchronized void method14794() {
		this.aClass695_27.method36380();
		for (@Pc(9) Class77_Sub33 local9 = (Class77_Sub33) this.aClass695_26.method36388(); local9 != null; local9 = (Class77_Sub33) this.aClass695_26.method36388()) {
			local9.anInt1730 = this.method14815() * -1778146473;
			if (local9.anInt1728 * 1926402485 == 0) {
				if (!this.aBooleanArray9[local9.anInt1729 * -387225769]) {
					@Pc(35) Class77_Sub33 local35 = new Class77_Sub33();
					local35.anInt1728 = 0;
					local35.aChar11 = (char) 65535;
					local35.anInt1729 = local9.anInt1729;
					local35.aLong93 = local9.aLong93;
					local35.anInt1730 = local9.anInt1730;
					this.aClass695_27.method36383(local35);
					this.aBooleanArray9[local9.anInt1729 * -387225769] = true;
				}
				local9.anInt1728 = -1270798022;
				this.aClass695_27.method36383(local9);
			} else if (local9.anInt1728 * 1926402485 == 1) {
				if (this.aBooleanArray9[local9.anInt1729 * -387225769]) {
					this.aClass695_27.method36383(local9);
					this.aBooleanArray9[local9.anInt1729 * -387225769] = false;
				}
			} else if (local9.anInt1728 * 1926402485 == -1) {
				for (@Pc(117) int local117 = 0; local117 < 112; local117++) {
					if (this.aBooleanArray9[local117]) {
						@Pc(129) Class77_Sub33 local129 = new Class77_Sub33();
						local129.anInt1728 = 1512084637;
						local129.aChar11 = (char) 65535;
						local129.anInt1729 = local117 * 964326503;
						local129.aLong93 = local9.aLong93;
						local129.anInt1730 = local9.anInt1730;
						this.aClass695_27.method36383(local129);
						this.aBooleanArray9[local117] = false;
					}
				}
			} else if (local9.anInt1728 * 1926402485 == 3) {
				this.aClass695_27.method36383(local9);
			}
		}
	}

	@OriginalMember(owner = "client!akx", name = "z", descriptor = "()V", line = 75)
	@Override
	public synchronized void method14795() {
		this.aClass695_27.method36380();
		for (@Pc(9) Class77_Sub33 local9 = (Class77_Sub33) this.aClass695_26.method36388(); local9 != null; local9 = (Class77_Sub33) this.aClass695_26.method36388()) {
			local9.anInt1730 = this.method14815() * -1778146473;
			if (local9.anInt1728 * 1926402485 == 0) {
				if (!this.aBooleanArray9[local9.anInt1729 * -387225769]) {
					@Pc(35) Class77_Sub33 local35 = new Class77_Sub33();
					local35.anInt1728 = 0;
					local35.aChar11 = (char) 65535;
					local35.anInt1729 = local9.anInt1729;
					local35.aLong93 = local9.aLong93;
					local35.anInt1730 = local9.anInt1730;
					this.aClass695_27.method36383(local35);
					this.aBooleanArray9[local9.anInt1729 * -387225769] = true;
				}
				local9.anInt1728 = -1270798022;
				this.aClass695_27.method36383(local9);
			} else if (local9.anInt1728 * 1926402485 == 1) {
				if (this.aBooleanArray9[local9.anInt1729 * -387225769]) {
					this.aClass695_27.method36383(local9);
					this.aBooleanArray9[local9.anInt1729 * -387225769] = false;
				}
			} else if (local9.anInt1728 * 1926402485 == -1) {
				for (@Pc(117) int local117 = 0; local117 < 112; local117++) {
					if (this.aBooleanArray9[local117]) {
						@Pc(129) Class77_Sub33 local129 = new Class77_Sub33();
						local129.anInt1728 = 1512084637;
						local129.aChar11 = (char) 65535;
						local129.anInt1729 = local117 * 964326503;
						local129.aLong93 = local9.aLong93;
						local129.anInt1730 = local9.anInt1730;
						this.aClass695_27.method36383(local129);
						this.aBooleanArray9[local117] = false;
					}
				}
			} else if (local9.anInt1728 * 1926402485 == 3) {
				this.aClass695_27.method36383(local9);
			}
		}
	}

	@OriginalMember(owner = "client!akx", name = "c", descriptor = "(I)V", line = 75)
	@Override
	public synchronized void method14791() {
		this.aClass695_27.method36380();
		for (@Pc(9) Class77_Sub33 local9 = (Class77_Sub33) this.aClass695_26.method36388(); local9 != null; local9 = (Class77_Sub33) this.aClass695_26.method36388()) {
			local9.anInt1730 = this.method14815() * -1778146473;
			if (local9.anInt1728 * 1926402485 == 0) {
				if (!this.aBooleanArray9[local9.anInt1729 * -387225769]) {
					@Pc(35) Class77_Sub33 local35 = new Class77_Sub33();
					local35.anInt1728 = 0;
					local35.aChar11 = (char) 65535;
					local35.anInt1729 = local9.anInt1729;
					local35.aLong93 = local9.aLong93;
					local35.anInt1730 = local9.anInt1730;
					this.aClass695_27.method36383(local35);
					this.aBooleanArray9[local9.anInt1729 * -387225769] = true;
				}
				local9.anInt1728 = -1270798022;
				this.aClass695_27.method36383(local9);
			} else if (local9.anInt1728 * 1926402485 == 1) {
				if (this.aBooleanArray9[local9.anInt1729 * -387225769]) {
					this.aClass695_27.method36383(local9);
					this.aBooleanArray9[local9.anInt1729 * -387225769] = false;
				}
			} else if (local9.anInt1728 * 1926402485 == -1) {
				for (@Pc(117) int local117 = 0; local117 < 112; local117++) {
					if (this.aBooleanArray9[local117]) {
						@Pc(129) Class77_Sub33 local129 = new Class77_Sub33();
						local129.anInt1728 = 1512084637;
						local129.aChar11 = (char) 65535;
						local129.anInt1729 = local117 * 964326503;
						local129.aLong93 = local9.aLong93;
						local129.anInt1730 = local9.anInt1730;
						this.aClass695_27.method36383(local129);
						this.aBooleanArray9[local117] = false;
					}
				}
			} else if (local9.anInt1728 * 1926402485 == 3) {
				this.aClass695_27.method36383(local9);
			}
		}
	}

	@OriginalMember(owner = "client!akx", name = "ac", descriptor = "()I", line = 119)
	int method14814() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray9[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray9[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray9[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!akx", name = "b", descriptor = "(I)I", line = 119)
	int method14815() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray9[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray9[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray9[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!akx", name = "ad", descriptor = "()I", line = 119)
	int method14816() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray9[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray9[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray9[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!akx", name = "av", descriptor = "()I", line = 119)
	int method14817() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray9[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray9[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray9[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!akx", name = "i", descriptor = "()V", line = 127)
	@Override
	public void method14787() {
		this.method14808();
	}

	@OriginalMember(owner = "client!akx", name = "y", descriptor = "(B)V", line = 127)
	@Override
	public void method14786() {
		this.method14808();
	}

	@OriginalMember(owner = "client!akx", name = "k", descriptor = "()V", line = 127)
	@Override
	public void method14798() {
		this.method14808();
	}

	@OriginalMember(owner = "client!akx", name = "j", descriptor = "()V", line = 127)
	@Override
	public void method14796() {
		this.method14808();
	}

	@OriginalMember(owner = "client!akx", name = "at", descriptor = "(Ljava/awt/event/KeyEvent;I)V", line = 131)
	void method14818(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray219.length) {
			local2 = anIntArray219[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method14813(arg1, (char) 65535, local2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!akx", name = "n", descriptor = "(Ljava/awt/event/KeyEvent;IB)V", line = 131)
	void method14819(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray219.length) {
			local2 = anIntArray219[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method14813(arg1, (char) 65535, local2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!akx", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 147)
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method14819(arg0, 0);
	}

	@OriginalMember(owner = "client!akx", name = "ae", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 147)
	public synchronized void method14820(@OriginalArg(0) KeyEvent arg0) {
		this.method14819(arg0, 0);
	}

	@OriginalMember(owner = "client!akx", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method14819(arg0, 1);
	}

	@OriginalMember(owner = "client!akx", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != '\uffff' && Class686.method36281(local2)) {
			this.method14813(3, local2, -1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!akx", name = "dw", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 161)
	public void method14821(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!akx", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 161)
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!akx", name = "dy", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 161)
	public void method14822(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!akx", name = "dm", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 161)
	public void method14823(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!akx", name = "dz", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 161)
	public void method14824(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!akx", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 164)
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method14813(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!akx", name = "di", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 164)
	public synchronized void method14825(@OriginalArg(0) FocusEvent arg0) {
		this.method14813(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!akx", name = "dr", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 164)
	public synchronized void method14826(@OriginalArg(0) FocusEvent arg0) {
		this.method14813(-1, '\u0000', 0);
	}

	@OriginalMember(owner = "client!akx", name = "dp", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 164)
	public synchronized void method14827(@OriginalArg(0) FocusEvent arg0) {
		this.method14813(-1, '\u0000', 0);
	}
}
