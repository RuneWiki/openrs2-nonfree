package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gx")
public class Class288 implements Interface39 {

	@OriginalMember(owner = "client!gx", name = "bi", descriptor = "Ljava/util/List;")
	static List aList18 = new ArrayList();

	@OriginalMember(owner = "client!gx", name = "bg", descriptor = "Lclient!er;")
	static Class232 aClass232_75 = new Class232(524288, 1024);

	@OriginalMember(owner = "client!gx", name = "ax", descriptor = "[I")
	int[] anIntArray413;

	@OriginalMember(owner = "client!gx", name = "v", descriptor = "I")
	int anInt3974;

	@OriginalMember(owner = "client!gx", name = "l", descriptor = "I")
	int anInt3975;

	@OriginalMember(owner = "client!gx", name = "y", descriptor = "I")
	int anInt3976;

	@OriginalMember(owner = "client!gx", name = "w", descriptor = "Lclient!mx;")
	Interface48 anInterface48_1;

	@OriginalMember(owner = "client!gx", name = "r", descriptor = "I")
	int anInt3977;

	@OriginalMember(owner = "client!gx", name = "ag", descriptor = "Lclient!gd;")
	Class269 aClass269_1;

	@OriginalMember(owner = "client!gx", name = "s", descriptor = "I")
	int anInt3978;

	@OriginalMember(owner = "client!gx", name = "al", descriptor = "Lclient!gd;")
	Class269 aClass269_2;

	@OriginalMember(owner = "client!gx", name = "g", descriptor = "I")
	int anInt3979;

	@OriginalMember(owner = "client!gx", name = "c", descriptor = "I")
	int anInt3980;

	@OriginalMember(owner = "client!gx", name = "k", descriptor = "[Lclient!gv;")
	Class286[] aClass286Array2;

	@OriginalMember(owner = "client!gx", name = "i", descriptor = "I")
	int anInt3981;

	@OriginalMember(owner = "client!gx", name = "p", descriptor = "I")
	int anInt3982;

	@OriginalMember(owner = "client!gx", name = "b", descriptor = "[I")
	int[] anIntArray414;

	@OriginalMember(owner = "client!gx", name = "e", descriptor = "[Lclient!ge;")
	Class270[] aClass270Array1;

	@OriginalMember(owner = "client!gx", name = "f", descriptor = "[Lclient!gn;")
	Class278[] aClass278Array1;

	@OriginalMember(owner = "client!gx", name = "o", descriptor = "[Z")
	boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!gx", name = "n", descriptor = "[Lclient!gd;")
	Class269[] aClass269Array1;

	@OriginalMember(owner = "client!gx", name = "a", descriptor = "I")
	int anInt3984;

	@OriginalMember(owner = "client!gx", name = "m", descriptor = "I")
	int anInt3985;

	@OriginalMember(owner = "client!gx", name = "bc", descriptor = "I")
	int anInt3986;

	@OriginalMember(owner = "client!gx", name = "ai", descriptor = "Lclient!gd;")
	Class269 aClass269_3;

	@OriginalMember(owner = "client!gx", name = "bt", descriptor = "I")
	int anInt3987;

	@OriginalMember(owner = "client!gx", name = "au", descriptor = "Lclient!gd;")
	Class269 aClass269_4;

	@OriginalMember(owner = "client!gx", name = "ao", descriptor = "Lclient!gd;")
	Class269 aClass269_5;

	@OriginalMember(owner = "client!gx", name = "ak", descriptor = "Lclient!gd;")
	Class269 aClass269_6;

	@OriginalMember(owner = "client!gx", name = "as", descriptor = "Z")
	boolean aBoolean685;

	@OriginalMember(owner = "client!gx", name = "ab", descriptor = "I")
	int anInt3988;

	@OriginalMember(owner = "client!gx", name = "ar", descriptor = "[I")
	int[] anIntArray415;

	@OriginalMember(owner = "client!gx", name = "ad", descriptor = "Z")
	boolean aBoolean686;

	@OriginalMember(owner = "client!gx", name = "bz", descriptor = "I")
	int anInt3989;

	@OriginalMember(owner = "client!gx", name = "h", descriptor = "[Z")
	boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!gx", name = "bs", descriptor = "[B")
	byte[] aByteArray71;

	@OriginalMember(owner = "client!gx", name = "aq", descriptor = "Z")
	boolean aBoolean687;

	@OriginalMember(owner = "client!gx", name = "am", descriptor = "Z")
	boolean aBoolean688;

	@OriginalMember(owner = "client!gx", name = "ay", descriptor = "I")
	int anInt3991;

	@OriginalMember(owner = "client!gx", name = "af", descriptor = "I")
	int anInt3992;

	@OriginalMember(owner = "client!gx", name = "an", descriptor = "I")
	int anInt3993;

	@OriginalMember(owner = "client!gx", name = "aa", descriptor = "Z")
	boolean aBoolean689;

	@OriginalMember(owner = "client!gx", name = "ap", descriptor = "I")
	int anInt3994;

	@OriginalMember(owner = "client!gx", name = "aj", descriptor = "[Lclient!gd;")
	Class269[] aClass269Array2;

	@OriginalMember(owner = "client!gx", name = "bj", descriptor = "I")
	int anInt3995;

	@OriginalMember(owner = "client!gx", name = "bb", descriptor = "I")
	int anInt3996;

	@OriginalMember(owner = "client!gx", name = "j", descriptor = "I")
	int anInt3998;

	@OriginalMember(owner = "client!gx", name = "by", descriptor = "[Lclient!gd;")
	Class269[] aClass269Array3;

	@OriginalMember(owner = "client!gx", name = "aw", descriptor = "I")
	int anInt4000;

	@OriginalMember(owner = "client!gx", name = "az", descriptor = "I")
	int anInt4001;

	@OriginalMember(owner = "client!gx", name = "u", descriptor = "[Lclient!gf;")
	Class271[] aClass271Array1;

	@OriginalMember(owner = "client!gx", name = "t", descriptor = "Ljava/util/List;")
	List aList13 = new ArrayList();

	@OriginalMember(owner = "client!gx", name = "q", descriptor = "Lclient!lr;")
	Class385 aClass385_1 = Class385.aClass385_8;

	@OriginalMember(owner = "client!gx", name = "ac", descriptor = "Ljava/util/List;")
	List aList14 = new ArrayList();

	@OriginalMember(owner = "client!gx", name = "av", descriptor = "Lclient!akv;")
	Class77_Sub39 aClass77_Sub39_15 = null;

	@OriginalMember(owner = "client!gx", name = "at", descriptor = "I")
	int anInt3983 = 0;

	@OriginalMember(owner = "client!gx", name = "ae", descriptor = "I")
	int anInt3990 = 0;

	@OriginalMember(owner = "client!gx", name = "ah", descriptor = "Ljava/util/List;")
	List aList15 = new ArrayList();

	@OriginalMember(owner = "client!gx", name = "bv", descriptor = "Ljava/util/List;")
	List aList16 = new ArrayList();

	@OriginalMember(owner = "client!gx", name = "ba", descriptor = "Ljava/util/List;")
	List aList17 = new ArrayList();

	@OriginalMember(owner = "client!gx", name = "bl", descriptor = "Ljava/util/concurrent/atomic/AtomicReference;")
	AtomicReference anAtomicReference1 = new AtomicReference(null);

	@OriginalMember(owner = "client!gx", name = "bd", descriptor = "I")
	int anInt3997 = 0;

	@OriginalMember(owner = "client!gx", name = "bx", descriptor = "Z")
	boolean aBoolean690 = false;

	@OriginalMember(owner = "client!gx", name = "bw", descriptor = "I")
	int anInt3999 = 0;

	@OriginalMember(owner = "client!gx", name = "bu", descriptor = "[Z")
	boolean[] aBooleanArray25 = null;

	@OriginalMember(owner = "client!gx", name = "bf", descriptor = "[Z")
	boolean[] aBooleanArray27 = null;

	@OriginalMember(owner = "client!gx", name = "bn", descriptor = "[Z")
	boolean[] aBooleanArray26 = null;

	@OriginalMember(owner = "client!gx", name = "z", descriptor = "F")
	final float aFloat262;

	@OriginalMember(owner = "client!gx", name = "x", descriptor = "Lclient!ma;")
	Class393 aClass393_1;

	@OriginalMember(owner = "client!gx", name = "d", descriptor = "Lclient!mf;")
	Class397 aClass397_1;

	@OriginalMember(owner = "client!gx", name = "<init>", descriptor = "(F)V", line = 84)
	public Class288(@OriginalArg(0) float arg0) {
		this.aFloat262 = arg0;
		this.aClass393_1 = Class393.aClass393_4;
		this.aClass397_1 = Class397.aClass397_3;
		this.method26885(false);
	}

	@OriginalMember(owner = "client!gx", name = "p", descriptor = "(Z)V", line = 92)
	@Override
	public void method26816(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method26814();
		} else if (this.method26836() == Class385.aClass385_7) {
			this.method26885(true);
			this.method26860(Class385.aClass385_5);
		}
	}

	@OriginalMember(owner = "client!gx", name = "bc", descriptor = "(Z)V", line = 92)
	@Override
	public void method26837(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method26814();
		} else if (this.method26836() == Class385.aClass385_7) {
			this.method26885(true);
			this.method26860(Class385.aClass385_5);
		}
	}

	@OriginalMember(owner = "client!gx", name = "bj", descriptor = "(Z)V", line = 92)
	@Override
	public void method26823(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method26814();
		} else if (this.method26836() == Class385.aClass385_7) {
			this.method26885(true);
			this.method26860(Class385.aClass385_5);
		}
	}

	@OriginalMember(owner = "client!gx", name = "bv", descriptor = "(Z)V", line = 92)
	@Override
	public void method26856(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method26814();
		} else if (this.method26836() == Class385.aClass385_7) {
			this.method26885(true);
			this.method26860(Class385.aClass385_5);
		}
	}

	@OriginalMember(owner = "client!gx", name = "ba", descriptor = "(Z)V", line = 92)
	@Override
	public void method26830(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method26814();
		} else if (this.method26836() == Class385.aClass385_7) {
			this.method26885(true);
			this.method26860(Class385.aClass385_5);
		}
	}

	@OriginalMember(owner = "client!gx", name = "c", descriptor = "()V", line = 102)
	@Override
	public void method26814() {
		if (this.method26836() == Class385.aClass385_4) {
			this.method26885(false);
			this.method26860(Class385.aClass385_3);
		} else {
			this.method26885(false);
			this.method26860(Class385.aClass385_8);
		}
	}

	@OriginalMember(owner = "client!gx", name = "bl", descriptor = "()V", line = 102)
	@Override
	public void method26835() {
		if (this.method26836() == Class385.aClass385_4) {
			this.method26885(false);
			this.method26860(Class385.aClass385_3);
		} else {
			this.method26885(false);
			this.method26860(Class385.aClass385_8);
		}
	}

	@OriginalMember(owner = "client!gx", name = "bd", descriptor = "()V", line = 102)
	@Override
	public void method26828() {
		if (this.method26836() == Class385.aClass385_4) {
			this.method26885(false);
			this.method26860(Class385.aClass385_3);
		} else {
			this.method26885(false);
			this.method26860(Class385.aClass385_8);
		}
	}

	@OriginalMember(owner = "client!gx", name = "by", descriptor = "()V", line = 102)
	@Override
	public void method26829() {
		if (this.method26836() == Class385.aClass385_4) {
			this.method26885(false);
			this.method26860(Class385.aClass385_3);
		} else {
			this.method26885(false);
			this.method26860(Class385.aClass385_8);
		}
	}

	@OriginalMember(owner = "client!gx", name = "bb", descriptor = "()V", line = 102)
	@Override
	public void method26827() {
		if (this.method26836() == Class385.aClass385_4) {
			this.method26885(false);
			this.method26860(Class385.aClass385_3);
		} else {
			this.method26885(false);
			this.method26860(Class385.aClass385_8);
		}
	}

	@OriginalMember(owner = "client!gx", name = "bx", descriptor = "()Lclient!lr;", line = 113)
	@Override
	public Class385 method26831() {
		return this.aClass385_1;
	}

	@OriginalMember(owner = "client!gx", name = "bw", descriptor = "()Lclient!lr;", line = 113)
	@Override
	public Class385 method26812() {
		return this.aClass385_1;
	}

	@OriginalMember(owner = "client!gx", name = "v", descriptor = "()Lclient!lr;", line = 113)
	@Override
	public Class385 method26836() {
		return this.aClass385_1;
	}

	@OriginalMember(owner = "client!gx", name = "l", descriptor = "(Lclient!lr;)V", line = 117)
	void method26860(@OriginalArg(0) Class385 arg0) {
		this.aClass385_1 = arg0;
	}

	@OriginalMember(owner = "client!gx", name = "y", descriptor = "(Lclient!mx;)V", line = 121)
	@Override
	public void method26808(@OriginalArg(0) Interface48 arg0) {
		this.anInterface48_1 = arg0;
	}

	@OriginalMember(owner = "client!gx", name = "bi", descriptor = "(Lclient!mx;)V", line = 121)
	@Override
	public void method26832(@OriginalArg(0) Interface48 arg0) {
		this.anInterface48_1 = arg0;
	}

	@OriginalMember(owner = "client!gx", name = "bg", descriptor = "(Lclient!mx;)V", line = 121)
	@Override
	public void method26833(@OriginalArg(0) Interface48 arg0) {
		this.anInterface48_1 = arg0;
	}

	@OriginalMember(owner = "client!gx", name = "bs", descriptor = "(Lclient!mx;)V", line = 121)
	@Override
	public void method26834(@OriginalArg(0) Interface48 arg0) {
		this.anInterface48_1 = arg0;
	}

	@OriginalMember(owner = "client!gx", name = "bt", descriptor = "(Lclient!akv;)V", line = 125)
	@Override
	public void method26820(@OriginalArg(0) Class77_Sub39 arg0) {
		if (this.method26836() == Class385.aClass385_2 || this.method26836() == Class385.aClass385_7) {
			if (arg0 != null) {
				arg0.method22401();
			}
		} else if (arg0 == null) {
			@Pc(33) boolean local33 = this.aBoolean690 && (this.anInt3986 > 0 && this.anInt3995 < this.anInt3986 || this.anInt3986 < 0);
			if (this.aList15.isEmpty()) {
				if (!local33) {
					this.method26929();
					this.method26860(Class385.aClass385_7);
				}
			} else if (!local33) {
				this.method26929();
				this.method26860(Class385.aClass385_2);
			}
			if (local33) {
				this.method26885(true);
			}
		} else {
			this.method26948(arg0);
		}
	}

	@OriginalMember(owner = "client!gx", name = "bz", descriptor = "(Lclient!akv;)V", line = 125)
	@Override
	public void method26853(@OriginalArg(0) Class77_Sub39 arg0) {
		if (this.method26836() == Class385.aClass385_2 || this.method26836() == Class385.aClass385_7) {
			if (arg0 != null) {
				arg0.method22401();
			}
		} else if (arg0 == null) {
			@Pc(33) boolean local33 = this.aBoolean690 && (this.anInt3986 > 0 && this.anInt3995 < this.anInt3986 || this.anInt3986 < 0);
			if (this.aList15.isEmpty()) {
				if (!local33) {
					this.method26929();
					this.method26860(Class385.aClass385_7);
				}
			} else if (!local33) {
				this.method26929();
				this.method26860(Class385.aClass385_2);
			}
			if (local33) {
				this.method26885(true);
			}
		} else {
			this.method26948(arg0);
		}
	}

	@OriginalMember(owner = "client!gx", name = "w", descriptor = "(Lclient!akv;)V", line = 125)
	@Override
	public void method26809(@OriginalArg(0) Class77_Sub39 arg0) {
		if (this.method26836() == Class385.aClass385_2 || this.method26836() == Class385.aClass385_7) {
			if (arg0 != null) {
				arg0.method22401();
			}
		} else if (arg0 == null) {
			@Pc(33) boolean local33 = this.aBoolean690 && (this.anInt3986 > 0 && this.anInt3995 < this.anInt3986 || this.anInt3986 < 0);
			if (this.aList15.isEmpty()) {
				if (!local33) {
					this.method26929();
					this.method26860(Class385.aClass385_7);
				}
			} else if (!local33) {
				this.method26929();
				this.method26860(Class385.aClass385_2);
			}
			if (local33) {
				this.method26885(true);
			}
		} else {
			this.method26948(arg0);
		}
	}

	@OriginalMember(owner = "client!gx", name = "bf", descriptor = "()V", line = 150)
	@Override
	public void method26838() {
		if (this.method26836() == Class385.aClass385_3 || this.method26836() == Class385.aClass385_8 || this.method26836() == Class385.aClass385_5) {
			this.method26860(Class385.aClass385_4);
			this.method26890();
		}
	}

	@OriginalMember(owner = "client!gx", name = "t", descriptor = "()V", line = 150)
	@Override
	public void method26810() {
		if (this.method26836() == Class385.aClass385_3 || this.method26836() == Class385.aClass385_8 || this.method26836() == Class385.aClass385_5) {
			this.method26860(Class385.aClass385_4);
			this.method26890();
		}
	}

	@OriginalMember(owner = "client!gx", name = "bu", descriptor = "()V", line = 150)
	@Override
	public void method26825() {
		if (this.method26836() == Class385.aClass385_3 || this.method26836() == Class385.aClass385_8 || this.method26836() == Class385.aClass385_5) {
			this.method26860(Class385.aClass385_4);
			this.method26890();
		}
	}

	@OriginalMember(owner = "client!gx", name = "bn", descriptor = "(I)Lclient!akv;", line = 158)
	@Override
	public Class77_Sub39 method26839(@OriginalArg(0) int arg0) {
		return this.method26968(arg0);
	}

	@OriginalMember(owner = "client!gx", name = "bm", descriptor = "(I)Lclient!akv;", line = 158)
	@Override
	public Class77_Sub39 method26841(@OriginalArg(0) int arg0) {
		return this.method26968(arg0);
	}

	@OriginalMember(owner = "client!gx", name = "bo", descriptor = "(I)Lclient!akv;", line = 158)
	@Override
	public Class77_Sub39 method26842(@OriginalArg(0) int arg0) {
		return this.method26968(arg0);
	}

	@OriginalMember(owner = "client!gx", name = "bk", descriptor = "(I)Lclient!akv;", line = 158)
	@Override
	public Class77_Sub39 method26843(@OriginalArg(0) int arg0) {
		return this.method26968(arg0);
	}

	@OriginalMember(owner = "client!gx", name = "q", descriptor = "(I)Lclient!akv;", line = 158)
	@Override
	public Class77_Sub39 method26826(@OriginalArg(0) int arg0) {
		return this.method26968(arg0);
	}

	@OriginalMember(owner = "client!gx", name = "bp", descriptor = "(I)Lclient!akv;", line = 158)
	@Override
	public Class77_Sub39 method26848(@OriginalArg(0) int arg0) {
		return this.method26968(arg0);
	}

	@OriginalMember(owner = "client!gx", name = "x", descriptor = "()I", line = 163)
	@Override
	public int method26840() {
		return this.method26974();
	}

	@OriginalMember(owner = "client!gx", name = "bq", descriptor = "()I", line = 163)
	@Override
	public int method26845() {
		return this.method26974();
	}

	@OriginalMember(owner = "client!gx", name = "br", descriptor = "()I", line = 163)
	@Override
	public int method26844() {
		return this.method26974();
	}

	@OriginalMember(owner = "client!gx", name = "bh", descriptor = "()I", line = 163)
	@Override
	public int method26846() {
		return this.method26974();
	}

	@OriginalMember(owner = "client!gx", name = "d", descriptor = "(I)I", line = 167)
	@Override
	public int method26817(@OriginalArg(0) int arg0) {
		return arg0 / (this.method26811().anInt4593 * -1204190425 / 8);
	}

	@OriginalMember(owner = "client!gx", name = "be", descriptor = "(I)I", line = 167)
	@Override
	public int method26847(@OriginalArg(0) int arg0) {
		return arg0 / (this.method26811().anInt4593 * -1204190425 / 8);
	}

	@OriginalMember(owner = "client!gx", name = "s", descriptor = "(I)I", line = 171)
	@Override
	public int method26818(@OriginalArg(0) int arg0) {
		return arg0 * (this.method26811().anInt4593 * -1204190425 / 8);
	}

	@OriginalMember(owner = "client!gx", name = "cb", descriptor = "(I)I", line = 171)
	@Override
	public int method26857(@OriginalArg(0) int arg0) {
		return arg0 * (this.method26811().anInt4593 * -1204190425 / 8);
	}

	@OriginalMember(owner = "client!gx", name = "cg", descriptor = "(I)I", line = 171)
	@Override
	public int method26849(@OriginalArg(0) int arg0) {
		return arg0 * (this.method26811().anInt4593 * -1204190425 / 8);
	}

	@OriginalMember(owner = "client!gx", name = "r", descriptor = "()I", line = 175)
	int method26861() {
		if (!this.method26819()) {
			throw new RuntimeException("");
		}
		return this.anInt3982;
	}

	@OriginalMember(owner = "client!gx", name = "cc", descriptor = "()I", line = 175)
	int method26862() {
		if (!this.method26819()) {
			throw new RuntimeException("");
		}
		return this.anInt3982;
	}

	@OriginalMember(owner = "client!gx", name = "cf", descriptor = "()I", line = 175)
	int method26863() {
		if (!this.method26819()) {
			throw new RuntimeException("");
		}
		return this.anInt3982;
	}

	@OriginalMember(owner = "client!gx", name = "cl", descriptor = "()I", line = 175)
	int method26864() {
		if (!this.method26819()) {
			throw new RuntimeException("");
		}
		return this.anInt3982;
	}

	@OriginalMember(owner = "client!gx", name = "cp", descriptor = "()Lclient!ma;", line = 182)
	@Override
	public Class393 method26850() {
		return this.aClass393_1;
	}

	@OriginalMember(owner = "client!gx", name = "g", descriptor = "()Lclient!ma;", line = 182)
	@Override
	public Class393 method26811() {
		return this.aClass393_1;
	}

	@OriginalMember(owner = "client!gx", name = "z", descriptor = "()Lclient!mf;", line = 186)
	@Override
	public Class397 method26807() {
		return this.aClass397_1;
	}

	@OriginalMember(owner = "client!gx", name = "fu", descriptor = "()Lclient!mf;", line = 186)
	@Override
	public Class397 method26858() {
		return this.aClass397_1;
	}

	@OriginalMember(owner = "client!gx", name = "fo", descriptor = "()Lclient!mf;", line = 186)
	@Override
	public Class397 method26859() {
		return this.aClass397_1;
	}

	@OriginalMember(owner = "client!gx", name = "fb", descriptor = "(ILclient!ma;Lclient!mf;I)V", line = 190)
	@Override
	public void method26824(@OriginalArg(0) int arg0, @OriginalArg(1) Class393 arg1, @OriginalArg(2) Class397 arg2, @OriginalArg(3) int arg3) {
		this.anInt3978 = arg3;
		if (!this.method26865(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.aClass393_1 = arg1;
		this.aClass397_1 = arg2;
	}

	@OriginalMember(owner = "client!gx", name = "j", descriptor = "(ILclient!ma;Lclient!mf;I)V", line = 190)
	@Override
	public void method26815(@OriginalArg(0) int arg0, @OriginalArg(1) Class393 arg1, @OriginalArg(2) Class397 arg2, @OriginalArg(3) int arg3) {
		this.anInt3978 = arg3;
		if (!this.method26865(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.aClass393_1 = arg1;
		this.aClass397_1 = arg2;
	}

	@OriginalMember(owner = "client!gx", name = "i", descriptor = "(ILclient!ma;Lclient!mf;)Z", line = 199)
	boolean method26865(@OriginalArg(0) int arg0, @OriginalArg(1) Class393 arg1, @OriginalArg(2) Class397 arg2) {
		if (arg1 == Class393.aClass393_4) {
			return true;
		} else if (arg1 == Class393.aClass393_5) {
			return true;
		} else if (arg1 == Class393.aClass393_2) {
			return true;
		} else {
			return arg1 == Class393.aClass393_3;
		}
	}

	@OriginalMember(owner = "client!gx", name = "k", descriptor = "()I", line = 207)
	int method26866() {
		if (!this.aBoolean687) {
			throw new RuntimeException("");
		}
		return this.anInt3980;
	}

	@OriginalMember(owner = "client!gx", name = "cw", descriptor = "()I", line = 207)
	int method26867() {
		if (!this.aBoolean687) {
			throw new RuntimeException("");
		}
		return this.anInt3980;
	}

	@OriginalMember(owner = "client!gx", name = "ck", descriptor = "()I", line = 207)
	int method26868() {
		if (!this.aBoolean687) {
			throw new RuntimeException("");
		}
		return this.anInt3980;
	}

	@OriginalMember(owner = "client!gx", name = "ch", descriptor = "()I", line = 207)
	int method26869() {
		if (!this.aBoolean687) {
			throw new RuntimeException("");
		}
		return this.anInt3980;
	}

	@OriginalMember(owner = "client!gx", name = "u", descriptor = "()I", line = 214)
	@Override
	public int method26806() {
		if (!this.aBoolean687) {
			throw new RuntimeException("");
		}
		return this.method26866() < this.anInt3978 ? this.anInt3978 : this.method26866();
	}

	@OriginalMember(owner = "client!gx", name = "cz", descriptor = "()I", line = 214)
	@Override
	public int method26851() {
		if (!this.aBoolean687) {
			throw new RuntimeException("");
		}
		return this.method26866() < this.anInt3978 ? this.anInt3978 : this.method26866();
	}

	@OriginalMember(owner = "client!gx", name = "e", descriptor = "()Z", line = 221)
	@Override
	public synchronized boolean method26819() {
		return this.aBoolean688;
	}

	@OriginalMember(owner = "client!gx", name = "ca", descriptor = "()Z", line = 221)
	@Override
	public synchronized boolean method26852() {
		return this.aBoolean688;
	}

	@OriginalMember(owner = "client!gx", name = "cr", descriptor = "()Z", line = 221)
	@Override
	public synchronized boolean method26822() {
		return this.aBoolean688;
	}

	@OriginalMember(owner = "client!gx", name = "f", descriptor = "(Z)V", line = 225)
	synchronized void method26870(@OriginalArg(0) boolean arg0) {
		this.aBoolean688 = arg0;
	}

	@OriginalMember(owner = "client!gx", name = "cx", descriptor = "(Z)V", line = 225)
	synchronized void method26871(@OriginalArg(0) boolean arg0) {
		this.aBoolean688 = arg0;
	}

	@OriginalMember(owner = "client!gx", name = "o", descriptor = "(II)[Lclient!gd;", line = 229)
	Class269[] method26872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class269[] local2 = new Class269[arg0];
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			local2[local4] = this.method26873(arg1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!gx", name = "b", descriptor = "(I)Lclient!gd;", line = 237)
	Class269 method26873(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = aClass232_75;
		synchronized (aClass232_75) {
			@Pc(5) Class269 local5 = null;
			local5 = (Class269) aClass232_75.method25861();
			@Pc(12) Class269 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray99.length > arg0 && !local5.aBoolean661 && (local12 == null || local5.aFloatArray99.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray99.length;
				}
				if (local5.aFloatArray99.length == arg0 && !local5.aBoolean661) {
					break;
				}
				local5 = (Class269) aClass232_75.method25863();
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class269(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass232_75.method25835((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt3834 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray99 = local88;
				local5.aBoolean661 = true;
				local5.anInt3835 = arg0;
				if (aClass232_75.method25853() < arg0 * 4) {
				}
				aClass232_75.method25845(local5, (long) local5.anInt3834, local88.length * 4);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray99.length; local65++) {
					local5.aFloatArray99[local65] = 0.0F;
				}
				local5.anInt3835 = arg0;
			}
			local5.aBoolean661 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ct", descriptor = "(I)Lclient!gd;", line = 237)
	Class269 method26874(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = aClass232_75;
		synchronized (aClass232_75) {
			@Pc(5) Class269 local5 = null;
			local5 = (Class269) aClass232_75.method25861();
			@Pc(12) Class269 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray99.length > arg0 && !local5.aBoolean661 && (local12 == null || local5.aFloatArray99.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray99.length;
				}
				if (local5.aFloatArray99.length == arg0 && !local5.aBoolean661) {
					break;
				}
				local5 = (Class269) aClass232_75.method25863();
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class269(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass232_75.method25835((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt3834 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray99 = local88;
				local5.aBoolean661 = true;
				local5.anInt3835 = arg0;
				if (aClass232_75.method25853() < arg0 * 4) {
				}
				aClass232_75.method25845(local5, (long) local5.anInt3834, local88.length * 4);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray99.length; local65++) {
					local5.aFloatArray99[local65] = 0.0F;
				}
				local5.anInt3835 = arg0;
			}
			local5.aBoolean661 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!gx", name = "cm", descriptor = "(I)Lclient!gd;", line = 237)
	Class269 method26875(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = aClass232_75;
		synchronized (aClass232_75) {
			@Pc(5) Class269 local5 = null;
			local5 = (Class269) aClass232_75.method25861();
			@Pc(12) Class269 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray99.length > arg0 && !local5.aBoolean661 && (local12 == null || local5.aFloatArray99.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray99.length;
				}
				if (local5.aFloatArray99.length == arg0 && !local5.aBoolean661) {
					break;
				}
				local5 = (Class269) aClass232_75.method25863();
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class269(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass232_75.method25835((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt3834 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray99 = local88;
				local5.aBoolean661 = true;
				local5.anInt3835 = arg0;
				if (aClass232_75.method25853() < arg0 * 4) {
				}
				aClass232_75.method25845(local5, (long) local5.anInt3834, local88.length * 4);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray99.length; local65++) {
					local5.aFloatArray99[local65] = 0.0F;
				}
				local5.anInt3835 = arg0;
			}
			local5.aBoolean661 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!gx", name = "cv", descriptor = "(I)Lclient!gd;", line = 237)
	Class269 method26876(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = aClass232_75;
		synchronized (aClass232_75) {
			@Pc(5) Class269 local5 = null;
			local5 = (Class269) aClass232_75.method25861();
			@Pc(12) Class269 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray99.length > arg0 && !local5.aBoolean661 && (local12 == null || local5.aFloatArray99.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray99.length;
				}
				if (local5.aFloatArray99.length == arg0 && !local5.aBoolean661) {
					break;
				}
				local5 = (Class269) aClass232_75.method25863();
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class269(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass232_75.method25835((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt3834 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray99 = local88;
				local5.aBoolean661 = true;
				local5.anInt3835 = arg0;
				if (aClass232_75.method25853() < arg0 * 4) {
				}
				aClass232_75.method25845(local5, (long) local5.anInt3834, local88.length * 4);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray99.length; local65++) {
					local5.aFloatArray99[local65] = 0.0F;
				}
				local5.anInt3835 = arg0;
			}
			local5.aBoolean661 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!gx", name = "cu", descriptor = "(I)Lclient!gd;", line = 237)
	Class269 method26877(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = aClass232_75;
		synchronized (aClass232_75) {
			@Pc(5) Class269 local5 = null;
			local5 = (Class269) aClass232_75.method25861();
			@Pc(12) Class269 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray99.length > arg0 && !local5.aBoolean661 && (local12 == null || local5.aFloatArray99.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray99.length;
				}
				if (local5.aFloatArray99.length == arg0 && !local5.aBoolean661) {
					break;
				}
				local5 = (Class269) aClass232_75.method25863();
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class269(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass232_75.method25835((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt3834 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray99 = local88;
				local5.aBoolean661 = true;
				local5.anInt3835 = arg0;
				if (aClass232_75.method25853() < arg0 * 4) {
				}
				aClass232_75.method25845(local5, (long) local5.anInt3834, local88.length * 4);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray99.length; local65++) {
					local5.aFloatArray99[local65] = 0.0F;
				}
				local5.anInt3835 = arg0;
			}
			local5.aBoolean661 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ci", descriptor = "(Lclient!gd;)V", line = 293)
	void method26878(@OriginalArg(0) Class269 arg0) {
		if (arg0 != null) {
			@Pc(5) Class232 local5 = aClass232_75;
			synchronized (aClass232_75) {
				arg0.aBoolean661 = false;
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "co", descriptor = "(Lclient!gd;)V", line = 293)
	void method26879(@OriginalArg(0) Class269 arg0) {
		if (arg0 != null) {
			@Pc(5) Class232 local5 = aClass232_75;
			synchronized (aClass232_75) {
				arg0.aBoolean661 = false;
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "cq", descriptor = "(Lclient!gd;)V", line = 293)
	void method26880(@OriginalArg(0) Class269 arg0) {
		if (arg0 != null) {
			@Pc(5) Class232 local5 = aClass232_75;
			synchronized (aClass232_75) {
				arg0.aBoolean661 = false;
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "cn", descriptor = "(Lclient!gd;)V", line = 293)
	void method26881(@OriginalArg(0) Class269 arg0) {
		if (arg0 != null) {
			@Pc(5) Class232 local5 = aClass232_75;
			synchronized (aClass232_75) {
				arg0.aBoolean661 = false;
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "n", descriptor = "(Lclient!gd;)V", line = 293)
	void method26882(@OriginalArg(0) Class269 arg0) {
		if (arg0 != null) {
			@Pc(5) Class232 local5 = aClass232_75;
			synchronized (aClass232_75) {
				arg0.aBoolean661 = false;
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "a", descriptor = "([Lclient!gd;)V", line = 300)
	void method26883(@OriginalArg(0) Class269[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				this.method26882(arg0[local4]);
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "cj", descriptor = "(Z)V", line = 307)
	synchronized void method26884(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt3998 = 0;
			this.anInt3981 = 0;
			this.aBooleanArray23 = null;
			this.anIntArray414 = null;
			this.method26883(this.aClass269Array3);
			this.aClass269Array3 = null;
			this.method26883(this.aClass269Array1);
			this.aClass269Array1 = null;
			this.anInt3984 = 0;
			this.anInt3985 = 0;
			this.aBooleanArray24 = null;
			this.method26883(this.aClass269Array2);
			this.aClass269Array2 = null;
			this.method26882(this.aClass269_3);
			this.method26882(this.aClass269_1);
			this.method26882(this.aClass269_2);
			this.method26882(this.aClass269_5);
			this.method26882(this.aClass269_6);
			this.method26882(this.aClass269_4);
			this.aClass269_3 = null;
			this.aClass269_1 = null;
			this.aClass269_2 = null;
			this.aClass269_5 = null;
			this.aClass269_6 = null;
			this.aClass269_4 = null;
			this.anIntArray413 = null;
			this.anIntArray415 = null;
		}
		this.anInt3996 = 0;
		@Pc(98) Iterator local98 = this.aList14.iterator();
		while (local98.hasNext()) {
			@Pc(105) Class77_Sub39 local105 = (Class77_Sub39) local98.next();
			local105.method22401();
		}
		this.aList14.clear();
		this.aBoolean686 = false;
		if (this.aClass77_Sub39_15 != null) {
			@Pc(122) Class77_Sub39 local122 = this.aClass77_Sub39_15;
			synchronized (this.aClass77_Sub39_15) {
				this.aClass77_Sub39_15.method22401();
				this.aClass77_Sub39_15 = null;
			}
		}
		this.anInt3983 = 0;
		this.anInt3990 = 0;
		@Pc(162) Class77_Sub39 local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList15;
			synchronized (this.aList15) {
				local155 = this.aList15.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList15.clear();
						break;
					}
					local162 = (Class77_Sub39) local155.next();
					local162.method22401();
				}
			}
			this.anInt3999 = 0;
		}
		local150 = this.aList13;
		synchronized (this.aList13) {
			local155 = this.aList13.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList13.clear();
					break;
				}
				local162 = (Class77_Sub39) local155.next();
				local162.method22401();
			}
		}
		this.aBoolean685 = false;
		this.anInt3991 = 0;
		this.anInt3988 = -1;
		this.anInt4001 = -1;
		if (arg0) {
			this.anInt3995++;
			this.aBoolean689 = true;
			return;
		}
		this.method26870(false);
		this.aBoolean687 = false;
		this.anInt3977 = -1;
		this.anInt3979 = -1;
		this.anInt3986 = 0;
		this.anInt3995 = 0;
		this.anInt3992 = -1;
		this.anInt3993 = -1;
		this.anInt3994 = -1;
		this.anInt4000 = -1;
		this.aBoolean689 = false;
		this.aBoolean690 = false;
	}

	@OriginalMember(owner = "client!gx", name = "m", descriptor = "(Z)V", line = 307)
	synchronized void method26885(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt3998 = 0;
			this.anInt3981 = 0;
			this.aBooleanArray23 = null;
			this.anIntArray414 = null;
			this.method26883(this.aClass269Array3);
			this.aClass269Array3 = null;
			this.method26883(this.aClass269Array1);
			this.aClass269Array1 = null;
			this.anInt3984 = 0;
			this.anInt3985 = 0;
			this.aBooleanArray24 = null;
			this.method26883(this.aClass269Array2);
			this.aClass269Array2 = null;
			this.method26882(this.aClass269_3);
			this.method26882(this.aClass269_1);
			this.method26882(this.aClass269_2);
			this.method26882(this.aClass269_5);
			this.method26882(this.aClass269_6);
			this.method26882(this.aClass269_4);
			this.aClass269_3 = null;
			this.aClass269_1 = null;
			this.aClass269_2 = null;
			this.aClass269_5 = null;
			this.aClass269_6 = null;
			this.aClass269_4 = null;
			this.anIntArray413 = null;
			this.anIntArray415 = null;
		}
		this.anInt3996 = 0;
		@Pc(98) Iterator local98 = this.aList14.iterator();
		while (local98.hasNext()) {
			@Pc(105) Class77_Sub39 local105 = (Class77_Sub39) local98.next();
			local105.method22401();
		}
		this.aList14.clear();
		this.aBoolean686 = false;
		if (this.aClass77_Sub39_15 != null) {
			@Pc(122) Class77_Sub39 local122 = this.aClass77_Sub39_15;
			synchronized (this.aClass77_Sub39_15) {
				this.aClass77_Sub39_15.method22401();
				this.aClass77_Sub39_15 = null;
			}
		}
		this.anInt3983 = 0;
		this.anInt3990 = 0;
		@Pc(162) Class77_Sub39 local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList15;
			synchronized (this.aList15) {
				local155 = this.aList15.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList15.clear();
						break;
					}
					local162 = (Class77_Sub39) local155.next();
					local162.method22401();
				}
			}
			this.anInt3999 = 0;
		}
		local150 = this.aList13;
		synchronized (this.aList13) {
			local155 = this.aList13.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList13.clear();
					break;
				}
				local162 = (Class77_Sub39) local155.next();
				local162.method22401();
			}
		}
		this.aBoolean685 = false;
		this.anInt3991 = 0;
		this.anInt3988 = -1;
		this.anInt4001 = -1;
		if (arg0) {
			this.anInt3995++;
			this.aBoolean689 = true;
			return;
		}
		this.method26870(false);
		this.aBoolean687 = false;
		this.anInt3977 = -1;
		this.anInt3979 = -1;
		this.anInt3986 = 0;
		this.anInt3995 = 0;
		this.anInt3992 = -1;
		this.anInt3993 = -1;
		this.anInt3994 = -1;
		this.anInt4000 = -1;
		this.aBoolean689 = false;
		this.aBoolean690 = false;
	}

	@OriginalMember(owner = "client!gx", name = "cs", descriptor = "(Z)V", line = 307)
	synchronized void method26886(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt3998 = 0;
			this.anInt3981 = 0;
			this.aBooleanArray23 = null;
			this.anIntArray414 = null;
			this.method26883(this.aClass269Array3);
			this.aClass269Array3 = null;
			this.method26883(this.aClass269Array1);
			this.aClass269Array1 = null;
			this.anInt3984 = 0;
			this.anInt3985 = 0;
			this.aBooleanArray24 = null;
			this.method26883(this.aClass269Array2);
			this.aClass269Array2 = null;
			this.method26882(this.aClass269_3);
			this.method26882(this.aClass269_1);
			this.method26882(this.aClass269_2);
			this.method26882(this.aClass269_5);
			this.method26882(this.aClass269_6);
			this.method26882(this.aClass269_4);
			this.aClass269_3 = null;
			this.aClass269_1 = null;
			this.aClass269_2 = null;
			this.aClass269_5 = null;
			this.aClass269_6 = null;
			this.aClass269_4 = null;
			this.anIntArray413 = null;
			this.anIntArray415 = null;
		}
		this.anInt3996 = 0;
		@Pc(98) Iterator local98 = this.aList14.iterator();
		while (local98.hasNext()) {
			@Pc(105) Class77_Sub39 local105 = (Class77_Sub39) local98.next();
			local105.method22401();
		}
		this.aList14.clear();
		this.aBoolean686 = false;
		if (this.aClass77_Sub39_15 != null) {
			@Pc(122) Class77_Sub39 local122 = this.aClass77_Sub39_15;
			synchronized (this.aClass77_Sub39_15) {
				this.aClass77_Sub39_15.method22401();
				this.aClass77_Sub39_15 = null;
			}
		}
		this.anInt3983 = 0;
		this.anInt3990 = 0;
		@Pc(162) Class77_Sub39 local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList15;
			synchronized (this.aList15) {
				local155 = this.aList15.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList15.clear();
						break;
					}
					local162 = (Class77_Sub39) local155.next();
					local162.method22401();
				}
			}
			this.anInt3999 = 0;
		}
		local150 = this.aList13;
		synchronized (this.aList13) {
			local155 = this.aList13.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList13.clear();
					break;
				}
				local162 = (Class77_Sub39) local155.next();
				local162.method22401();
			}
		}
		this.aBoolean685 = false;
		this.anInt3991 = 0;
		this.anInt3988 = -1;
		this.anInt4001 = -1;
		if (arg0) {
			this.anInt3995++;
			this.aBoolean689 = true;
			return;
		}
		this.method26870(false);
		this.aBoolean687 = false;
		this.anInt3977 = -1;
		this.anInt3979 = -1;
		this.anInt3986 = 0;
		this.anInt3995 = 0;
		this.anInt3992 = -1;
		this.anInt3993 = -1;
		this.anInt3994 = -1;
		this.anInt4000 = -1;
		this.aBoolean689 = false;
		this.aBoolean690 = false;
	}

	@OriginalMember(owner = "client!gx", name = "cy", descriptor = "(Z)V", line = 307)
	synchronized void method26887(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt3998 = 0;
			this.anInt3981 = 0;
			this.aBooleanArray23 = null;
			this.anIntArray414 = null;
			this.method26883(this.aClass269Array3);
			this.aClass269Array3 = null;
			this.method26883(this.aClass269Array1);
			this.aClass269Array1 = null;
			this.anInt3984 = 0;
			this.anInt3985 = 0;
			this.aBooleanArray24 = null;
			this.method26883(this.aClass269Array2);
			this.aClass269Array2 = null;
			this.method26882(this.aClass269_3);
			this.method26882(this.aClass269_1);
			this.method26882(this.aClass269_2);
			this.method26882(this.aClass269_5);
			this.method26882(this.aClass269_6);
			this.method26882(this.aClass269_4);
			this.aClass269_3 = null;
			this.aClass269_1 = null;
			this.aClass269_2 = null;
			this.aClass269_5 = null;
			this.aClass269_6 = null;
			this.aClass269_4 = null;
			this.anIntArray413 = null;
			this.anIntArray415 = null;
		}
		this.anInt3996 = 0;
		@Pc(98) Iterator local98 = this.aList14.iterator();
		while (local98.hasNext()) {
			@Pc(105) Class77_Sub39 local105 = (Class77_Sub39) local98.next();
			local105.method22401();
		}
		this.aList14.clear();
		this.aBoolean686 = false;
		if (this.aClass77_Sub39_15 != null) {
			@Pc(122) Class77_Sub39 local122 = this.aClass77_Sub39_15;
			synchronized (this.aClass77_Sub39_15) {
				this.aClass77_Sub39_15.method22401();
				this.aClass77_Sub39_15 = null;
			}
		}
		this.anInt3983 = 0;
		this.anInt3990 = 0;
		@Pc(162) Class77_Sub39 local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList15;
			synchronized (this.aList15) {
				local155 = this.aList15.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList15.clear();
						break;
					}
					local162 = (Class77_Sub39) local155.next();
					local162.method22401();
				}
			}
			this.anInt3999 = 0;
		}
		local150 = this.aList13;
		synchronized (this.aList13) {
			local155 = this.aList13.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList13.clear();
					break;
				}
				local162 = (Class77_Sub39) local155.next();
				local162.method22401();
			}
		}
		this.aBoolean685 = false;
		this.anInt3991 = 0;
		this.anInt3988 = -1;
		this.anInt4001 = -1;
		if (arg0) {
			this.anInt3995++;
			this.aBoolean689 = true;
			return;
		}
		this.method26870(false);
		this.aBoolean687 = false;
		this.anInt3977 = -1;
		this.anInt3979 = -1;
		this.anInt3986 = 0;
		this.anInt3995 = 0;
		this.anInt3992 = -1;
		this.anInt3993 = -1;
		this.anInt3994 = -1;
		this.anInt4000 = -1;
		this.aBoolean689 = false;
		this.aBoolean690 = false;
	}

	@OriginalMember(owner = "client!gx", name = "cd", descriptor = "(Z)V", line = 307)
	synchronized void method26888(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt3998 = 0;
			this.anInt3981 = 0;
			this.aBooleanArray23 = null;
			this.anIntArray414 = null;
			this.method26883(this.aClass269Array3);
			this.aClass269Array3 = null;
			this.method26883(this.aClass269Array1);
			this.aClass269Array1 = null;
			this.anInt3984 = 0;
			this.anInt3985 = 0;
			this.aBooleanArray24 = null;
			this.method26883(this.aClass269Array2);
			this.aClass269Array2 = null;
			this.method26882(this.aClass269_3);
			this.method26882(this.aClass269_1);
			this.method26882(this.aClass269_2);
			this.method26882(this.aClass269_5);
			this.method26882(this.aClass269_6);
			this.method26882(this.aClass269_4);
			this.aClass269_3 = null;
			this.aClass269_1 = null;
			this.aClass269_2 = null;
			this.aClass269_5 = null;
			this.aClass269_6 = null;
			this.aClass269_4 = null;
			this.anIntArray413 = null;
			this.anIntArray415 = null;
		}
		this.anInt3996 = 0;
		@Pc(98) Iterator local98 = this.aList14.iterator();
		while (local98.hasNext()) {
			@Pc(105) Class77_Sub39 local105 = (Class77_Sub39) local98.next();
			local105.method22401();
		}
		this.aList14.clear();
		this.aBoolean686 = false;
		if (this.aClass77_Sub39_15 != null) {
			@Pc(122) Class77_Sub39 local122 = this.aClass77_Sub39_15;
			synchronized (this.aClass77_Sub39_15) {
				this.aClass77_Sub39_15.method22401();
				this.aClass77_Sub39_15 = null;
			}
		}
		this.anInt3983 = 0;
		this.anInt3990 = 0;
		@Pc(162) Class77_Sub39 local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList15;
			synchronized (this.aList15) {
				local155 = this.aList15.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList15.clear();
						break;
					}
					local162 = (Class77_Sub39) local155.next();
					local162.method22401();
				}
			}
			this.anInt3999 = 0;
		}
		local150 = this.aList13;
		synchronized (this.aList13) {
			local155 = this.aList13.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList13.clear();
					break;
				}
				local162 = (Class77_Sub39) local155.next();
				local162.method22401();
			}
		}
		this.aBoolean685 = false;
		this.anInt3991 = 0;
		this.anInt3988 = -1;
		this.anInt4001 = -1;
		if (arg0) {
			this.anInt3995++;
			this.aBoolean689 = true;
			return;
		}
		this.method26870(false);
		this.aBoolean687 = false;
		this.anInt3977 = -1;
		this.anInt3979 = -1;
		this.anInt3986 = 0;
		this.anInt3995 = 0;
		this.anInt3992 = -1;
		this.anInt3993 = -1;
		this.anInt3994 = -1;
		this.anInt4000 = -1;
		this.aBoolean689 = false;
		this.aBoolean690 = false;
	}

	@OriginalMember(owner = "client!gx", name = "do", descriptor = "()V", line = 399)
	void method26889() {
		if (this.method26836() != Class385.aClass385_2) {
			this.method26946();
			if (this.method26836() == Class385.aClass385_4) {
				this.method26860(Class385.aClass385_5);
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "h", descriptor = "()V", line = 399)
	void method26890() {
		if (this.method26836() != Class385.aClass385_2) {
			this.method26946();
			if (this.method26836() == Class385.aClass385_4) {
				this.method26860(Class385.aClass385_5);
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "ce", descriptor = "()V", line = 399)
	void method26891() {
		if (this.method26836() != Class385.aClass385_2) {
			this.method26946();
			if (this.method26836() == Class385.aClass385_4) {
				this.method26860(Class385.aClass385_5);
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "dt", descriptor = "(Lclient!akv;)V", line = 409)
	void method26892(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aList14.add(arg0);
	}

	@OriginalMember(owner = "client!gx", name = "aj", descriptor = "(Lclient!akv;)V", line = 409)
	void method26893(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aList14.add(arg0);
	}

	@OriginalMember(owner = "client!gx", name = "ai", descriptor = "()Z", line = 413)
	boolean method26894() {
		return this.aBoolean686;
	}

	@OriginalMember(owner = "client!gx", name = "dh", descriptor = "()Z", line = 413)
	boolean method26895() {
		return this.aBoolean686;
	}

	@OriginalMember(owner = "client!gx", name = "dv", descriptor = "(Lclient!akv;)Z", line = 417)
	boolean method26896(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22478() == 79 && arg0.method22478() == 103 && arg0.method22478() == 103 && arg0.method22478() == 83;
	}

	@OriginalMember(owner = "client!gx", name = "ag", descriptor = "(Lclient!akv;)Z", line = 417)
	boolean method26897(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22478() == 79 && arg0.method22478() == 103 && arg0.method22478() == 103 && arg0.method22478() == 83;
	}

	@OriginalMember(owner = "client!gx", name = "dq", descriptor = "(Lclient!akv;)Z", line = 417)
	boolean method26898(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22478() == 79 && arg0.method22478() == 103 && arg0.method22478() == 103 && arg0.method22478() == 83;
	}

	@OriginalMember(owner = "client!gx", name = "dn", descriptor = "(Lclient!akv;)Z", line = 417)
	boolean method26899(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22478() == 79 && arg0.method22478() == 103 && arg0.method22478() == 103 && arg0.method22478() == 83;
	}

	@OriginalMember(owner = "client!gx", name = "al", descriptor = "([BII)Z", line = 424)
	boolean method26900(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0[arg1] == arg2) {
			return arg0[arg1 + 1] == 118 && arg0[arg1 + 2] == 111 && arg0[arg1 + 3] == 114 && arg0[arg1 + 4] == 98 && arg0[arg1 + 5] == 105 && arg0[arg1 + 6] == 115;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gx", name = "da", descriptor = "([BII)Z", line = 424)
	boolean method26901(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0[arg1] == arg2) {
			return arg0[arg1 + 1] == 118 && arg0[arg1 + 2] == 111 && arg0[arg1 + 3] == 114 && arg0[arg1 + 4] == 98 && arg0[arg1 + 5] == 105 && arg0[arg1 + 6] == 115;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gx", name = "dy", descriptor = "([BII)Z", line = 424)
	boolean method26902(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0[arg1] == arg2) {
			return arg0[arg1 + 1] == 118 && arg0[arg1 + 2] == 111 && arg0[arg1 + 3] == 114 && arg0[arg1 + 4] == 98 && arg0[arg1 + 5] == 105 && arg0[arg1 + 6] == 115;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gx", name = "dm", descriptor = "([BII)Z", line = 424)
	boolean method26903(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0[arg1] == arg2) {
			return arg0[arg1 + 1] == 118 && arg0[arg1 + 2] == 111 && arg0[arg1 + 3] == 114 && arg0[arg1 + 4] == 98 && arg0[arg1 + 5] == 105 && arg0[arg1 + 6] == 115;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gx", name = "dp", descriptor = "(I)F", line = 434)
	float method26904(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!gx", name = "dr", descriptor = "(I)F", line = 434)
	float method26905(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!gx", name = "ao", descriptor = "(I)F", line = 434)
	float method26906(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!gx", name = "dz", descriptor = "(I)F", line = 434)
	float method26907(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!gx", name = "dw", descriptor = "(I)F", line = 434)
	float method26908(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!gx", name = "di", descriptor = "(I)F", line = 434)
	float method26909(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!gx", name = "de", descriptor = "()I", line = 442)
	int method26910() {
		return this.anInt3987;
	}

	@OriginalMember(owner = "client!gx", name = "du", descriptor = "()I", line = 442)
	int method26911() {
		return this.anInt3987;
	}

	@OriginalMember(owner = "client!gx", name = "ak", descriptor = "()I", line = 442)
	int method26912() {
		return this.anInt3987;
	}

	@OriginalMember(owner = "client!gx", name = "au", descriptor = "()I", line = 446)
	int method26913() {
		return this.anInt3989;
	}

	@OriginalMember(owner = "client!gx", name = "dk", descriptor = "()I", line = 446)
	int method26914() {
		return this.anInt3989;
	}

	@OriginalMember(owner = "client!gx", name = "db", descriptor = "([BI)V", line = 450)
	void method26915(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray71 = arg0;
		this.anInt3987 = arg1;
		this.anInt3989 = 0;
	}

	@OriginalMember(owner = "client!gx", name = "ds", descriptor = "([BI)V", line = 450)
	void method26916(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray71 = arg0;
		this.anInt3987 = arg1;
		this.anInt3989 = 0;
	}

	@OriginalMember(owner = "client!gx", name = "df", descriptor = "([BI)V", line = 450)
	void method26917(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray71 = arg0;
		this.anInt3987 = arg1;
		this.anInt3989 = 0;
	}

	@OriginalMember(owner = "client!gx", name = "ax", descriptor = "([BI)V", line = 450)
	void method26918(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray71 = arg0;
		this.anInt3987 = arg1;
		this.anInt3989 = 0;
	}

	@OriginalMember(owner = "client!gx", name = "ar", descriptor = "()I", line = 456)
	int method26919() {
		@Pc(10) int local10 = this.aByteArray71[this.anInt3987] >> this.anInt3989 & 0x1;
		this.anInt3989++;
		this.anInt3987 += this.anInt3989 >> 3;
		this.anInt3989 &= 0x7;
		return local10;
	}

	@OriginalMember(owner = "client!gx", name = "dc", descriptor = "()I", line = 456)
	int method26920() {
		@Pc(10) int local10 = this.aByteArray71[this.anInt3987] >> this.anInt3989 & 0x1;
		this.anInt3989++;
		this.anInt3987 += this.anInt3989 >> 3;
		this.anInt3989 &= 0x7;
		return local10;
	}

	@OriginalMember(owner = "client!gx", name = "dx", descriptor = "()I", line = 456)
	int method26921() {
		@Pc(10) int local10 = this.aByteArray71[this.anInt3987] >> this.anInt3989 & 0x1;
		this.anInt3989++;
		this.anInt3987 += this.anInt3989 >> 3;
		this.anInt3989 &= 0x7;
		return local10;
	}

	@OriginalMember(owner = "client!gx", name = "dl", descriptor = "()I", line = 456)
	int method26922() {
		@Pc(10) int local10 = this.aByteArray71[this.anInt3987] >> this.anInt3989 & 0x1;
		this.anInt3989++;
		this.anInt3987 += this.anInt3989 >> 3;
		this.anInt3989 &= 0x7;
		return local10;
	}

	@OriginalMember(owner = "client!gx", name = "ad", descriptor = "(I)I", line = 464)
	int method26923(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt3989) {
			local14 = 8 - this.anInt3989;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray71[this.anInt3987] >> this.anInt3989 & local20) << local3;
			this.anInt3989 = 0;
			this.anInt3987++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray71[this.anInt3987] >> this.anInt3989 & local14) << local3;
			this.anInt3989 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gx", name = "dj", descriptor = "(I)I", line = 464)
	int method26924(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt3989) {
			local14 = 8 - this.anInt3989;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray71[this.anInt3987] >> this.anInt3989 & local20) << local3;
			this.anInt3989 = 0;
			this.anInt3987++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray71[this.anInt3987] >> this.anInt3989 & local14) << local3;
			this.anInt3989 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gx", name = "dg", descriptor = "(I)I", line = 464)
	int method26925(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt3989) {
			local14 = 8 - this.anInt3989;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray71[this.anInt3987] >> this.anInt3989 & local20) << local3;
			this.anInt3989 = 0;
			this.anInt3987++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray71[this.anInt3987] >> this.anInt3989 & local14) << local3;
			this.anInt3989 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gx", name = "dd", descriptor = "(I)I", line = 464)
	int method26926(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt3989) {
			local14 = 8 - this.anInt3989;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray71[this.anInt3987] >> this.anInt3989 & local20) << local3;
			this.anInt3989 = 0;
			this.anInt3987++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray71[this.anInt3987] >> this.anInt3989 & local14) << local3;
			this.anInt3989 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gx", name = "ej", descriptor = "()V", line = 484)
	void method26927() {
		this.aByteArray71 = null;
	}

	@OriginalMember(owner = "client!gx", name = "eh", descriptor = "()V", line = 484)
	void method26928() {
		this.aByteArray71 = null;
	}

	@OriginalMember(owner = "client!gx", name = "ac", descriptor = "()V", line = 484)
	void method26929() {
		this.aByteArray71 = null;
	}

	@OriginalMember(owner = "client!gx", name = "eo", descriptor = "()V", line = 484)
	void method26930() {
		this.aByteArray71 = null;
	}

	@OriginalMember(owner = "client!gx", name = "av", descriptor = "()V", line = 488)
	void method26931() {
		@Pc(5) int local5 = this.method26923(8) + 1;
		@Pc(8) Iterator local8 = aList18.iterator();
		@Pc(15) Class279 local15;
		do {
			if (!local8.hasNext()) {
				this.aClass286Array2 = new Class286[local5];
				for (@Pc(69) int local69 = 0; local69 < local5; local69++) {
					if (this.aClass286Array2[local69] == null) {
						this.aClass286Array2[local69] = new Class286();
					}
					this.aClass286Array2[local69].method26733(this);
				}
				@Pc(108) Class279 local108 = new Class279(this.anInt3980, this.anInt3982, this.anInt3974, this.anInt3976, this.anInt3975, this.aClass286Array2);
				aList18.add(local108);
				return;
			}
			local15 = (Class279) local8.next();
		} while (local15.anInt3958 != 0 || local15.anInt3959 != 0 || local15.aClass286Array1.length != local5 || local15.anInt3961 != this.anInt3980 || local15.anInt3957 != this.anInt3982 || local15.anInt3960 != this.anInt3975);
		this.aClass286Array2 = local15.aClass286Array1;
		for (@Pc(48) int local48 = 0; local48 < this.aClass286Array2.length; local48++) {
			this.aClass286Array2[local48].method26732(this);
		}
	}

	@OriginalMember(owner = "client!gx", name = "eq", descriptor = "()V", line = 488)
	void method26932() {
		@Pc(5) int local5 = this.method26923(8) + 1;
		@Pc(8) Iterator local8 = aList18.iterator();
		@Pc(15) Class279 local15;
		do {
			if (!local8.hasNext()) {
				this.aClass286Array2 = new Class286[local5];
				for (@Pc(69) int local69 = 0; local69 < local5; local69++) {
					if (this.aClass286Array2[local69] == null) {
						this.aClass286Array2[local69] = new Class286();
					}
					this.aClass286Array2[local69].method26733(this);
				}
				@Pc(108) Class279 local108 = new Class279(this.anInt3980, this.anInt3982, this.anInt3974, this.anInt3976, this.anInt3975, this.aClass286Array2);
				aList18.add(local108);
				return;
			}
			local15 = (Class279) local8.next();
		} while (local15.anInt3958 != 0 || local15.anInt3959 != 0 || local15.aClass286Array1.length != local5 || local15.anInt3961 != this.anInt3980 || local15.anInt3957 != this.anInt3982 || local15.anInt3960 != this.anInt3975);
		this.aClass286Array2 = local15.aClass286Array1;
		for (@Pc(48) int local48 = 0; local48 < this.aClass286Array2.length; local48++) {
			this.aClass286Array2[local48].method26732(this);
		}
	}

	@OriginalMember(owner = "client!gx", name = "ep", descriptor = "()V", line = 488)
	void method26933() {
		@Pc(5) int local5 = this.method26923(8) + 1;
		@Pc(8) Iterator local8 = aList18.iterator();
		@Pc(15) Class279 local15;
		do {
			if (!local8.hasNext()) {
				this.aClass286Array2 = new Class286[local5];
				for (@Pc(69) int local69 = 0; local69 < local5; local69++) {
					if (this.aClass286Array2[local69] == null) {
						this.aClass286Array2[local69] = new Class286();
					}
					this.aClass286Array2[local69].method26733(this);
				}
				@Pc(108) Class279 local108 = new Class279(this.anInt3980, this.anInt3982, this.anInt3974, this.anInt3976, this.anInt3975, this.aClass286Array2);
				aList18.add(local108);
				return;
			}
			local15 = (Class279) local8.next();
		} while (local15.anInt3958 != 0 || local15.anInt3959 != 0 || local15.aClass286Array1.length != local5 || local15.anInt3961 != this.anInt3980 || local15.anInt3957 != this.anInt3982 || local15.anInt3960 != this.anInt3975);
		this.aClass286Array2 = local15.aClass286Array1;
		for (@Pc(48) int local48 = 0; local48 < this.aClass286Array2.length; local48++) {
			this.aClass286Array2[local48].method26732(this);
		}
	}

	@OriginalMember(owner = "client!gx", name = "at", descriptor = "([BI)V", line = 516)
	void method26934(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3996 = 0;
		if (this.method26819()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method26900(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method26900(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method26900(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method26918(arg0, arg1 + 7);
			local67 = this.method26923(32);
			this.anInt3980 = this.method26923(8);
			this.anInt3982 = this.method26923(32);
			this.anInt3974 = this.method26923(32);
			this.anInt3975 = this.method26923(32);
			this.anInt3976 = this.method26923(32);
			this.anInt3998 = 0x1 << this.method26923(4);
			this.anInt3981 = 0x1 << this.method26923(4);
			local112 = 0x1 << this.method26923(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean687 = true;
			this.anInt3988++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method26900(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method26918(arg0, arg1 + 7);
			if (this.aClass269Array2 != null) {
				this.method26883(this.aClass269Array2);
				this.aClass269Array2 = null;
			}
			this.aClass269Array2 = this.method26872(this.anInt3980, this.anInt3981);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt3998 : this.anInt3981;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class269 local202 = this.method26873(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray99[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray99[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class269 local250 = this.method26873(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray99[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray99[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class269 local305 = this.method26873(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray99[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray99[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class690.method36319(local198 - 1);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class104_Sub1_Sub3_Sub2.method12135(local364, local362);
				}
				if (local67 == 0) {
					this.aClass269_3 = local202;
					this.aClass269_1 = local250;
					this.aClass269_2 = local305;
					this.anIntArray413 = local356;
				} else {
					this.aClass269_5 = local202;
					this.aClass269_6 = local250;
					this.aClass269_4 = local305;
					this.anIntArray415 = local356;
				}
			}
			this.method26931();
			local67 = this.method26923(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method26923(16);
			}
			local67 = this.method26923(6) + 1;
			if (this.aClass271Array1 == null || this.aClass271Array1.length != local67) {
				this.aClass271Array1 = new Class271[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass271Array1[local112] == null) {
					this.aClass271Array1[local112] = new Class271();
				}
				this.aClass271Array1[local112].method26497(this, this.anInt3980);
			}
			local112 = this.method26923(6) + 1;
			if (this.aClass270Array1 == null || this.aClass270Array1.length != local112) {
				this.aClass270Array1 = new Class270[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass270Array1[local190] == null) {
					this.aClass270Array1[local190] = new Class270();
				}
				this.aClass270Array1[local190].method26490(this);
			}
			local190 = this.method26923(6) + 1;
			if (this.aClass278Array1 == null || this.aClass278Array1.length != local190) {
				this.aClass278Array1 = new Class278[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass278Array1[local194] == null) {
					this.aClass278Array1[local194] = new Class278();
				}
				this.aClass278Array1[local194].method26662(this);
			}
			local194 = this.method26923(6) + 1;
			this.aBooleanArray23 = new boolean[local194];
			this.anIntArray414 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray23[local198] = this.method26919() != 0;
				this.method26923(16);
				this.method26923(16);
				this.anIntArray414[local198] = this.method26923(8);
			}
			this.method26870(true);
		}
	}

	@OriginalMember(owner = "client!gx", name = "ed", descriptor = "([BI)V", line = 516)
	void method26935(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3996 = 0;
		if (this.method26819()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method26900(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method26900(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method26900(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method26918(arg0, arg1 + 7);
			local67 = this.method26923(32);
			this.anInt3980 = this.method26923(8);
			this.anInt3982 = this.method26923(32);
			this.anInt3974 = this.method26923(32);
			this.anInt3975 = this.method26923(32);
			this.anInt3976 = this.method26923(32);
			this.anInt3998 = 0x1 << this.method26923(4);
			this.anInt3981 = 0x1 << this.method26923(4);
			local112 = 0x1 << this.method26923(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean687 = true;
			this.anInt3988++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method26900(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method26918(arg0, arg1 + 7);
			if (this.aClass269Array2 != null) {
				this.method26883(this.aClass269Array2);
				this.aClass269Array2 = null;
			}
			this.aClass269Array2 = this.method26872(this.anInt3980, this.anInt3981);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt3998 : this.anInt3981;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class269 local202 = this.method26873(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray99[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray99[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class269 local250 = this.method26873(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray99[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray99[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class269 local305 = this.method26873(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray99[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray99[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class690.method36319(local198 - 1);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class104_Sub1_Sub3_Sub2.method12135(local364, local362);
				}
				if (local67 == 0) {
					this.aClass269_3 = local202;
					this.aClass269_1 = local250;
					this.aClass269_2 = local305;
					this.anIntArray413 = local356;
				} else {
					this.aClass269_5 = local202;
					this.aClass269_6 = local250;
					this.aClass269_4 = local305;
					this.anIntArray415 = local356;
				}
			}
			this.method26931();
			local67 = this.method26923(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method26923(16);
			}
			local67 = this.method26923(6) + 1;
			if (this.aClass271Array1 == null || this.aClass271Array1.length != local67) {
				this.aClass271Array1 = new Class271[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass271Array1[local112] == null) {
					this.aClass271Array1[local112] = new Class271();
				}
				this.aClass271Array1[local112].method26497(this, this.anInt3980);
			}
			local112 = this.method26923(6) + 1;
			if (this.aClass270Array1 == null || this.aClass270Array1.length != local112) {
				this.aClass270Array1 = new Class270[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass270Array1[local190] == null) {
					this.aClass270Array1[local190] = new Class270();
				}
				this.aClass270Array1[local190].method26490(this);
			}
			local190 = this.method26923(6) + 1;
			if (this.aClass278Array1 == null || this.aClass278Array1.length != local190) {
				this.aClass278Array1 = new Class278[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass278Array1[local194] == null) {
					this.aClass278Array1[local194] = new Class278();
				}
				this.aClass278Array1[local194].method26662(this);
			}
			local194 = this.method26923(6) + 1;
			this.aBooleanArray23 = new boolean[local194];
			this.anIntArray414 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray23[local198] = this.method26919() != 0;
				this.method26923(16);
				this.method26923(16);
				this.anIntArray414[local198] = this.method26923(8);
			}
			this.method26870(true);
		}
	}

	@OriginalMember(owner = "client!gx", name = "es", descriptor = "([BI)V", line = 516)
	void method26936(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3996 = 0;
		if (this.method26819()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method26900(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method26900(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method26900(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method26918(arg0, arg1 + 7);
			local67 = this.method26923(32);
			this.anInt3980 = this.method26923(8);
			this.anInt3982 = this.method26923(32);
			this.anInt3974 = this.method26923(32);
			this.anInt3975 = this.method26923(32);
			this.anInt3976 = this.method26923(32);
			this.anInt3998 = 0x1 << this.method26923(4);
			this.anInt3981 = 0x1 << this.method26923(4);
			local112 = 0x1 << this.method26923(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean687 = true;
			this.anInt3988++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method26900(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method26918(arg0, arg1 + 7);
			if (this.aClass269Array2 != null) {
				this.method26883(this.aClass269Array2);
				this.aClass269Array2 = null;
			}
			this.aClass269Array2 = this.method26872(this.anInt3980, this.anInt3981);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt3998 : this.anInt3981;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class269 local202 = this.method26873(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray99[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray99[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class269 local250 = this.method26873(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray99[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray99[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class269 local305 = this.method26873(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray99[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray99[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class690.method36319(local198 - 1);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class104_Sub1_Sub3_Sub2.method12135(local364, local362);
				}
				if (local67 == 0) {
					this.aClass269_3 = local202;
					this.aClass269_1 = local250;
					this.aClass269_2 = local305;
					this.anIntArray413 = local356;
				} else {
					this.aClass269_5 = local202;
					this.aClass269_6 = local250;
					this.aClass269_4 = local305;
					this.anIntArray415 = local356;
				}
			}
			this.method26931();
			local67 = this.method26923(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method26923(16);
			}
			local67 = this.method26923(6) + 1;
			if (this.aClass271Array1 == null || this.aClass271Array1.length != local67) {
				this.aClass271Array1 = new Class271[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass271Array1[local112] == null) {
					this.aClass271Array1[local112] = new Class271();
				}
				this.aClass271Array1[local112].method26497(this, this.anInt3980);
			}
			local112 = this.method26923(6) + 1;
			if (this.aClass270Array1 == null || this.aClass270Array1.length != local112) {
				this.aClass270Array1 = new Class270[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass270Array1[local190] == null) {
					this.aClass270Array1[local190] = new Class270();
				}
				this.aClass270Array1[local190].method26490(this);
			}
			local190 = this.method26923(6) + 1;
			if (this.aClass278Array1 == null || this.aClass278Array1.length != local190) {
				this.aClass278Array1 = new Class278[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass278Array1[local194] == null) {
					this.aClass278Array1[local194] = new Class278();
				}
				this.aClass278Array1[local194].method26662(this);
			}
			local194 = this.method26923(6) + 1;
			this.aBooleanArray23 = new boolean[local194];
			this.anIntArray414 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray23[local198] = this.method26919() != 0;
				this.method26923(16);
				this.method26923(16);
				this.anIntArray414[local198] = this.method26923(8);
			}
			this.method26870(true);
		}
	}

	@OriginalMember(owner = "client!gx", name = "ei", descriptor = "([BI)V", line = 516)
	void method26937(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3996 = 0;
		if (this.method26819()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method26900(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method26900(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method26900(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method26918(arg0, arg1 + 7);
			local67 = this.method26923(32);
			this.anInt3980 = this.method26923(8);
			this.anInt3982 = this.method26923(32);
			this.anInt3974 = this.method26923(32);
			this.anInt3975 = this.method26923(32);
			this.anInt3976 = this.method26923(32);
			this.anInt3998 = 0x1 << this.method26923(4);
			this.anInt3981 = 0x1 << this.method26923(4);
			local112 = 0x1 << this.method26923(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean687 = true;
			this.anInt3988++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method26900(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method26918(arg0, arg1 + 7);
			if (this.aClass269Array2 != null) {
				this.method26883(this.aClass269Array2);
				this.aClass269Array2 = null;
			}
			this.aClass269Array2 = this.method26872(this.anInt3980, this.anInt3981);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt3998 : this.anInt3981;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class269 local202 = this.method26873(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray99[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray99[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class269 local250 = this.method26873(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray99[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray99[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class269 local305 = this.method26873(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray99[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray99[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class690.method36319(local198 - 1);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class104_Sub1_Sub3_Sub2.method12135(local364, local362);
				}
				if (local67 == 0) {
					this.aClass269_3 = local202;
					this.aClass269_1 = local250;
					this.aClass269_2 = local305;
					this.anIntArray413 = local356;
				} else {
					this.aClass269_5 = local202;
					this.aClass269_6 = local250;
					this.aClass269_4 = local305;
					this.anIntArray415 = local356;
				}
			}
			this.method26931();
			local67 = this.method26923(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method26923(16);
			}
			local67 = this.method26923(6) + 1;
			if (this.aClass271Array1 == null || this.aClass271Array1.length != local67) {
				this.aClass271Array1 = new Class271[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass271Array1[local112] == null) {
					this.aClass271Array1[local112] = new Class271();
				}
				this.aClass271Array1[local112].method26497(this, this.anInt3980);
			}
			local112 = this.method26923(6) + 1;
			if (this.aClass270Array1 == null || this.aClass270Array1.length != local112) {
				this.aClass270Array1 = new Class270[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass270Array1[local190] == null) {
					this.aClass270Array1[local190] = new Class270();
				}
				this.aClass270Array1[local190].method26490(this);
			}
			local190 = this.method26923(6) + 1;
			if (this.aClass278Array1 == null || this.aClass278Array1.length != local190) {
				this.aClass278Array1 = new Class278[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass278Array1[local194] == null) {
					this.aClass278Array1[local194] = new Class278();
				}
				this.aClass278Array1[local194].method26662(this);
			}
			local194 = this.method26923(6) + 1;
			this.aBooleanArray23 = new boolean[local194];
			this.anIntArray414 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray23[local198] = this.method26919() != 0;
				this.method26923(16);
				this.method26923(16);
				this.anIntArray414[local198] = this.method26923(8);
			}
			this.method26870(true);
		}
	}

	@OriginalMember(owner = "client!gx", name = "ae", descriptor = "(I)I", line = 645)
	int method26938(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gx", name = "ee", descriptor = "(I)I", line = 645)
	int method26939(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gx", name = "en", descriptor = "(I)I", line = 645)
	int method26940(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gx", name = "ah", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z", line = 654)
	boolean method26941(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method26918(arg0, arg1);
			@Pc(21) int local21 = this.method26919();
			if (local21 != 0) {
				this.method26934(arg0, arg1);
				return false;
			} else if (this.method26819()) {
				@Pc(46) int local46 = this.method26923(this.method26938(this.anIntArray414.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray23[local46];
				@Pc(59) int local59 = local51 ? this.anInt3981 : this.anInt3998;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method26919() != 0;
					local63 = this.method26919() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt3998 >> 2);
					local105 = (local59 >> 2) + (this.anInt3998 >> 2);
					local110 = this.anInt3998 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt3998 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt3998 >> 2);
					local150 = this.anInt3998 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class278 local167 = this.aClass278Array1[this.anIntArray414[local46]];
				if (this.aBooleanArray25 == null || this.aBooleanArray25.length != this.anInt3980) {
					this.aBooleanArray25 = new boolean[this.anInt3980];
					this.aBooleanArray27 = new boolean[this.anInt3980];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					local202 = local167.anIntArray406 == null ? 0 : local167.anIntArray406[local188];
					local209 = local167.anIntArray407[local202];
					this.aBooleanArray25[local188] = !this.aClass271Array1[local209].method26518(local188);
					this.aBooleanArray27[local188] = this.aBooleanArray25[local188];
				}
				for (local188 = 0; local188 < local167.anInt3955; local188++) {
					if (!this.aBooleanArray25[local167.anIntArray408[local188]] || !this.aBooleanArray25[local167.anIntArray409[local188]]) {
						this.aBooleanArray25[local167.anIntArray408[local188]] = false;
						this.aBooleanArray25[local167.anIntArray409[local188]] = false;
					}
				}
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt3980) {
					this.aBooleanArray26 = new boolean[this.anInt3980];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt3956; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt3980; local297++) {
						local209 = local167.anIntArray406 == null ? local188 : local167.anIntArray406[local297];
						if (local209 == local188) {
							this.aBooleanArray26[local202++] = this.aBooleanArray25[local297];
						}
					}
					@Pc(333) Class270 local333 = this.aClass270Array1[local167.anIntArray405[local188]];
					@Pc(335) Class269[] local335 = null;
					if (local333.anInt3841 == 2) {
						@Pc(347) Class269[] local347 = this.method26872(1, this.anInt3980 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method26496(local347, local59 >> 1, this.aBooleanArray26);
								local335 = this.aClass269Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt3980; local354++) {
										try {
											local335[local354].aFloatArray99[local349] = local347[0].aFloatArray99[this.anInt3980 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method26883(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt3980; local354++) {
								try {
									local347[0].aFloatArray99[local349 * this.anInt3980 + local354] = this.aClass269Array2[local354].aFloatArray99[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method26496(this.aClass269Array2, local59 >> 1, this.aBooleanArray26);
					}
					if (local167.anIntArray406 == null) {
						if (this.aClass269Array2 != local335) {
							this.method26883(this.aClass269Array2);
						}
						this.aClass269Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt3980; local455++) {
							local349 = local167.anIntArray406[local455];
							if (local349 == local188) {
								this.aClass269Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt3955 - 1; local188 >= 0; local188--) {
					@Pc(506) Class269 local506 = this.aClass269Array2[local167.anIntArray408[local188]];
					@Pc(514) Class269 local514 = this.aClass269Array2[local167.anIntArray409[local188]];
					for (local209 = 0; local209 < local506.anInt3835; local209++) {
						@Pc(525) float local525 = local506.aFloatArray99[local209];
						@Pc(530) float local530 = local514.aFloatArray99[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray99[local209] = local544;
						local514.aFloatArray99[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray25.length; local188++) {
					this.aBooleanArray25[local188] = this.aBooleanArray27[local188];
				}
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					if (!this.aBooleanArray25[local188]) {
						local202 = local167.anIntArray406 == null ? 0 : local167.anIntArray406[local188];
						local209 = local167.anIntArray407[local202];
						this.aClass271Array1[local209].method26521(local188);
						this.aClass271Array1[local209].method26522(this.aClass269Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					if (this.aBooleanArray25[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass269Array2[local188].aFloatArray99[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class269 local699 = this.aClass269Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray99[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray99[local349] = -local699.aFloatArray99[local59 - local349 - 1];
						}
						@Pc(742) Class269 local742 = local51 ? this.aClass269_5 : this.aClass269_3;
						@Pc(750) Class269 local750 = local51 ? this.aClass269_6 : this.aClass269_1;
						@Pc(758) Class269 local758 = local51 ? this.aClass269_4 : this.aClass269_2;
						@Pc(766) int[] local766 = local51 ? this.anIntArray415 : this.anIntArray413;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray99[local768 * 4] - local699.aFloatArray99[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray99[local768 * 4 + 2] - local699.aFloatArray99[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray99[local768 * 2];
							local825 = local742.aFloatArray99[local768 * 2 + 1];
							local699.aFloatArray99[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray99[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray99[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray99[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray99[local768 * 4 + 3];
							local825 = local699.aFloatArray99[local768 * 4 + 1];
							local699.aFloatArray99[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray99[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray99[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray99[local202 - 3 - local768 * 4];
							local699.aFloatArray99[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray99[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class690.method36319(local59 - 1);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray99[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray99[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray99[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray99[local1042 - 3 - local1055];
									local699.aFloatArray99[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray99[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray99[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray99[local1044 * local1017 + 1];
									local699.aFloatArray99[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray99[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray99[local1017 + 1];
								local699.aFloatArray99[local1017 + 1] = local699.aFloatArray99[local1019 + 1];
								local699.aFloatArray99[local1019 + 1] = local943;
								local943 = local699.aFloatArray99[local1017 + 3];
								local699.aFloatArray99[local1017 + 3] = local699.aFloatArray99[local1019 + 3];
								local699.aFloatArray99[local1019 + 3] = local943;
								local943 = local699.aFloatArray99[local1017 + 5];
								local699.aFloatArray99[local1017 + 5] = local699.aFloatArray99[local1019 + 5];
								local699.aFloatArray99[local1019 + 5] = local943;
								local943 = local699.aFloatArray99[local1017 + 7];
								local699.aFloatArray99[local1017 + 7] = local699.aFloatArray99[local1019 + 7];
								local699.aFloatArray99[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray99[local59 - 1 - local1002 * 2] = local699.aFloatArray99[local1002 * 4];
							local699.aFloatArray99[local59 - 2 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 1];
							local699.aFloatArray99[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 2];
							local699.aFloatArray99[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray99[local1002 * 2];
							local816 = local758.aFloatArray99[local1002 * 2 + 1];
							local825 = local699.aFloatArray99[local202 + local1002 * 2];
							local943 = local699.aFloatArray99[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray99[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray99[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray99[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray99[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray99[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray99[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local1002 * 2 + local202] * local750.aFloatArray99[local1002 * 2] + local699.aFloatArray99[local1002 * 2 + 1 + local202] * local750.aFloatArray99[local1002 * 2 + 1];
							local699.aFloatArray99[local202 - 1 - local1002] = local699.aFloatArray99[local1002 * 2 + local202] * local750.aFloatArray99[local1002 * 2 + 1] - local699.aFloatArray99[local1002 * 2 + 1 + local202] * local750.aFloatArray99[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local59 - local297 + local1002] = -local699.aFloatArray99[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local297 + local1002] = -local699.aFloatArray99[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local202 + local1002] = local699.aFloatArray99[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass269Array2[local188].aFloatArray99[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass269Array2[local188].aFloatArray99[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class269[] local1816 = null;
				if (this.anInt3984 > 0) {
					local202 = this.anInt3984 + local59 >> 2;
					local1816 = this.method26872(this.anInt3980, local202);
					for (local297 = 0; local297 < this.anInt3980; local297++) {
						if (!this.aBooleanArray24[local297]) {
							for (local209 = 0; local209 < this.anInt3985; local209++) {
								local455 = (this.anInt3984 >> 1) + local209;
								local1816[local297].aFloatArray99[local209] += this.aClass269Array1[local297].aFloatArray99[local455];
							}
						}
						if (!this.aBooleanArray25[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt3835 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray99[local455] += this.aClass269Array2[local297].aFloatArray99[local209];
							}
						}
					}
				}
				@Pc(1920) Class269[] local1920 = this.aClass269Array1;
				this.aClass269Array1 = this.aClass269Array2;
				this.aClass269Array2 = local1920;
				this.anInt3984 = local59;
				this.anInt3985 = local145 - (local59 >> 1);
				this.aBooleanArray24 = this.aBooleanArray25;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "ex", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z", line = 654)
	boolean method26942(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method26918(arg0, arg1);
			@Pc(21) int local21 = this.method26919();
			if (local21 != 0) {
				this.method26934(arg0, arg1);
				return false;
			} else if (this.method26819()) {
				@Pc(46) int local46 = this.method26923(this.method26938(this.anIntArray414.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray23[local46];
				@Pc(59) int local59 = local51 ? this.anInt3981 : this.anInt3998;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method26919() != 0;
					local63 = this.method26919() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt3998 >> 2);
					local105 = (local59 >> 2) + (this.anInt3998 >> 2);
					local110 = this.anInt3998 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt3998 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt3998 >> 2);
					local150 = this.anInt3998 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class278 local167 = this.aClass278Array1[this.anIntArray414[local46]];
				if (this.aBooleanArray25 == null || this.aBooleanArray25.length != this.anInt3980) {
					this.aBooleanArray25 = new boolean[this.anInt3980];
					this.aBooleanArray27 = new boolean[this.anInt3980];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					local202 = local167.anIntArray406 == null ? 0 : local167.anIntArray406[local188];
					local209 = local167.anIntArray407[local202];
					this.aBooleanArray25[local188] = !this.aClass271Array1[local209].method26518(local188);
					this.aBooleanArray27[local188] = this.aBooleanArray25[local188];
				}
				for (local188 = 0; local188 < local167.anInt3955; local188++) {
					if (!this.aBooleanArray25[local167.anIntArray408[local188]] || !this.aBooleanArray25[local167.anIntArray409[local188]]) {
						this.aBooleanArray25[local167.anIntArray408[local188]] = false;
						this.aBooleanArray25[local167.anIntArray409[local188]] = false;
					}
				}
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt3980) {
					this.aBooleanArray26 = new boolean[this.anInt3980];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt3956; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt3980; local297++) {
						local209 = local167.anIntArray406 == null ? local188 : local167.anIntArray406[local297];
						if (local209 == local188) {
							this.aBooleanArray26[local202++] = this.aBooleanArray25[local297];
						}
					}
					@Pc(333) Class270 local333 = this.aClass270Array1[local167.anIntArray405[local188]];
					@Pc(335) Class269[] local335 = null;
					if (local333.anInt3841 == 2) {
						@Pc(347) Class269[] local347 = this.method26872(1, this.anInt3980 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method26496(local347, local59 >> 1, this.aBooleanArray26);
								local335 = this.aClass269Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt3980; local354++) {
										try {
											local335[local354].aFloatArray99[local349] = local347[0].aFloatArray99[this.anInt3980 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method26883(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt3980; local354++) {
								try {
									local347[0].aFloatArray99[local349 * this.anInt3980 + local354] = this.aClass269Array2[local354].aFloatArray99[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method26496(this.aClass269Array2, local59 >> 1, this.aBooleanArray26);
					}
					if (local167.anIntArray406 == null) {
						if (this.aClass269Array2 != local335) {
							this.method26883(this.aClass269Array2);
						}
						this.aClass269Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt3980; local455++) {
							local349 = local167.anIntArray406[local455];
							if (local349 == local188) {
								this.aClass269Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt3955 - 1; local188 >= 0; local188--) {
					@Pc(506) Class269 local506 = this.aClass269Array2[local167.anIntArray408[local188]];
					@Pc(514) Class269 local514 = this.aClass269Array2[local167.anIntArray409[local188]];
					for (local209 = 0; local209 < local506.anInt3835; local209++) {
						@Pc(525) float local525 = local506.aFloatArray99[local209];
						@Pc(530) float local530 = local514.aFloatArray99[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray99[local209] = local544;
						local514.aFloatArray99[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray25.length; local188++) {
					this.aBooleanArray25[local188] = this.aBooleanArray27[local188];
				}
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					if (!this.aBooleanArray25[local188]) {
						local202 = local167.anIntArray406 == null ? 0 : local167.anIntArray406[local188];
						local209 = local167.anIntArray407[local202];
						this.aClass271Array1[local209].method26521(local188);
						this.aClass271Array1[local209].method26522(this.aClass269Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					if (this.aBooleanArray25[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass269Array2[local188].aFloatArray99[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class269 local699 = this.aClass269Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray99[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray99[local349] = -local699.aFloatArray99[local59 - local349 - 1];
						}
						@Pc(742) Class269 local742 = local51 ? this.aClass269_5 : this.aClass269_3;
						@Pc(750) Class269 local750 = local51 ? this.aClass269_6 : this.aClass269_1;
						@Pc(758) Class269 local758 = local51 ? this.aClass269_4 : this.aClass269_2;
						@Pc(766) int[] local766 = local51 ? this.anIntArray415 : this.anIntArray413;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray99[local768 * 4] - local699.aFloatArray99[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray99[local768 * 4 + 2] - local699.aFloatArray99[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray99[local768 * 2];
							local825 = local742.aFloatArray99[local768 * 2 + 1];
							local699.aFloatArray99[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray99[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray99[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray99[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray99[local768 * 4 + 3];
							local825 = local699.aFloatArray99[local768 * 4 + 1];
							local699.aFloatArray99[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray99[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray99[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray99[local202 - 3 - local768 * 4];
							local699.aFloatArray99[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray99[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class690.method36319(local59 - 1);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray99[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray99[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray99[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray99[local1042 - 3 - local1055];
									local699.aFloatArray99[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray99[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray99[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray99[local1044 * local1017 + 1];
									local699.aFloatArray99[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray99[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray99[local1017 + 1];
								local699.aFloatArray99[local1017 + 1] = local699.aFloatArray99[local1019 + 1];
								local699.aFloatArray99[local1019 + 1] = local943;
								local943 = local699.aFloatArray99[local1017 + 3];
								local699.aFloatArray99[local1017 + 3] = local699.aFloatArray99[local1019 + 3];
								local699.aFloatArray99[local1019 + 3] = local943;
								local943 = local699.aFloatArray99[local1017 + 5];
								local699.aFloatArray99[local1017 + 5] = local699.aFloatArray99[local1019 + 5];
								local699.aFloatArray99[local1019 + 5] = local943;
								local943 = local699.aFloatArray99[local1017 + 7];
								local699.aFloatArray99[local1017 + 7] = local699.aFloatArray99[local1019 + 7];
								local699.aFloatArray99[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray99[local59 - 1 - local1002 * 2] = local699.aFloatArray99[local1002 * 4];
							local699.aFloatArray99[local59 - 2 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 1];
							local699.aFloatArray99[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 2];
							local699.aFloatArray99[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray99[local1002 * 2];
							local816 = local758.aFloatArray99[local1002 * 2 + 1];
							local825 = local699.aFloatArray99[local202 + local1002 * 2];
							local943 = local699.aFloatArray99[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray99[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray99[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray99[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray99[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray99[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray99[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local1002 * 2 + local202] * local750.aFloatArray99[local1002 * 2] + local699.aFloatArray99[local1002 * 2 + 1 + local202] * local750.aFloatArray99[local1002 * 2 + 1];
							local699.aFloatArray99[local202 - 1 - local1002] = local699.aFloatArray99[local1002 * 2 + local202] * local750.aFloatArray99[local1002 * 2 + 1] - local699.aFloatArray99[local1002 * 2 + 1 + local202] * local750.aFloatArray99[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local59 - local297 + local1002] = -local699.aFloatArray99[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local297 + local1002] = -local699.aFloatArray99[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local202 + local1002] = local699.aFloatArray99[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass269Array2[local188].aFloatArray99[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass269Array2[local188].aFloatArray99[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class269[] local1816 = null;
				if (this.anInt3984 > 0) {
					local202 = this.anInt3984 + local59 >> 2;
					local1816 = this.method26872(this.anInt3980, local202);
					for (local297 = 0; local297 < this.anInt3980; local297++) {
						if (!this.aBooleanArray24[local297]) {
							for (local209 = 0; local209 < this.anInt3985; local209++) {
								local455 = (this.anInt3984 >> 1) + local209;
								local1816[local297].aFloatArray99[local209] += this.aClass269Array1[local297].aFloatArray99[local455];
							}
						}
						if (!this.aBooleanArray25[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt3835 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray99[local455] += this.aClass269Array2[local297].aFloatArray99[local209];
							}
						}
					}
				}
				@Pc(1920) Class269[] local1920 = this.aClass269Array1;
				this.aClass269Array1 = this.aClass269Array2;
				this.aClass269Array2 = local1920;
				this.anInt3984 = local59;
				this.anInt3985 = local145 - (local59 >> 1);
				this.aBooleanArray24 = this.aBooleanArray25;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "ef", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z", line = 654)
	boolean method26943(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method26918(arg0, arg1);
			@Pc(21) int local21 = this.method26919();
			if (local21 != 0) {
				this.method26934(arg0, arg1);
				return false;
			} else if (this.method26819()) {
				@Pc(46) int local46 = this.method26923(this.method26938(this.anIntArray414.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray23[local46];
				@Pc(59) int local59 = local51 ? this.anInt3981 : this.anInt3998;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method26919() != 0;
					local63 = this.method26919() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt3998 >> 2);
					local105 = (local59 >> 2) + (this.anInt3998 >> 2);
					local110 = this.anInt3998 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt3998 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt3998 >> 2);
					local150 = this.anInt3998 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class278 local167 = this.aClass278Array1[this.anIntArray414[local46]];
				if (this.aBooleanArray25 == null || this.aBooleanArray25.length != this.anInt3980) {
					this.aBooleanArray25 = new boolean[this.anInt3980];
					this.aBooleanArray27 = new boolean[this.anInt3980];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					local202 = local167.anIntArray406 == null ? 0 : local167.anIntArray406[local188];
					local209 = local167.anIntArray407[local202];
					this.aBooleanArray25[local188] = !this.aClass271Array1[local209].method26518(local188);
					this.aBooleanArray27[local188] = this.aBooleanArray25[local188];
				}
				for (local188 = 0; local188 < local167.anInt3955; local188++) {
					if (!this.aBooleanArray25[local167.anIntArray408[local188]] || !this.aBooleanArray25[local167.anIntArray409[local188]]) {
						this.aBooleanArray25[local167.anIntArray408[local188]] = false;
						this.aBooleanArray25[local167.anIntArray409[local188]] = false;
					}
				}
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt3980) {
					this.aBooleanArray26 = new boolean[this.anInt3980];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt3956; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt3980; local297++) {
						local209 = local167.anIntArray406 == null ? local188 : local167.anIntArray406[local297];
						if (local209 == local188) {
							this.aBooleanArray26[local202++] = this.aBooleanArray25[local297];
						}
					}
					@Pc(333) Class270 local333 = this.aClass270Array1[local167.anIntArray405[local188]];
					@Pc(335) Class269[] local335 = null;
					if (local333.anInt3841 == 2) {
						@Pc(347) Class269[] local347 = this.method26872(1, this.anInt3980 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method26496(local347, local59 >> 1, this.aBooleanArray26);
								local335 = this.aClass269Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt3980; local354++) {
										try {
											local335[local354].aFloatArray99[local349] = local347[0].aFloatArray99[this.anInt3980 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method26883(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt3980; local354++) {
								try {
									local347[0].aFloatArray99[local349 * this.anInt3980 + local354] = this.aClass269Array2[local354].aFloatArray99[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method26496(this.aClass269Array2, local59 >> 1, this.aBooleanArray26);
					}
					if (local167.anIntArray406 == null) {
						if (this.aClass269Array2 != local335) {
							this.method26883(this.aClass269Array2);
						}
						this.aClass269Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt3980; local455++) {
							local349 = local167.anIntArray406[local455];
							if (local349 == local188) {
								this.aClass269Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt3955 - 1; local188 >= 0; local188--) {
					@Pc(506) Class269 local506 = this.aClass269Array2[local167.anIntArray408[local188]];
					@Pc(514) Class269 local514 = this.aClass269Array2[local167.anIntArray409[local188]];
					for (local209 = 0; local209 < local506.anInt3835; local209++) {
						@Pc(525) float local525 = local506.aFloatArray99[local209];
						@Pc(530) float local530 = local514.aFloatArray99[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray99[local209] = local544;
						local514.aFloatArray99[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray25.length; local188++) {
					this.aBooleanArray25[local188] = this.aBooleanArray27[local188];
				}
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					if (!this.aBooleanArray25[local188]) {
						local202 = local167.anIntArray406 == null ? 0 : local167.anIntArray406[local188];
						local209 = local167.anIntArray407[local202];
						this.aClass271Array1[local209].method26521(local188);
						this.aClass271Array1[local209].method26522(this.aClass269Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					if (this.aBooleanArray25[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass269Array2[local188].aFloatArray99[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class269 local699 = this.aClass269Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray99[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray99[local349] = -local699.aFloatArray99[local59 - local349 - 1];
						}
						@Pc(742) Class269 local742 = local51 ? this.aClass269_5 : this.aClass269_3;
						@Pc(750) Class269 local750 = local51 ? this.aClass269_6 : this.aClass269_1;
						@Pc(758) Class269 local758 = local51 ? this.aClass269_4 : this.aClass269_2;
						@Pc(766) int[] local766 = local51 ? this.anIntArray415 : this.anIntArray413;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray99[local768 * 4] - local699.aFloatArray99[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray99[local768 * 4 + 2] - local699.aFloatArray99[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray99[local768 * 2];
							local825 = local742.aFloatArray99[local768 * 2 + 1];
							local699.aFloatArray99[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray99[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray99[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray99[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray99[local768 * 4 + 3];
							local825 = local699.aFloatArray99[local768 * 4 + 1];
							local699.aFloatArray99[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray99[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray99[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray99[local202 - 3 - local768 * 4];
							local699.aFloatArray99[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray99[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class690.method36319(local59 - 1);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray99[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray99[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray99[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray99[local1042 - 3 - local1055];
									local699.aFloatArray99[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray99[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray99[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray99[local1044 * local1017 + 1];
									local699.aFloatArray99[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray99[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray99[local1017 + 1];
								local699.aFloatArray99[local1017 + 1] = local699.aFloatArray99[local1019 + 1];
								local699.aFloatArray99[local1019 + 1] = local943;
								local943 = local699.aFloatArray99[local1017 + 3];
								local699.aFloatArray99[local1017 + 3] = local699.aFloatArray99[local1019 + 3];
								local699.aFloatArray99[local1019 + 3] = local943;
								local943 = local699.aFloatArray99[local1017 + 5];
								local699.aFloatArray99[local1017 + 5] = local699.aFloatArray99[local1019 + 5];
								local699.aFloatArray99[local1019 + 5] = local943;
								local943 = local699.aFloatArray99[local1017 + 7];
								local699.aFloatArray99[local1017 + 7] = local699.aFloatArray99[local1019 + 7];
								local699.aFloatArray99[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray99[local59 - 1 - local1002 * 2] = local699.aFloatArray99[local1002 * 4];
							local699.aFloatArray99[local59 - 2 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 1];
							local699.aFloatArray99[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 2];
							local699.aFloatArray99[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray99[local1002 * 2];
							local816 = local758.aFloatArray99[local1002 * 2 + 1];
							local825 = local699.aFloatArray99[local202 + local1002 * 2];
							local943 = local699.aFloatArray99[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray99[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray99[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray99[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray99[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray99[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray99[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local1002 * 2 + local202] * local750.aFloatArray99[local1002 * 2] + local699.aFloatArray99[local1002 * 2 + 1 + local202] * local750.aFloatArray99[local1002 * 2 + 1];
							local699.aFloatArray99[local202 - 1 - local1002] = local699.aFloatArray99[local1002 * 2 + local202] * local750.aFloatArray99[local1002 * 2 + 1] - local699.aFloatArray99[local1002 * 2 + 1 + local202] * local750.aFloatArray99[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local59 - local297 + local1002] = -local699.aFloatArray99[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local297 + local1002] = -local699.aFloatArray99[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local202 + local1002] = local699.aFloatArray99[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass269Array2[local188].aFloatArray99[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass269Array2[local188].aFloatArray99[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class269[] local1816 = null;
				if (this.anInt3984 > 0) {
					local202 = this.anInt3984 + local59 >> 2;
					local1816 = this.method26872(this.anInt3980, local202);
					for (local297 = 0; local297 < this.anInt3980; local297++) {
						if (!this.aBooleanArray24[local297]) {
							for (local209 = 0; local209 < this.anInt3985; local209++) {
								local455 = (this.anInt3984 >> 1) + local209;
								local1816[local297].aFloatArray99[local209] += this.aClass269Array1[local297].aFloatArray99[local455];
							}
						}
						if (!this.aBooleanArray25[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt3835 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray99[local455] += this.aClass269Array2[local297].aFloatArray99[local209];
							}
						}
					}
				}
				@Pc(1920) Class269[] local1920 = this.aClass269Array1;
				this.aClass269Array1 = this.aClass269Array2;
				this.aClass269Array2 = local1920;
				this.anInt3984 = local59;
				this.anInt3985 = local145 - (local59 >> 1);
				this.aBooleanArray24 = this.aBooleanArray25;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "er", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z", line = 654)
	boolean method26944(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method26918(arg0, arg1);
			@Pc(21) int local21 = this.method26919();
			if (local21 != 0) {
				this.method26934(arg0, arg1);
				return false;
			} else if (this.method26819()) {
				@Pc(46) int local46 = this.method26923(this.method26938(this.anIntArray414.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray23[local46];
				@Pc(59) int local59 = local51 ? this.anInt3981 : this.anInt3998;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method26919() != 0;
					local63 = this.method26919() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt3998 >> 2);
					local105 = (local59 >> 2) + (this.anInt3998 >> 2);
					local110 = this.anInt3998 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt3998 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt3998 >> 2);
					local150 = this.anInt3998 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class278 local167 = this.aClass278Array1[this.anIntArray414[local46]];
				if (this.aBooleanArray25 == null || this.aBooleanArray25.length != this.anInt3980) {
					this.aBooleanArray25 = new boolean[this.anInt3980];
					this.aBooleanArray27 = new boolean[this.anInt3980];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					local202 = local167.anIntArray406 == null ? 0 : local167.anIntArray406[local188];
					local209 = local167.anIntArray407[local202];
					this.aBooleanArray25[local188] = !this.aClass271Array1[local209].method26518(local188);
					this.aBooleanArray27[local188] = this.aBooleanArray25[local188];
				}
				for (local188 = 0; local188 < local167.anInt3955; local188++) {
					if (!this.aBooleanArray25[local167.anIntArray408[local188]] || !this.aBooleanArray25[local167.anIntArray409[local188]]) {
						this.aBooleanArray25[local167.anIntArray408[local188]] = false;
						this.aBooleanArray25[local167.anIntArray409[local188]] = false;
					}
				}
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt3980) {
					this.aBooleanArray26 = new boolean[this.anInt3980];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt3956; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt3980; local297++) {
						local209 = local167.anIntArray406 == null ? local188 : local167.anIntArray406[local297];
						if (local209 == local188) {
							this.aBooleanArray26[local202++] = this.aBooleanArray25[local297];
						}
					}
					@Pc(333) Class270 local333 = this.aClass270Array1[local167.anIntArray405[local188]];
					@Pc(335) Class269[] local335 = null;
					if (local333.anInt3841 == 2) {
						@Pc(347) Class269[] local347 = this.method26872(1, this.anInt3980 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method26496(local347, local59 >> 1, this.aBooleanArray26);
								local335 = this.aClass269Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt3980; local354++) {
										try {
											local335[local354].aFloatArray99[local349] = local347[0].aFloatArray99[this.anInt3980 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method26883(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt3980; local354++) {
								try {
									local347[0].aFloatArray99[local349 * this.anInt3980 + local354] = this.aClass269Array2[local354].aFloatArray99[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method26496(this.aClass269Array2, local59 >> 1, this.aBooleanArray26);
					}
					if (local167.anIntArray406 == null) {
						if (this.aClass269Array2 != local335) {
							this.method26883(this.aClass269Array2);
						}
						this.aClass269Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt3980; local455++) {
							local349 = local167.anIntArray406[local455];
							if (local349 == local188) {
								this.aClass269Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt3955 - 1; local188 >= 0; local188--) {
					@Pc(506) Class269 local506 = this.aClass269Array2[local167.anIntArray408[local188]];
					@Pc(514) Class269 local514 = this.aClass269Array2[local167.anIntArray409[local188]];
					for (local209 = 0; local209 < local506.anInt3835; local209++) {
						@Pc(525) float local525 = local506.aFloatArray99[local209];
						@Pc(530) float local530 = local514.aFloatArray99[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray99[local209] = local544;
						local514.aFloatArray99[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray25.length; local188++) {
					this.aBooleanArray25[local188] = this.aBooleanArray27[local188];
				}
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					if (!this.aBooleanArray25[local188]) {
						local202 = local167.anIntArray406 == null ? 0 : local167.anIntArray406[local188];
						local209 = local167.anIntArray407[local202];
						this.aClass271Array1[local209].method26521(local188);
						this.aClass271Array1[local209].method26522(this.aClass269Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					if (this.aBooleanArray25[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass269Array2[local188].aFloatArray99[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class269 local699 = this.aClass269Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray99[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray99[local349] = -local699.aFloatArray99[local59 - local349 - 1];
						}
						@Pc(742) Class269 local742 = local51 ? this.aClass269_5 : this.aClass269_3;
						@Pc(750) Class269 local750 = local51 ? this.aClass269_6 : this.aClass269_1;
						@Pc(758) Class269 local758 = local51 ? this.aClass269_4 : this.aClass269_2;
						@Pc(766) int[] local766 = local51 ? this.anIntArray415 : this.anIntArray413;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray99[local768 * 4] - local699.aFloatArray99[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray99[local768 * 4 + 2] - local699.aFloatArray99[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray99[local768 * 2];
							local825 = local742.aFloatArray99[local768 * 2 + 1];
							local699.aFloatArray99[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray99[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray99[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray99[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray99[local768 * 4 + 3];
							local825 = local699.aFloatArray99[local768 * 4 + 1];
							local699.aFloatArray99[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray99[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray99[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray99[local202 - 3 - local768 * 4];
							local699.aFloatArray99[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray99[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class690.method36319(local59 - 1);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray99[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray99[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray99[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray99[local1042 - 3 - local1055];
									local699.aFloatArray99[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray99[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray99[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray99[local1044 * local1017 + 1];
									local699.aFloatArray99[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray99[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray99[local1017 + 1];
								local699.aFloatArray99[local1017 + 1] = local699.aFloatArray99[local1019 + 1];
								local699.aFloatArray99[local1019 + 1] = local943;
								local943 = local699.aFloatArray99[local1017 + 3];
								local699.aFloatArray99[local1017 + 3] = local699.aFloatArray99[local1019 + 3];
								local699.aFloatArray99[local1019 + 3] = local943;
								local943 = local699.aFloatArray99[local1017 + 5];
								local699.aFloatArray99[local1017 + 5] = local699.aFloatArray99[local1019 + 5];
								local699.aFloatArray99[local1019 + 5] = local943;
								local943 = local699.aFloatArray99[local1017 + 7];
								local699.aFloatArray99[local1017 + 7] = local699.aFloatArray99[local1019 + 7];
								local699.aFloatArray99[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray99[local59 - 1 - local1002 * 2] = local699.aFloatArray99[local1002 * 4];
							local699.aFloatArray99[local59 - 2 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 1];
							local699.aFloatArray99[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 2];
							local699.aFloatArray99[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray99[local1002 * 2];
							local816 = local758.aFloatArray99[local1002 * 2 + 1];
							local825 = local699.aFloatArray99[local202 + local1002 * 2];
							local943 = local699.aFloatArray99[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray99[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray99[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray99[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray99[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray99[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray99[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local1002 * 2 + local202] * local750.aFloatArray99[local1002 * 2] + local699.aFloatArray99[local1002 * 2 + 1 + local202] * local750.aFloatArray99[local1002 * 2 + 1];
							local699.aFloatArray99[local202 - 1 - local1002] = local699.aFloatArray99[local1002 * 2 + local202] * local750.aFloatArray99[local1002 * 2 + 1] - local699.aFloatArray99[local1002 * 2 + 1 + local202] * local750.aFloatArray99[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local59 - local297 + local1002] = -local699.aFloatArray99[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local297 + local1002] = -local699.aFloatArray99[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local202 + local1002] = local699.aFloatArray99[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass269Array2[local188].aFloatArray99[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass269Array2[local188].aFloatArray99[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class269[] local1816 = null;
				if (this.anInt3984 > 0) {
					local202 = this.anInt3984 + local59 >> 2;
					local1816 = this.method26872(this.anInt3980, local202);
					for (local297 = 0; local297 < this.anInt3980; local297++) {
						if (!this.aBooleanArray24[local297]) {
							for (local209 = 0; local209 < this.anInt3985; local209++) {
								local455 = (this.anInt3984 >> 1) + local209;
								local1816[local297].aFloatArray99[local209] += this.aClass269Array1[local297].aFloatArray99[local455];
							}
						}
						if (!this.aBooleanArray25[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt3835 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray99[local455] += this.aClass269Array2[local297].aFloatArray99[local209];
							}
						}
					}
				}
				@Pc(1920) Class269[] local1920 = this.aClass269Array1;
				this.aClass269Array1 = this.aClass269Array2;
				this.aClass269Array2 = local1920;
				this.anInt3984 = local59;
				this.anInt3985 = local145 - (local59 >> 1);
				this.aBooleanArray24 = this.aBooleanArray25;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "em", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z", line = 654)
	boolean method26945(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method26918(arg0, arg1);
			@Pc(21) int local21 = this.method26919();
			if (local21 != 0) {
				this.method26934(arg0, arg1);
				return false;
			} else if (this.method26819()) {
				@Pc(46) int local46 = this.method26923(this.method26938(this.anIntArray414.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray23[local46];
				@Pc(59) int local59 = local51 ? this.anInt3981 : this.anInt3998;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method26919() != 0;
					local63 = this.method26919() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt3998 >> 2);
					local105 = (local59 >> 2) + (this.anInt3998 >> 2);
					local110 = this.anInt3998 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt3998 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt3998 >> 2);
					local150 = this.anInt3998 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class278 local167 = this.aClass278Array1[this.anIntArray414[local46]];
				if (this.aBooleanArray25 == null || this.aBooleanArray25.length != this.anInt3980) {
					this.aBooleanArray25 = new boolean[this.anInt3980];
					this.aBooleanArray27 = new boolean[this.anInt3980];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					local202 = local167.anIntArray406 == null ? 0 : local167.anIntArray406[local188];
					local209 = local167.anIntArray407[local202];
					this.aBooleanArray25[local188] = !this.aClass271Array1[local209].method26518(local188);
					this.aBooleanArray27[local188] = this.aBooleanArray25[local188];
				}
				for (local188 = 0; local188 < local167.anInt3955; local188++) {
					if (!this.aBooleanArray25[local167.anIntArray408[local188]] || !this.aBooleanArray25[local167.anIntArray409[local188]]) {
						this.aBooleanArray25[local167.anIntArray408[local188]] = false;
						this.aBooleanArray25[local167.anIntArray409[local188]] = false;
					}
				}
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt3980) {
					this.aBooleanArray26 = new boolean[this.anInt3980];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt3956; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt3980; local297++) {
						local209 = local167.anIntArray406 == null ? local188 : local167.anIntArray406[local297];
						if (local209 == local188) {
							this.aBooleanArray26[local202++] = this.aBooleanArray25[local297];
						}
					}
					@Pc(333) Class270 local333 = this.aClass270Array1[local167.anIntArray405[local188]];
					@Pc(335) Class269[] local335 = null;
					if (local333.anInt3841 == 2) {
						@Pc(347) Class269[] local347 = this.method26872(1, this.anInt3980 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method26496(local347, local59 >> 1, this.aBooleanArray26);
								local335 = this.aClass269Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt3980; local354++) {
										try {
											local335[local354].aFloatArray99[local349] = local347[0].aFloatArray99[this.anInt3980 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method26883(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt3980; local354++) {
								try {
									local347[0].aFloatArray99[local349 * this.anInt3980 + local354] = this.aClass269Array2[local354].aFloatArray99[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method26496(this.aClass269Array2, local59 >> 1, this.aBooleanArray26);
					}
					if (local167.anIntArray406 == null) {
						if (this.aClass269Array2 != local335) {
							this.method26883(this.aClass269Array2);
						}
						this.aClass269Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt3980; local455++) {
							local349 = local167.anIntArray406[local455];
							if (local349 == local188) {
								this.aClass269Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt3955 - 1; local188 >= 0; local188--) {
					@Pc(506) Class269 local506 = this.aClass269Array2[local167.anIntArray408[local188]];
					@Pc(514) Class269 local514 = this.aClass269Array2[local167.anIntArray409[local188]];
					for (local209 = 0; local209 < local506.anInt3835; local209++) {
						@Pc(525) float local525 = local506.aFloatArray99[local209];
						@Pc(530) float local530 = local514.aFloatArray99[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray99[local209] = local544;
						local514.aFloatArray99[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray25.length; local188++) {
					this.aBooleanArray25[local188] = this.aBooleanArray27[local188];
				}
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					if (!this.aBooleanArray25[local188]) {
						local202 = local167.anIntArray406 == null ? 0 : local167.anIntArray406[local188];
						local209 = local167.anIntArray407[local202];
						this.aClass271Array1[local209].method26521(local188);
						this.aClass271Array1[local209].method26522(this.aClass269Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt3980; local188++) {
					if (this.aBooleanArray25[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass269Array2[local188].aFloatArray99[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class269 local699 = this.aClass269Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray99[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray99[local349] = -local699.aFloatArray99[local59 - local349 - 1];
						}
						@Pc(742) Class269 local742 = local51 ? this.aClass269_5 : this.aClass269_3;
						@Pc(750) Class269 local750 = local51 ? this.aClass269_6 : this.aClass269_1;
						@Pc(758) Class269 local758 = local51 ? this.aClass269_4 : this.aClass269_2;
						@Pc(766) int[] local766 = local51 ? this.anIntArray415 : this.anIntArray413;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray99[local768 * 4] - local699.aFloatArray99[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray99[local768 * 4 + 2] - local699.aFloatArray99[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray99[local768 * 2];
							local825 = local742.aFloatArray99[local768 * 2 + 1];
							local699.aFloatArray99[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray99[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray99[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray99[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray99[local768 * 4 + 3];
							local825 = local699.aFloatArray99[local768 * 4 + 1];
							local699.aFloatArray99[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray99[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray99[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray99[local202 - 3 - local768 * 4];
							local699.aFloatArray99[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray99[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class690.method36319(local59 - 1);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray99[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray99[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray99[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray99[local1042 - 3 - local1055];
									local699.aFloatArray99[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray99[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray99[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray99[local1044 * local1017 + 1];
									local699.aFloatArray99[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray99[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray99[local1017 + 1];
								local699.aFloatArray99[local1017 + 1] = local699.aFloatArray99[local1019 + 1];
								local699.aFloatArray99[local1019 + 1] = local943;
								local943 = local699.aFloatArray99[local1017 + 3];
								local699.aFloatArray99[local1017 + 3] = local699.aFloatArray99[local1019 + 3];
								local699.aFloatArray99[local1019 + 3] = local943;
								local943 = local699.aFloatArray99[local1017 + 5];
								local699.aFloatArray99[local1017 + 5] = local699.aFloatArray99[local1019 + 5];
								local699.aFloatArray99[local1019 + 5] = local943;
								local943 = local699.aFloatArray99[local1017 + 7];
								local699.aFloatArray99[local1017 + 7] = local699.aFloatArray99[local1019 + 7];
								local699.aFloatArray99[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray99[local59 - 1 - local1002 * 2] = local699.aFloatArray99[local1002 * 4];
							local699.aFloatArray99[local59 - 2 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 1];
							local699.aFloatArray99[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 2];
							local699.aFloatArray99[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray99[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray99[local1002 * 2];
							local816 = local758.aFloatArray99[local1002 * 2 + 1];
							local825 = local699.aFloatArray99[local202 + local1002 * 2];
							local943 = local699.aFloatArray99[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray99[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray99[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray99[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray99[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray99[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray99[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local1002 * 2 + local202] * local750.aFloatArray99[local1002 * 2] + local699.aFloatArray99[local1002 * 2 + 1 + local202] * local750.aFloatArray99[local1002 * 2 + 1];
							local699.aFloatArray99[local202 - 1 - local1002] = local699.aFloatArray99[local1002 * 2 + local202] * local750.aFloatArray99[local1002 * 2 + 1] - local699.aFloatArray99[local1002 * 2 + 1 + local202] * local750.aFloatArray99[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local59 - local297 + local1002] = -local699.aFloatArray99[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local1002] = local699.aFloatArray99[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local297 + local1002] = -local699.aFloatArray99[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray99[local202 + local1002] = local699.aFloatArray99[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass269Array2[local188].aFloatArray99[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass269Array2[local188].aFloatArray99[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class269[] local1816 = null;
				if (this.anInt3984 > 0) {
					local202 = this.anInt3984 + local59 >> 2;
					local1816 = this.method26872(this.anInt3980, local202);
					for (local297 = 0; local297 < this.anInt3980; local297++) {
						if (!this.aBooleanArray24[local297]) {
							for (local209 = 0; local209 < this.anInt3985; local209++) {
								local455 = (this.anInt3984 >> 1) + local209;
								local1816[local297].aFloatArray99[local209] += this.aClass269Array1[local297].aFloatArray99[local455];
							}
						}
						if (!this.aBooleanArray25[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt3835 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray99[local455] += this.aClass269Array2[local297].aFloatArray99[local209];
							}
						}
					}
				}
				@Pc(1920) Class269[] local1920 = this.aClass269Array1;
				this.aClass269Array1 = this.aClass269Array2;
				this.aClass269Array2 = local1920;
				this.anInt3984 = local59;
				this.anInt3985 = local145 - (local59 >> 1);
				this.aBooleanArray24 = this.aBooleanArray25;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "as", descriptor = "()V", line = 972)
	void method26946() {
		if (this.method26836() == Class385.aClass385_3 || (this.method26836() == Class385.aClass385_6 || this.aBoolean688 && (float) (this.anInt3999 / this.method26861()) > this.aFloat262)) {
			return;
		}
		if (!this.method26894()) {
			@Pc(41) Class77_Sub39 local41 = (Class77_Sub39) (this.aList13 == null || this.aList13.isEmpty() ? null : this.aList13.get(0));
			if (local41 == null) {
				if (!this.aBoolean685) {
					this.method26860(Class385.aClass385_6);
					this.anInterface48_1.method30219();
					this.aBoolean685 = true;
				}
				return;
			}
			this.aBoolean685 = false;
			this.aBoolean686 = true;
			this.aList13.remove(0);
			this.method26893(local41);
		}
		this.method26951();
	}

	@OriginalMember(owner = "client!gx", name = "et", descriptor = "()V", line = 972)
	void method26947() {
		if (this.method26836() == Class385.aClass385_3 || (this.method26836() == Class385.aClass385_6 || this.aBoolean688 && (float) (this.anInt3999 / this.method26861()) > this.aFloat262)) {
			return;
		}
		if (!this.method26894()) {
			@Pc(41) Class77_Sub39 local41 = (Class77_Sub39) (this.aList13 == null || this.aList13.isEmpty() ? null : this.aList13.get(0));
			if (local41 == null) {
				if (!this.aBoolean685) {
					this.method26860(Class385.aClass385_6);
					this.anInterface48_1.method30219();
					this.aBoolean685 = true;
				}
				return;
			}
			this.aBoolean685 = false;
			this.aBoolean686 = true;
			this.aList13.remove(0);
			this.method26893(local41);
		}
		this.method26951();
	}

	@OriginalMember(owner = "client!gx", name = "aq", descriptor = "(Lclient!akv;)V", line = 1000)
	synchronized void method26948(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aList13.add(arg0);
		this.method26860(Class385.aClass385_5);
	}

	@OriginalMember(owner = "client!gx", name = "ew", descriptor = "(Lclient!akv;)V", line = 1000)
	synchronized void method26949(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aList13.add(arg0);
		this.method26860(Class385.aClass385_5);
	}

	@OriginalMember(owner = "client!gx", name = "eu", descriptor = "(Lclient!akv;)V", line = 1000)
	synchronized void method26950(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aList13.add(arg0);
		this.method26860(Class385.aClass385_5);
	}

	@OriginalMember(owner = "client!gx", name = "am", descriptor = "()V", line = 1005)
	synchronized void method26951() {
		@Pc(10) int local10 = this.aClass77_Sub39_15 == null ? 0 : this.aClass77_Sub39_15.anInt3089 * 31645619;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList14.iterator();
		@Pc(23) Class77_Sub39 local23;
		while (local16.hasNext()) {
			local23 = (Class77_Sub39) local16.next();
			local12 += local23.anInt3089 * 31645619;
		}
		if (this.aClass77_Sub39_15 == null) {
			this.aClass77_Sub39_15 = this.method26970(local12);
			this.anInt3983 = 0;
			local10 = 0;
		} else if (this.aClass77_Sub39_15.aByteArray53.length - this.aClass77_Sub39_15.anInt3089 * 31645619 < local12) {
			@Pc(53) Class77_Sub39 local53 = this.method26970(local12 + this.anInt3983);
			local53.method22452(this.aClass77_Sub39_15.aByteArray53, this.aClass77_Sub39_15.anInt3089 * 31645619 - this.anInt3990, this.anInt3983);
			this.aClass77_Sub39_15.method22401();
			this.aClass77_Sub39_15 = local53;
			local10 = this.anInt3990;
		}
		local16 = this.aList14.iterator();
		while (local16.hasNext()) {
			local23 = (Class77_Sub39) local16.next();
			this.aClass77_Sub39_15.method22452(local23.aByteArray53, 0, local23.anInt3089 * 31645619);
			this.anInt3983 += local23.anInt3089 * 31645619;
			local23.method22401();
		}
		this.aClass77_Sub39_15.anInt3089 = (local10 - this.anInt3990) * -1387468933;
		this.anInt3990 = 0;
		this.aList14.clear();
		label286: while (true) {
			if (this.aBoolean686) {
				if (this.aClass77_Sub39_15.anInt3089 * 31645619 < this.aClass77_Sub39_15.aByteArray53.length) {
					if (this.aBoolean688 && (float) (this.anInt3999 / this.method26861()) > this.aFloat262) {
						return;
					}
					if (this.aClass77_Sub39_15 != null && this.anInt3983 >= 27) {
						@Pc(205) int local205 = this.aClass77_Sub39_15.anInt3089 * 31645619;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method26897(this.aClass77_Sub39_15)) {
							return;
						}
						this.anInt4001++;
						if (this.anInt4000 < 0) {
							this.anInt3994++;
						}
						this.aList16.clear();
						this.aList17.clear();
						this.aClass77_Sub39_15.method22478();
						@Pc(246) int local246 = this.aClass77_Sub39_15.method22478();
						@Pc(278) int local278 = this.aClass77_Sub39_15.method22478() & 0xFF | (this.aClass77_Sub39_15.method22478() & 0xFF) << 8 | (this.aClass77_Sub39_15.method22478() & 0xFF) << 16 | this.aClass77_Sub39_15.method22478() << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aClass77_Sub39_15.anInt3089 += -724666448;
						@Pc(294) int local294 = this.aClass77_Sub39_15.method22478();
						@Pc(300) int local300 = this.aClass77_Sub39_15.anInt3089 * 31645619;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt3983) {
							this.aClass77_Sub39_15.anInt3089 = (local205 + this.anInt3983) * -1387468933;
							this.anInt3990 = this.aClass77_Sub39_15.anInt3089 * 31645619 - local205;
							this.aBoolean686 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean686) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aClass77_Sub39_15.aByteArray53[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt3983) {
									this.aClass77_Sub39_15.anInt3089 = (local205 + this.anInt3983) * -1387468933;
									this.anInt3990 = this.aClass77_Sub39_15.anInt3089 * 31645619 - local205;
									this.aBoolean686 = false;
									break;
								}
								if (local352 < 255) {
									this.aList16.add(local333);
									this.aList17.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean686) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList16.iterator();
						@Pc(424) Iterator local424 = this.aList17.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt3997 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method26819() && this.aBoolean689 && this.anInt4001 < this.anInt3994 && local352 < this.anInt4000) {
									this.anInt3991 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method26941(this.aClass77_Sub39_15.aByteArray53, local436, local440, this.anAtomicReference1);
									@Pc(492) Class269[] local492 = (Class269[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean689 && this.anInt4001 < this.anInt3994 && local352 < this.anInt4000) {
										if (this.method26819()) {
											this.anInt3984 = 0;
											if (this.aClass269Array1 == null || this.aClass269Array1 != null && (this.aClass269Array1.length != this.anInt3980 || this.aClass269Array1[0].anInt3835 != this.anInt3981)) {
												if (this.aClass269Array1 != null) {
													this.method26883(this.aClass269Array1);
												}
												this.aClass269Array1 = this.method26872(this.anInt3980, this.anInt3981);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt3835;
										this.anInt3996 += local514;
										if (this.anInt3996 > local278 && local246 == 4) {
											this.anInt3997 = this.anInt3996 - local278 - this.anInt3997;
											local514 -= this.anInt3997;
											if (this.anInt3997 > local492[0].anInt3835) {
												this.anInt3997 = local492[0].anInt3835;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method26818(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean689 && this.anInt3991 < this.anInt3977) {
											local578 = local567;
											local567 -= this.method26818(this.anInt3977 - this.anInt3991);
											if (local567 <= 0) {
												this.anInt3991 += this.method26817(local578);
												this.method26883(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt3977 - this.anInt3991;
										}
										if (this.anInt3991 + local514 > this.anInt3979 && (this.anInt3995 < this.anInt3986 || this.anInt3986 < 0) && this.aBoolean690) {
											local567 -= this.method26818(this.anInt3991 + local514 - this.anInt3979 - 1);
											if (local567 <= 0) {
												this.method26883(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method26806();
										if (this.method26866() < this.method26806()) {
											@Pc(666) int local666 = this.method26806() - this.method26866();
											local567 += local567 / this.method26866() * local666;
										}
										@Pc(679) Class77_Sub39 local679 = this.method26970(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean689;
											if (this.anInt3986 != 0) {
												if (this.anInt3991 == this.anInt3977) {
													if (this.anInt3992 < 0) {
														this.anInt3992 = this.anInt3988;
														this.anInt4000 = local352;
													}
													this.aBoolean689 = false;
												}
												if (this.anInt3991 == this.anInt3979 && this.anInt3993 < 0) {
													this.anInt3993 = this.anInt3988;
												}
												if (this.anInt3991 > this.anInt3979 && (this.anInt3995 < this.anInt3986 || this.anInt3986 < 0) && this.aBoolean690) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt3991 < this.anInt3977 || this.anInt3991 > this.anInt3979)) {
												this.anInt3991++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray99[local681];
													} else {
														local780 = local492[local766 % this.method26866()].aFloatArray99[local681];
													}
													@Pc(799) int local799;
													if (this.aClass393_1 == Class393.aClass393_4) {
														local799 = this.method26956(local780);
														if (this.aClass397_1 == Class397.aClass397_3) {
															local679.method22412(local799);
														} else {
															local679.method22408(local799);
														}
													} else if (this.aClass393_1 == Class393.aClass393_2) {
														local799 = this.method26957(local780);
														if (this.aClass397_1 == Class397.aClass397_3) {
															local679.method22412(local799);
														} else {
															local679.method22408(local799);
														}
													} else if (this.aClass393_1 == Class393.aClass393_5) {
														local799 = this.method26960(local780);
														local679.method22403(local799);
													} else if (this.aClass393_1 == Class393.aClass393_3) {
														local799 = this.method26965(local780);
														local679.method22403(local799);
													}
												}
												this.anInt3991++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList15;
										synchronized (this.aList15) {
											this.anInt3999 += this.method26817(local679.anInt3089 * 31645619) / this.method26806();
											this.aList15.add(local679);
										}
									}
									this.method26883(local492);
									local492 = null;
								}
							}
							this.aClass77_Sub39_15.anInt3089 = local304 * -1387468933;
							this.anInt3983 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aClass77_Sub39_15 != null) {
						this.anInt3990 = this.anInt3983;
						this.aClass77_Sub39_15.anInt3089 += this.anInt3983 * -1387468933;
					}
					this.aBoolean686 = false;
					return;
				}
				this.aBoolean686 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ec", descriptor = "()V", line = 1005)
	synchronized void method26952() {
		@Pc(10) int local10 = this.aClass77_Sub39_15 == null ? 0 : this.aClass77_Sub39_15.anInt3089 * 31645619;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList14.iterator();
		@Pc(23) Class77_Sub39 local23;
		while (local16.hasNext()) {
			local23 = (Class77_Sub39) local16.next();
			local12 += local23.anInt3089 * 31645619;
		}
		if (this.aClass77_Sub39_15 == null) {
			this.aClass77_Sub39_15 = this.method26970(local12);
			this.anInt3983 = 0;
			local10 = 0;
		} else if (this.aClass77_Sub39_15.aByteArray53.length - this.aClass77_Sub39_15.anInt3089 * 31645619 < local12) {
			@Pc(53) Class77_Sub39 local53 = this.method26970(local12 + this.anInt3983);
			local53.method22452(this.aClass77_Sub39_15.aByteArray53, this.aClass77_Sub39_15.anInt3089 * 31645619 - this.anInt3990, this.anInt3983);
			this.aClass77_Sub39_15.method22401();
			this.aClass77_Sub39_15 = local53;
			local10 = this.anInt3990;
		}
		local16 = this.aList14.iterator();
		while (local16.hasNext()) {
			local23 = (Class77_Sub39) local16.next();
			this.aClass77_Sub39_15.method22452(local23.aByteArray53, 0, local23.anInt3089 * 31645619);
			this.anInt3983 += local23.anInt3089 * 31645619;
			local23.method22401();
		}
		this.aClass77_Sub39_15.anInt3089 = (local10 - this.anInt3990) * -1387468933;
		this.anInt3990 = 0;
		this.aList14.clear();
		label286: while (true) {
			if (this.aBoolean686) {
				if (this.aClass77_Sub39_15.anInt3089 * 31645619 < this.aClass77_Sub39_15.aByteArray53.length) {
					if (this.aBoolean688 && (float) (this.anInt3999 / this.method26861()) > this.aFloat262) {
						return;
					}
					if (this.aClass77_Sub39_15 != null && this.anInt3983 >= 27) {
						@Pc(205) int local205 = this.aClass77_Sub39_15.anInt3089 * 31645619;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method26897(this.aClass77_Sub39_15)) {
							return;
						}
						this.anInt4001++;
						if (this.anInt4000 < 0) {
							this.anInt3994++;
						}
						this.aList16.clear();
						this.aList17.clear();
						this.aClass77_Sub39_15.method22478();
						@Pc(246) int local246 = this.aClass77_Sub39_15.method22478();
						@Pc(278) int local278 = this.aClass77_Sub39_15.method22478() & 0xFF | (this.aClass77_Sub39_15.method22478() & 0xFF) << 8 | (this.aClass77_Sub39_15.method22478() & 0xFF) << 16 | this.aClass77_Sub39_15.method22478() << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aClass77_Sub39_15.anInt3089 += -724666448;
						@Pc(294) int local294 = this.aClass77_Sub39_15.method22478();
						@Pc(300) int local300 = this.aClass77_Sub39_15.anInt3089 * 31645619;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt3983) {
							this.aClass77_Sub39_15.anInt3089 = (local205 + this.anInt3983) * -1387468933;
							this.anInt3990 = this.aClass77_Sub39_15.anInt3089 * 31645619 - local205;
							this.aBoolean686 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean686) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aClass77_Sub39_15.aByteArray53[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt3983) {
									this.aClass77_Sub39_15.anInt3089 = (local205 + this.anInt3983) * -1387468933;
									this.anInt3990 = this.aClass77_Sub39_15.anInt3089 * 31645619 - local205;
									this.aBoolean686 = false;
									break;
								}
								if (local352 < 255) {
									this.aList16.add(local333);
									this.aList17.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean686) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList16.iterator();
						@Pc(424) Iterator local424 = this.aList17.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt3997 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method26819() && this.aBoolean689 && this.anInt4001 < this.anInt3994 && local352 < this.anInt4000) {
									this.anInt3991 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method26941(this.aClass77_Sub39_15.aByteArray53, local436, local440, this.anAtomicReference1);
									@Pc(492) Class269[] local492 = (Class269[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean689 && this.anInt4001 < this.anInt3994 && local352 < this.anInt4000) {
										if (this.method26819()) {
											this.anInt3984 = 0;
											if (this.aClass269Array1 == null || this.aClass269Array1 != null && (this.aClass269Array1.length != this.anInt3980 || this.aClass269Array1[0].anInt3835 != this.anInt3981)) {
												if (this.aClass269Array1 != null) {
													this.method26883(this.aClass269Array1);
												}
												this.aClass269Array1 = this.method26872(this.anInt3980, this.anInt3981);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt3835;
										this.anInt3996 += local514;
										if (this.anInt3996 > local278 && local246 == 4) {
											this.anInt3997 = this.anInt3996 - local278 - this.anInt3997;
											local514 -= this.anInt3997;
											if (this.anInt3997 > local492[0].anInt3835) {
												this.anInt3997 = local492[0].anInt3835;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method26818(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean689 && this.anInt3991 < this.anInt3977) {
											local578 = local567;
											local567 -= this.method26818(this.anInt3977 - this.anInt3991);
											if (local567 <= 0) {
												this.anInt3991 += this.method26817(local578);
												this.method26883(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt3977 - this.anInt3991;
										}
										if (this.anInt3991 + local514 > this.anInt3979 && (this.anInt3995 < this.anInt3986 || this.anInt3986 < 0) && this.aBoolean690) {
											local567 -= this.method26818(this.anInt3991 + local514 - this.anInt3979 - 1);
											if (local567 <= 0) {
												this.method26883(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method26806();
										if (this.method26866() < this.method26806()) {
											@Pc(666) int local666 = this.method26806() - this.method26866();
											local567 += local567 / this.method26866() * local666;
										}
										@Pc(679) Class77_Sub39 local679 = this.method26970(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean689;
											if (this.anInt3986 != 0) {
												if (this.anInt3991 == this.anInt3977) {
													if (this.anInt3992 < 0) {
														this.anInt3992 = this.anInt3988;
														this.anInt4000 = local352;
													}
													this.aBoolean689 = false;
												}
												if (this.anInt3991 == this.anInt3979 && this.anInt3993 < 0) {
													this.anInt3993 = this.anInt3988;
												}
												if (this.anInt3991 > this.anInt3979 && (this.anInt3995 < this.anInt3986 || this.anInt3986 < 0) && this.aBoolean690) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt3991 < this.anInt3977 || this.anInt3991 > this.anInt3979)) {
												this.anInt3991++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray99[local681];
													} else {
														local780 = local492[local766 % this.method26866()].aFloatArray99[local681];
													}
													@Pc(799) int local799;
													if (this.aClass393_1 == Class393.aClass393_4) {
														local799 = this.method26956(local780);
														if (this.aClass397_1 == Class397.aClass397_3) {
															local679.method22412(local799);
														} else {
															local679.method22408(local799);
														}
													} else if (this.aClass393_1 == Class393.aClass393_2) {
														local799 = this.method26957(local780);
														if (this.aClass397_1 == Class397.aClass397_3) {
															local679.method22412(local799);
														} else {
															local679.method22408(local799);
														}
													} else if (this.aClass393_1 == Class393.aClass393_5) {
														local799 = this.method26960(local780);
														local679.method22403(local799);
													} else if (this.aClass393_1 == Class393.aClass393_3) {
														local799 = this.method26965(local780);
														local679.method22403(local799);
													}
												}
												this.anInt3991++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList15;
										synchronized (this.aList15) {
											this.anInt3999 += this.method26817(local679.anInt3089 * 31645619) / this.method26806();
											this.aList15.add(local679);
										}
									}
									this.method26883(local492);
									local492 = null;
								}
							}
							this.aClass77_Sub39_15.anInt3089 = local304 * -1387468933;
							this.anInt3983 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aClass77_Sub39_15 != null) {
						this.anInt3990 = this.anInt3983;
						this.aClass77_Sub39_15.anInt3089 += this.anInt3983 * -1387468933;
					}
					this.aBoolean686 = false;
					return;
				}
				this.aBoolean686 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ea", descriptor = "()V", line = 1005)
	synchronized void method26953() {
		@Pc(10) int local10 = this.aClass77_Sub39_15 == null ? 0 : this.aClass77_Sub39_15.anInt3089 * 31645619;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList14.iterator();
		@Pc(23) Class77_Sub39 local23;
		while (local16.hasNext()) {
			local23 = (Class77_Sub39) local16.next();
			local12 += local23.anInt3089 * 31645619;
		}
		if (this.aClass77_Sub39_15 == null) {
			this.aClass77_Sub39_15 = this.method26970(local12);
			this.anInt3983 = 0;
			local10 = 0;
		} else if (this.aClass77_Sub39_15.aByteArray53.length - this.aClass77_Sub39_15.anInt3089 * 31645619 < local12) {
			@Pc(53) Class77_Sub39 local53 = this.method26970(local12 + this.anInt3983);
			local53.method22452(this.aClass77_Sub39_15.aByteArray53, this.aClass77_Sub39_15.anInt3089 * 31645619 - this.anInt3990, this.anInt3983);
			this.aClass77_Sub39_15.method22401();
			this.aClass77_Sub39_15 = local53;
			local10 = this.anInt3990;
		}
		local16 = this.aList14.iterator();
		while (local16.hasNext()) {
			local23 = (Class77_Sub39) local16.next();
			this.aClass77_Sub39_15.method22452(local23.aByteArray53, 0, local23.anInt3089 * 31645619);
			this.anInt3983 += local23.anInt3089 * 31645619;
			local23.method22401();
		}
		this.aClass77_Sub39_15.anInt3089 = (local10 - this.anInt3990) * -1387468933;
		this.anInt3990 = 0;
		this.aList14.clear();
		label286: while (true) {
			if (this.aBoolean686) {
				if (this.aClass77_Sub39_15.anInt3089 * 31645619 < this.aClass77_Sub39_15.aByteArray53.length) {
					if (this.aBoolean688 && (float) (this.anInt3999 / this.method26861()) > this.aFloat262) {
						return;
					}
					if (this.aClass77_Sub39_15 != null && this.anInt3983 >= 27) {
						@Pc(205) int local205 = this.aClass77_Sub39_15.anInt3089 * 31645619;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method26897(this.aClass77_Sub39_15)) {
							return;
						}
						this.anInt4001++;
						if (this.anInt4000 < 0) {
							this.anInt3994++;
						}
						this.aList16.clear();
						this.aList17.clear();
						this.aClass77_Sub39_15.method22478();
						@Pc(246) int local246 = this.aClass77_Sub39_15.method22478();
						@Pc(278) int local278 = this.aClass77_Sub39_15.method22478() & 0xFF | (this.aClass77_Sub39_15.method22478() & 0xFF) << 8 | (this.aClass77_Sub39_15.method22478() & 0xFF) << 16 | this.aClass77_Sub39_15.method22478() << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aClass77_Sub39_15.anInt3089 += -724666448;
						@Pc(294) int local294 = this.aClass77_Sub39_15.method22478();
						@Pc(300) int local300 = this.aClass77_Sub39_15.anInt3089 * 31645619;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt3983) {
							this.aClass77_Sub39_15.anInt3089 = (local205 + this.anInt3983) * -1387468933;
							this.anInt3990 = this.aClass77_Sub39_15.anInt3089 * 31645619 - local205;
							this.aBoolean686 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean686) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aClass77_Sub39_15.aByteArray53[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt3983) {
									this.aClass77_Sub39_15.anInt3089 = (local205 + this.anInt3983) * -1387468933;
									this.anInt3990 = this.aClass77_Sub39_15.anInt3089 * 31645619 - local205;
									this.aBoolean686 = false;
									break;
								}
								if (local352 < 255) {
									this.aList16.add(local333);
									this.aList17.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean686) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList16.iterator();
						@Pc(424) Iterator local424 = this.aList17.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt3997 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method26819() && this.aBoolean689 && this.anInt4001 < this.anInt3994 && local352 < this.anInt4000) {
									this.anInt3991 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method26941(this.aClass77_Sub39_15.aByteArray53, local436, local440, this.anAtomicReference1);
									@Pc(492) Class269[] local492 = (Class269[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean689 && this.anInt4001 < this.anInt3994 && local352 < this.anInt4000) {
										if (this.method26819()) {
											this.anInt3984 = 0;
											if (this.aClass269Array1 == null || this.aClass269Array1 != null && (this.aClass269Array1.length != this.anInt3980 || this.aClass269Array1[0].anInt3835 != this.anInt3981)) {
												if (this.aClass269Array1 != null) {
													this.method26883(this.aClass269Array1);
												}
												this.aClass269Array1 = this.method26872(this.anInt3980, this.anInt3981);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt3835;
										this.anInt3996 += local514;
										if (this.anInt3996 > local278 && local246 == 4) {
											this.anInt3997 = this.anInt3996 - local278 - this.anInt3997;
											local514 -= this.anInt3997;
											if (this.anInt3997 > local492[0].anInt3835) {
												this.anInt3997 = local492[0].anInt3835;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method26818(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean689 && this.anInt3991 < this.anInt3977) {
											local578 = local567;
											local567 -= this.method26818(this.anInt3977 - this.anInt3991);
											if (local567 <= 0) {
												this.anInt3991 += this.method26817(local578);
												this.method26883(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt3977 - this.anInt3991;
										}
										if (this.anInt3991 + local514 > this.anInt3979 && (this.anInt3995 < this.anInt3986 || this.anInt3986 < 0) && this.aBoolean690) {
											local567 -= this.method26818(this.anInt3991 + local514 - this.anInt3979 - 1);
											if (local567 <= 0) {
												this.method26883(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method26806();
										if (this.method26866() < this.method26806()) {
											@Pc(666) int local666 = this.method26806() - this.method26866();
											local567 += local567 / this.method26866() * local666;
										}
										@Pc(679) Class77_Sub39 local679 = this.method26970(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean689;
											if (this.anInt3986 != 0) {
												if (this.anInt3991 == this.anInt3977) {
													if (this.anInt3992 < 0) {
														this.anInt3992 = this.anInt3988;
														this.anInt4000 = local352;
													}
													this.aBoolean689 = false;
												}
												if (this.anInt3991 == this.anInt3979 && this.anInt3993 < 0) {
													this.anInt3993 = this.anInt3988;
												}
												if (this.anInt3991 > this.anInt3979 && (this.anInt3995 < this.anInt3986 || this.anInt3986 < 0) && this.aBoolean690) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt3991 < this.anInt3977 || this.anInt3991 > this.anInt3979)) {
												this.anInt3991++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray99[local681];
													} else {
														local780 = local492[local766 % this.method26866()].aFloatArray99[local681];
													}
													@Pc(799) int local799;
													if (this.aClass393_1 == Class393.aClass393_4) {
														local799 = this.method26956(local780);
														if (this.aClass397_1 == Class397.aClass397_3) {
															local679.method22412(local799);
														} else {
															local679.method22408(local799);
														}
													} else if (this.aClass393_1 == Class393.aClass393_2) {
														local799 = this.method26957(local780);
														if (this.aClass397_1 == Class397.aClass397_3) {
															local679.method22412(local799);
														} else {
															local679.method22408(local799);
														}
													} else if (this.aClass393_1 == Class393.aClass393_5) {
														local799 = this.method26960(local780);
														local679.method22403(local799);
													} else if (this.aClass393_1 == Class393.aClass393_3) {
														local799 = this.method26965(local780);
														local679.method22403(local799);
													}
												}
												this.anInt3991++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList15;
										synchronized (this.aList15) {
											this.anInt3999 += this.method26817(local679.anInt3089 * 31645619) / this.method26806();
											this.aList15.add(local679);
										}
									}
									this.method26883(local492);
									local492 = null;
								}
							}
							this.aClass77_Sub39_15.anInt3089 = local304 * -1387468933;
							this.anInt3983 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aClass77_Sub39_15 != null) {
						this.anInt3990 = this.anInt3983;
						this.aClass77_Sub39_15.anInt3089 += this.anInt3983 * -1387468933;
					}
					this.aBoolean686 = false;
					return;
				}
				this.aBoolean686 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gx", name = "el", descriptor = "()V", line = 1005)
	synchronized void method26954() {
		@Pc(10) int local10 = this.aClass77_Sub39_15 == null ? 0 : this.aClass77_Sub39_15.anInt3089 * 31645619;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList14.iterator();
		@Pc(23) Class77_Sub39 local23;
		while (local16.hasNext()) {
			local23 = (Class77_Sub39) local16.next();
			local12 += local23.anInt3089 * 31645619;
		}
		if (this.aClass77_Sub39_15 == null) {
			this.aClass77_Sub39_15 = this.method26970(local12);
			this.anInt3983 = 0;
			local10 = 0;
		} else if (this.aClass77_Sub39_15.aByteArray53.length - this.aClass77_Sub39_15.anInt3089 * 31645619 < local12) {
			@Pc(53) Class77_Sub39 local53 = this.method26970(local12 + this.anInt3983);
			local53.method22452(this.aClass77_Sub39_15.aByteArray53, this.aClass77_Sub39_15.anInt3089 * 31645619 - this.anInt3990, this.anInt3983);
			this.aClass77_Sub39_15.method22401();
			this.aClass77_Sub39_15 = local53;
			local10 = this.anInt3990;
		}
		local16 = this.aList14.iterator();
		while (local16.hasNext()) {
			local23 = (Class77_Sub39) local16.next();
			this.aClass77_Sub39_15.method22452(local23.aByteArray53, 0, local23.anInt3089 * 31645619);
			this.anInt3983 += local23.anInt3089 * 31645619;
			local23.method22401();
		}
		this.aClass77_Sub39_15.anInt3089 = (local10 - this.anInt3990) * -1387468933;
		this.anInt3990 = 0;
		this.aList14.clear();
		label286: while (true) {
			if (this.aBoolean686) {
				if (this.aClass77_Sub39_15.anInt3089 * 31645619 < this.aClass77_Sub39_15.aByteArray53.length) {
					if (this.aBoolean688 && (float) (this.anInt3999 / this.method26861()) > this.aFloat262) {
						return;
					}
					if (this.aClass77_Sub39_15 != null && this.anInt3983 >= 27) {
						@Pc(205) int local205 = this.aClass77_Sub39_15.anInt3089 * 31645619;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method26897(this.aClass77_Sub39_15)) {
							return;
						}
						this.anInt4001++;
						if (this.anInt4000 < 0) {
							this.anInt3994++;
						}
						this.aList16.clear();
						this.aList17.clear();
						this.aClass77_Sub39_15.method22478();
						@Pc(246) int local246 = this.aClass77_Sub39_15.method22478();
						@Pc(278) int local278 = this.aClass77_Sub39_15.method22478() & 0xFF | (this.aClass77_Sub39_15.method22478() & 0xFF) << 8 | (this.aClass77_Sub39_15.method22478() & 0xFF) << 16 | this.aClass77_Sub39_15.method22478() << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aClass77_Sub39_15.anInt3089 += -724666448;
						@Pc(294) int local294 = this.aClass77_Sub39_15.method22478();
						@Pc(300) int local300 = this.aClass77_Sub39_15.anInt3089 * 31645619;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt3983) {
							this.aClass77_Sub39_15.anInt3089 = (local205 + this.anInt3983) * -1387468933;
							this.anInt3990 = this.aClass77_Sub39_15.anInt3089 * 31645619 - local205;
							this.aBoolean686 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean686) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aClass77_Sub39_15.aByteArray53[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt3983) {
									this.aClass77_Sub39_15.anInt3089 = (local205 + this.anInt3983) * -1387468933;
									this.anInt3990 = this.aClass77_Sub39_15.anInt3089 * 31645619 - local205;
									this.aBoolean686 = false;
									break;
								}
								if (local352 < 255) {
									this.aList16.add(local333);
									this.aList17.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean686) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList16.iterator();
						@Pc(424) Iterator local424 = this.aList17.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt3997 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method26819() && this.aBoolean689 && this.anInt4001 < this.anInt3994 && local352 < this.anInt4000) {
									this.anInt3991 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method26941(this.aClass77_Sub39_15.aByteArray53, local436, local440, this.anAtomicReference1);
									@Pc(492) Class269[] local492 = (Class269[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean689 && this.anInt4001 < this.anInt3994 && local352 < this.anInt4000) {
										if (this.method26819()) {
											this.anInt3984 = 0;
											if (this.aClass269Array1 == null || this.aClass269Array1 != null && (this.aClass269Array1.length != this.anInt3980 || this.aClass269Array1[0].anInt3835 != this.anInt3981)) {
												if (this.aClass269Array1 != null) {
													this.method26883(this.aClass269Array1);
												}
												this.aClass269Array1 = this.method26872(this.anInt3980, this.anInt3981);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt3835;
										this.anInt3996 += local514;
										if (this.anInt3996 > local278 && local246 == 4) {
											this.anInt3997 = this.anInt3996 - local278 - this.anInt3997;
											local514 -= this.anInt3997;
											if (this.anInt3997 > local492[0].anInt3835) {
												this.anInt3997 = local492[0].anInt3835;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method26818(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean689 && this.anInt3991 < this.anInt3977) {
											local578 = local567;
											local567 -= this.method26818(this.anInt3977 - this.anInt3991);
											if (local567 <= 0) {
												this.anInt3991 += this.method26817(local578);
												this.method26883(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt3977 - this.anInt3991;
										}
										if (this.anInt3991 + local514 > this.anInt3979 && (this.anInt3995 < this.anInt3986 || this.anInt3986 < 0) && this.aBoolean690) {
											local567 -= this.method26818(this.anInt3991 + local514 - this.anInt3979 - 1);
											if (local567 <= 0) {
												this.method26883(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method26806();
										if (this.method26866() < this.method26806()) {
											@Pc(666) int local666 = this.method26806() - this.method26866();
											local567 += local567 / this.method26866() * local666;
										}
										@Pc(679) Class77_Sub39 local679 = this.method26970(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean689;
											if (this.anInt3986 != 0) {
												if (this.anInt3991 == this.anInt3977) {
													if (this.anInt3992 < 0) {
														this.anInt3992 = this.anInt3988;
														this.anInt4000 = local352;
													}
													this.aBoolean689 = false;
												}
												if (this.anInt3991 == this.anInt3979 && this.anInt3993 < 0) {
													this.anInt3993 = this.anInt3988;
												}
												if (this.anInt3991 > this.anInt3979 && (this.anInt3995 < this.anInt3986 || this.anInt3986 < 0) && this.aBoolean690) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt3991 < this.anInt3977 || this.anInt3991 > this.anInt3979)) {
												this.anInt3991++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray99[local681];
													} else {
														local780 = local492[local766 % this.method26866()].aFloatArray99[local681];
													}
													@Pc(799) int local799;
													if (this.aClass393_1 == Class393.aClass393_4) {
														local799 = this.method26956(local780);
														if (this.aClass397_1 == Class397.aClass397_3) {
															local679.method22412(local799);
														} else {
															local679.method22408(local799);
														}
													} else if (this.aClass393_1 == Class393.aClass393_2) {
														local799 = this.method26957(local780);
														if (this.aClass397_1 == Class397.aClass397_3) {
															local679.method22412(local799);
														} else {
															local679.method22408(local799);
														}
													} else if (this.aClass393_1 == Class393.aClass393_5) {
														local799 = this.method26960(local780);
														local679.method22403(local799);
													} else if (this.aClass393_1 == Class393.aClass393_3) {
														local799 = this.method26965(local780);
														local679.method22403(local799);
													}
												}
												this.anInt3991++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList15;
										synchronized (this.aList15) {
											this.anInt3999 += this.method26817(local679.anInt3089 * 31645619) / this.method26806();
											this.aList15.add(local679);
										}
									}
									this.method26883(local492);
									local492 = null;
								}
							}
							this.aClass77_Sub39_15.anInt3089 = local304 * -1387468933;
							this.anInt3983 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aClass77_Sub39_15 != null) {
						this.anInt3990 = this.anInt3983;
						this.aClass77_Sub39_15.anInt3089 += this.anInt3983 * -1387468933;
					}
					this.aBoolean686 = false;
					return;
				}
				this.aBoolean686 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gx", name = "eg", descriptor = "()V", line = 1005)
	synchronized void method26955() {
		@Pc(10) int local10 = this.aClass77_Sub39_15 == null ? 0 : this.aClass77_Sub39_15.anInt3089 * 31645619;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList14.iterator();
		@Pc(23) Class77_Sub39 local23;
		while (local16.hasNext()) {
			local23 = (Class77_Sub39) local16.next();
			local12 += local23.anInt3089 * 31645619;
		}
		if (this.aClass77_Sub39_15 == null) {
			this.aClass77_Sub39_15 = this.method26970(local12);
			this.anInt3983 = 0;
			local10 = 0;
		} else if (this.aClass77_Sub39_15.aByteArray53.length - this.aClass77_Sub39_15.anInt3089 * 31645619 < local12) {
			@Pc(53) Class77_Sub39 local53 = this.method26970(local12 + this.anInt3983);
			local53.method22452(this.aClass77_Sub39_15.aByteArray53, this.aClass77_Sub39_15.anInt3089 * 31645619 - this.anInt3990, this.anInt3983);
			this.aClass77_Sub39_15.method22401();
			this.aClass77_Sub39_15 = local53;
			local10 = this.anInt3990;
		}
		local16 = this.aList14.iterator();
		while (local16.hasNext()) {
			local23 = (Class77_Sub39) local16.next();
			this.aClass77_Sub39_15.method22452(local23.aByteArray53, 0, local23.anInt3089 * 31645619);
			this.anInt3983 += local23.anInt3089 * 31645619;
			local23.method22401();
		}
		this.aClass77_Sub39_15.anInt3089 = (local10 - this.anInt3990) * -1387468933;
		this.anInt3990 = 0;
		this.aList14.clear();
		label286: while (true) {
			if (this.aBoolean686) {
				if (this.aClass77_Sub39_15.anInt3089 * 31645619 < this.aClass77_Sub39_15.aByteArray53.length) {
					if (this.aBoolean688 && (float) (this.anInt3999 / this.method26861()) > this.aFloat262) {
						return;
					}
					if (this.aClass77_Sub39_15 != null && this.anInt3983 >= 27) {
						@Pc(205) int local205 = this.aClass77_Sub39_15.anInt3089 * 31645619;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method26897(this.aClass77_Sub39_15)) {
							return;
						}
						this.anInt4001++;
						if (this.anInt4000 < 0) {
							this.anInt3994++;
						}
						this.aList16.clear();
						this.aList17.clear();
						this.aClass77_Sub39_15.method22478();
						@Pc(246) int local246 = this.aClass77_Sub39_15.method22478();
						@Pc(278) int local278 = this.aClass77_Sub39_15.method22478() & 0xFF | (this.aClass77_Sub39_15.method22478() & 0xFF) << 8 | (this.aClass77_Sub39_15.method22478() & 0xFF) << 16 | this.aClass77_Sub39_15.method22478() << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aClass77_Sub39_15.anInt3089 += -724666448;
						@Pc(294) int local294 = this.aClass77_Sub39_15.method22478();
						@Pc(300) int local300 = this.aClass77_Sub39_15.anInt3089 * 31645619;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt3983) {
							this.aClass77_Sub39_15.anInt3089 = (local205 + this.anInt3983) * -1387468933;
							this.anInt3990 = this.aClass77_Sub39_15.anInt3089 * 31645619 - local205;
							this.aBoolean686 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean686) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aClass77_Sub39_15.aByteArray53[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt3983) {
									this.aClass77_Sub39_15.anInt3089 = (local205 + this.anInt3983) * -1387468933;
									this.anInt3990 = this.aClass77_Sub39_15.anInt3089 * 31645619 - local205;
									this.aBoolean686 = false;
									break;
								}
								if (local352 < 255) {
									this.aList16.add(local333);
									this.aList17.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean686) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList16.iterator();
						@Pc(424) Iterator local424 = this.aList17.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt3997 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method26819() && this.aBoolean689 && this.anInt4001 < this.anInt3994 && local352 < this.anInt4000) {
									this.anInt3991 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method26941(this.aClass77_Sub39_15.aByteArray53, local436, local440, this.anAtomicReference1);
									@Pc(492) Class269[] local492 = (Class269[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean689 && this.anInt4001 < this.anInt3994 && local352 < this.anInt4000) {
										if (this.method26819()) {
											this.anInt3984 = 0;
											if (this.aClass269Array1 == null || this.aClass269Array1 != null && (this.aClass269Array1.length != this.anInt3980 || this.aClass269Array1[0].anInt3835 != this.anInt3981)) {
												if (this.aClass269Array1 != null) {
													this.method26883(this.aClass269Array1);
												}
												this.aClass269Array1 = this.method26872(this.anInt3980, this.anInt3981);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt3835;
										this.anInt3996 += local514;
										if (this.anInt3996 > local278 && local246 == 4) {
											this.anInt3997 = this.anInt3996 - local278 - this.anInt3997;
											local514 -= this.anInt3997;
											if (this.anInt3997 > local492[0].anInt3835) {
												this.anInt3997 = local492[0].anInt3835;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method26818(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean689 && this.anInt3991 < this.anInt3977) {
											local578 = local567;
											local567 -= this.method26818(this.anInt3977 - this.anInt3991);
											if (local567 <= 0) {
												this.anInt3991 += this.method26817(local578);
												this.method26883(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt3977 - this.anInt3991;
										}
										if (this.anInt3991 + local514 > this.anInt3979 && (this.anInt3995 < this.anInt3986 || this.anInt3986 < 0) && this.aBoolean690) {
											local567 -= this.method26818(this.anInt3991 + local514 - this.anInt3979 - 1);
											if (local567 <= 0) {
												this.method26883(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method26806();
										if (this.method26866() < this.method26806()) {
											@Pc(666) int local666 = this.method26806() - this.method26866();
											local567 += local567 / this.method26866() * local666;
										}
										@Pc(679) Class77_Sub39 local679 = this.method26970(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean689;
											if (this.anInt3986 != 0) {
												if (this.anInt3991 == this.anInt3977) {
													if (this.anInt3992 < 0) {
														this.anInt3992 = this.anInt3988;
														this.anInt4000 = local352;
													}
													this.aBoolean689 = false;
												}
												if (this.anInt3991 == this.anInt3979 && this.anInt3993 < 0) {
													this.anInt3993 = this.anInt3988;
												}
												if (this.anInt3991 > this.anInt3979 && (this.anInt3995 < this.anInt3986 || this.anInt3986 < 0) && this.aBoolean690) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt3991 < this.anInt3977 || this.anInt3991 > this.anInt3979)) {
												this.anInt3991++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray99[local681];
													} else {
														local780 = local492[local766 % this.method26866()].aFloatArray99[local681];
													}
													@Pc(799) int local799;
													if (this.aClass393_1 == Class393.aClass393_4) {
														local799 = this.method26956(local780);
														if (this.aClass397_1 == Class397.aClass397_3) {
															local679.method22412(local799);
														} else {
															local679.method22408(local799);
														}
													} else if (this.aClass393_1 == Class393.aClass393_2) {
														local799 = this.method26957(local780);
														if (this.aClass397_1 == Class397.aClass397_3) {
															local679.method22412(local799);
														} else {
															local679.method22408(local799);
														}
													} else if (this.aClass393_1 == Class393.aClass393_5) {
														local799 = this.method26960(local780);
														local679.method22403(local799);
													} else if (this.aClass393_1 == Class393.aClass393_3) {
														local799 = this.method26965(local780);
														local679.method22403(local799);
													}
												}
												this.anInt3991++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList15;
										synchronized (this.aList15) {
											this.anInt3999 += this.method26817(local679.anInt3089 * 31645619) / this.method26806();
											this.aList15.add(local679);
										}
									}
									this.method26883(local492);
									local492 = null;
								}
							}
							this.aClass77_Sub39_15.anInt3089 = local304 * -1387468933;
							this.anInt3983 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aClass77_Sub39_15 != null) {
						this.anInt3990 = this.anInt3983;
						this.aClass77_Sub39_15.anInt3089 += this.anInt3983 * -1387468933;
					}
					this.aBoolean686 = false;
					return;
				}
				this.aBoolean686 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ay", descriptor = "(F)I", line = 1252)
	int method26956(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 32767.0F);
		if (local4 > 32767) {
			return 32767;
		} else if (local4 < -32768) {
			return -32768;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!gx", name = "af", descriptor = "(F)I", line = 1259)
	int method26957(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 32767.0F + 32768.0F);
		if (local6 > 65535) {
			return 65535;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ey", descriptor = "(F)I", line = 1259)
	int method26958(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 32767.0F + 32768.0F);
		if (local6 > 65535) {
			return 65535;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ez", descriptor = "(F)I", line = 1266)
	int method26959(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 127.0F);
		if (local4 > 127) {
			return 127;
		} else if (local4 < -128) {
			return -128;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!gx", name = "an", descriptor = "(F)I", line = 1266)
	int method26960(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 127.0F);
		if (local4 > 127) {
			return 127;
		} else if (local4 < -128) {
			return -128;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!gx", name = "fv", descriptor = "(F)I", line = 1266)
	int method26961(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 127.0F);
		if (local4 > 127) {
			return 127;
		} else if (local4 < -128) {
			return -128;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ev", descriptor = "(F)I", line = 1266)
	int method26962(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 127.0F);
		if (local4 > 127) {
			return 127;
		} else if (local4 < -128) {
			return -128;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!gx", name = "eb", descriptor = "(F)I", line = 1266)
	int method26963(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 127.0F);
		if (local4 > 127) {
			return 127;
		} else if (local4 < -128) {
			return -128;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ek", descriptor = "(F)I", line = 1266)
	int method26964(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 127.0F);
		if (local4 > 127) {
			return 127;
		} else if (local4 < -128) {
			return -128;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ab", descriptor = "(F)I", line = 1273)
	int method26965(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 127.0F + 128.0F);
		if (local6 > 255) {
			return 255;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!gx", name = "fq", descriptor = "(F)I", line = 1273)
	int method26966(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 127.0F + 128.0F);
		if (local6 > 255) {
			return 255;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!gx", name = "fm", descriptor = "(F)I", line = 1273)
	int method26967(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 127.0F + 128.0F);
		if (local6 > 255) {
			return 255;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!gx", name = "aa", descriptor = "(I)Lclient!akv;", line = 1280)
	Class77_Sub39 method26968(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub39 local5 = this.method26970(this.method26818(arg0));
		@Pc(7) int local7 = arg0;
		@Pc(11) List local11 = this.aList15;
		synchronized (this.aList15) {
			while (!this.aList15.isEmpty()) {
				@Pc(22) Class77_Sub39 local22 = (Class77_Sub39) this.aList15.remove(0);
				this.anInt3999 -= this.method26817(local22.anInt3089 * 31645619) / this.method26806();
				@Pc(40) int local40 = this.method26818(local7);
				@Pc(53) int local53 = local22.anInt3089 * 31645619 < local40 ? local22.anInt3089 * 31645619 : local40;
				local5.method22452(local22.aByteArray53, 0, local53);
				local7 -= this.method26817(local53);
				@Pc(73) int local73 = local22.anInt3089 * 31645619 - local53;
				if (local73 == 0) {
					local22.method22401();
				} else {
					System.arraycopy(local22.aByteArray53, local53, local22.aByteArray53, 0, local73);
					local22.anInt3089 = local73 * -1387468933;
					this.anInt3999 += this.method26817(local73) / this.method26806();
					this.aList15.add(0, local22);
				}
				if (local7 <= 0) {
					break;
				}
			}
			if (this.aList15.isEmpty() && this.method26836() == Class385.aClass385_2) {
				this.method26860(Class385.aClass385_7);
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!gx", name = "fl", descriptor = "(I)Lclient!akv;", line = 1280)
	Class77_Sub39 method26969(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub39 local5 = this.method26970(this.method26818(arg0));
		@Pc(7) int local7 = arg0;
		@Pc(11) List local11 = this.aList15;
		synchronized (this.aList15) {
			while (!this.aList15.isEmpty()) {
				@Pc(22) Class77_Sub39 local22 = (Class77_Sub39) this.aList15.remove(0);
				this.anInt3999 -= this.method26817(local22.anInt3089 * 31645619) / this.method26806();
				@Pc(40) int local40 = this.method26818(local7);
				@Pc(53) int local53 = local22.anInt3089 * 31645619 < local40 ? local22.anInt3089 * 31645619 : local40;
				local5.method22452(local22.aByteArray53, 0, local53);
				local7 -= this.method26817(local53);
				@Pc(73) int local73 = local22.anInt3089 * 31645619 - local53;
				if (local73 == 0) {
					local22.method22401();
				} else {
					System.arraycopy(local22.aByteArray53, local53, local22.aByteArray53, 0, local73);
					local22.anInt3089 = local73 * -1387468933;
					this.anInt3999 += this.method26817(local73) / this.method26806();
					this.aList15.add(0, local22);
				}
				if (local7 <= 0) {
					break;
				}
			}
			if (this.aList15.isEmpty() && this.method26836() == Class385.aClass385_2) {
				this.method26860(Class385.aClass385_7);
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!gx", name = "ap", descriptor = "(I)Lclient!akv;", line = 1308)
	Class77_Sub39 method26970(@OriginalArg(0) int arg0) {
		return new Class77_Sub39(arg0, true);
	}

	@OriginalMember(owner = "client!gx", name = "fe", descriptor = "(I)Lclient!akv;", line = 1308)
	Class77_Sub39 method26971(@OriginalArg(0) int arg0) {
		return new Class77_Sub39(arg0, true);
	}

	@OriginalMember(owner = "client!gx", name = "fk", descriptor = "(I)Lclient!akv;", line = 1308)
	Class77_Sub39 method26972(@OriginalArg(0) int arg0) {
		return new Class77_Sub39(arg0, true);
	}

	@OriginalMember(owner = "client!gx", name = "ft", descriptor = "(I)Lclient!akv;", line = 1308)
	Class77_Sub39 method26973(@OriginalArg(0) int arg0) {
		return new Class77_Sub39(arg0, true);
	}

	@OriginalMember(owner = "client!gx", name = "aw", descriptor = "()I", line = 1312)
	int method26974() {
		return this.anInt3999;
	}

	@OriginalMember(owner = "client!gx", name = "fi", descriptor = "()I", line = 1312)
	int method26975() {
		return this.anInt3999;
	}

	@OriginalMember(owner = "client!gx", name = "fw", descriptor = "()I", line = 1312)
	int method26976() {
		return this.anInt3999;
	}

	@OriginalMember(owner = "client!gx", name = "az", descriptor = "(ZIII)V", line = 1316)
	@Override
	public void method26821(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean690 = arg0;
		this.anInt3986 = arg1;
		this.anInt3977 = arg2;
		this.anInt3979 = arg3;
	}

	@OriginalMember(owner = "client!gx", name = "fz", descriptor = "(ZIII)V", line = 1316)
	@Override
	public void method26854(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean690 = arg0;
		this.anInt3986 = arg1;
		this.anInt3977 = arg2;
		this.anInt3979 = arg3;
	}

	@OriginalMember(owner = "client!gx", name = "ff", descriptor = "(ZIII)V", line = 1316)
	@Override
	public void method26855(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean690 = arg0;
		this.anInt3986 = arg1;
		this.anInt3977 = arg2;
		this.anInt3979 = arg3;
	}

	@OriginalMember(owner = "client!gx", name = "fs", descriptor = "(ZIII)V", line = 1316)
	@Override
	public void method26813(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean690 = arg0;
		this.anInt3986 = arg1;
		this.anInt3977 = arg2;
		this.anInt3979 = arg3;
	}
}
