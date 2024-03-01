package com.jagex;

import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public class Class361 {

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger7 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger6 = new BigInteger("8bc4ef23e3b6522a9ff3acb9150b58ffed4968ea00105cae796d65a6e92fdaa407f15a830f9fb28d0ca6eeb2df507799e18a69f7b8f839f3de4bbc41f901cd82ad3a5cd2ac65bfac5354d362c9e76cb82bf1ca8febe12fea1d463c248951ee9f16c6f1bcafe6fa35e405e28678f63367b949331b4b081e8ade47fe659947110b", 16);

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger8 = new BigInteger("a47fa07ae8f8a86258927b175de124f2bce1d90e8a904d5f58c7b0e8382cbf8e16fe07c2bc0baac343bbdd9fdc37a81ad7f5d07498d90737fb899d97dccaee1c65cda1c9f1b36fe56f489d36dc1b9bd9e54cdac6eb6a66a01f03ea7af7cf5f708d93b684a86fc0582ab8806c271c915eea6bca0d1e3b85f39148f7297bd86eeecd1ffbbaffc72e1576c00c74bb1f7ed7ab4eddf139a86607c74867971c9564361f2ed919711e212d7bdadb2c79806664eb5e789edfbc176d8b6182d8c28762e50844bbc3835b8602970acc624521e39c7ad71e2c24028682a683beee49ed3fe5be6fb8be50979619ec8cccef38bae69dd7a6fc710d123b50fb55087df8d683cd9936474065e7d44a4aa8a7440faa3df0bc915407bd865f0d4c68b275222340878c6401aa4dd4e0599aba68e30288af157fc26c47d646a542816c3ded373e48ac5000597146d20ba9a630ad7dc776f35f20943b4d634c420637f490b909fc632e8a2dd72868fef6e20ac844f4cc07caed13a246fe3417082c5e8b2a50f5dfa6e6d9dc356dbc83f4dfe8735114e0dae85bddd145e935f79aad01ab3b47a671d1a3694d82c288c01b819acb2d6ef1b263a70cdbd1516d81e5114850e2d0b29e017a7f6321f85c25bc8cb7bd3336743e6c6f4209a598a05d9952a494a50e6e1bccf106408677cfe3b30896b96528054e19c1819eb9e7d8439c52a4e7b437189779a7", 16);

	static {
		new BigInteger("10001", 16);
		new BigInteger("a61823236e2e091ebc7959cef5dca16a8e7697526da9e4b215017283b364f316351825e44812e658f7c688af5ab565deca4a9f9d09833543755f46d4f8b0f0e3", 16);
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 19)
	Class361() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!o", name = "h", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z", line = 62)
	public static boolean method26768(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!Class391.aString215.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(23) String local23 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
						if (local23.indexOf(arg0.charAt(local25)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(58) Throwable local58) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(80) Object local80 = Class588.method33290(Class391.anApplet1, arg2, new Object[] { (new URL(Class391.anApplet1.getCodeBase(), arg0)).toString() });
				return local80 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				Class391.anApplet1.getAppletContext().showDocument(new URL(Class391.anApplet1.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class588.method33291(Class391.anApplet1, "loggedout");
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				Class391.anApplet1.getAppletContext().showDocument(new URL(Class391.anApplet1.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!o", name = "x", descriptor = "(B)Z", line = 102)
	static boolean method26771() {
		return Class67.aBoolean337;
	}

	@OriginalMember(owner = "client!o", name = "nw", descriptor = "(Lclient!vs;I)V", line = 6546)
	static final void method26772(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class424.method27888(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!o", name = "pq", descriptor = "(Lclient!vs;I)V", line = 6866)
	static final void method26769(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		@Pc(19) Class178 local19 = Class356.method26654(local14, local11);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local19 == null ? -1 : local19.anInt3570 * 954808515;
	}

	@OriginalMember(owner = "client!o", name = "afs", descriptor = "(Lclient!vs;B)V", line = 9828)
	static final void method26770(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class82 local2 = Class406.method27657();
		@Pc(8) Class3_Sub23 local8 = Class269.method25284(Class311.aClass311_21, local2.aClass577_2);
		local8.aClass3_Sub41_Sub1_1.method20250(0);
		@Pc(19) int local19 = local8.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local8.aClass3_Sub41_Sub1_1.method20250(3);
		local8.aClass3_Sub41_Sub1_1.method20251(arg0.aClass283_1.anInt4351 * 189047461);
		arg0.aClass283_1.aClass3_Sub1_Sub13_1.method19276(local8.aClass3_Sub41_Sub1_1, arg0.aClass283_1.anIntArray410);
		local8.aClass3_Sub41_Sub1_1.method20266(local8.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local19);
		local2.method21601(local8);
	}
}
