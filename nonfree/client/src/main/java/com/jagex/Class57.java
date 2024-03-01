package com.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public abstract class Class57 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	static final int anInt1366 = 10;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
	static final int anInt1367 = 50;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "Z")
	boolean aBoolean308;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Ljava/lang/String;")
	String aString50;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Z")
	boolean aBoolean309;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "Lclient!amz;")
	Class3_Sub18_Sub4 aClass3_Sub18_Sub4_2;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
	boolean aBoolean310;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!amv;")
	Class3_Sub18_Sub3 aClass3_Sub18_Sub3_2;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!amf;")
	Class3_Sub18_Sub2 aClass3_Sub18_Sub2_2;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Z")
	boolean aBoolean311;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "[B")
	final byte[] aByteArray24;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	final OggPage anOggPage2;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "Lclient!xn;")
	final Class581 aClass581_11;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "(Lclient!gp;B)V", line = 14)
	public static void method12277(@OriginalArg(0) Class205 arg0) {
		Class154.aClass205_1 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "(I)[Lclient!sq;", line = 14)
	public static Class463[] method12278() {
		return new Class463[] { Class463.aClass463_3, Class463.aClass463_2, Class463.aClass463_1 };
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V", line = 28)
	Class57(@OriginalArg(0) int arg0) {
		try {
			Class289.method25518().method27797("jagtheora");
		} catch (@Pc(8) Exception_Sub6 local8) {
			throw new RuntimeException("", local8);
		}
		this.aByteArray24 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass581_11 = new Class581(8);
	}

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "()Lclient!agc;", line = 45)
	Class3_Sub18 method12242() throws IOException {
		if (this.aBoolean308) {
			throw new IllegalStateException();
		} else if (this.aBoolean310) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method12224(this.aByteArray24);
				if (local23 == -1) {
					this.aBoolean310 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray24, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(178) Class3_Sub18 local178 = (Class3_Sub18) this.aClass581_11.method33217((long) local23);
				if (!local178.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local178;
			}
			@Pc(61) OggStreamState local61 = new OggStreamState(local23);
			if (!local61.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local61.packetPeek(this.anOggPacket2) == 1) {
				@Pc(97) Class3_Sub18 local97;
				if (this.aClass3_Sub18_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub18_Sub3_2 = new Class3_Sub18_Sub3(local61);
					local97 = this.aClass3_Sub18_Sub3_2;
				} else if (this.aClass3_Sub18_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub18_Sub4_2 = new Class3_Sub18_Sub4(local61);
					local97 = this.aClass3_Sub18_Sub4_2;
				} else {
					@Pc(119) byte[] local119 = this.anOggPacket2.getData();
					@Pc(123) StringBuilder local123 = new StringBuilder();
					for (@Pc(125) int local125 = 1; local125 < local119.length && Character.isLetterOrDigit((char) local119[local125]); local125++) {
						local123.append((char) local119[local125]);
					}
					@Pc(148) String local148 = local123.toString();
					if (local148.equals("kate")) {
						local97 = new Class3_Sub18_Sub2(local61);
					} else {
						local97 = new Class3_Sub18_Sub1(local61);
					}
				}
				this.aClass581_11.method33241(local97, (long) local23);
				return local97;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "()Lclient!agc;", line = 45)
	Class3_Sub18 method12243() throws IOException {
		if (this.aBoolean308) {
			throw new IllegalStateException();
		} else if (this.aBoolean310) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method12224(this.aByteArray24);
				if (local23 == -1) {
					this.aBoolean310 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray24, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(178) Class3_Sub18 local178 = (Class3_Sub18) this.aClass581_11.method33217((long) local23);
				if (!local178.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local178;
			}
			@Pc(61) OggStreamState local61 = new OggStreamState(local23);
			if (!local61.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local61.packetPeek(this.anOggPacket2) == 1) {
				@Pc(97) Class3_Sub18 local97;
				if (this.aClass3_Sub18_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub18_Sub3_2 = new Class3_Sub18_Sub3(local61);
					local97 = this.aClass3_Sub18_Sub3_2;
				} else if (this.aClass3_Sub18_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub18_Sub4_2 = new Class3_Sub18_Sub4(local61);
					local97 = this.aClass3_Sub18_Sub4_2;
				} else {
					@Pc(119) byte[] local119 = this.anOggPacket2.getData();
					@Pc(123) StringBuilder local123 = new StringBuilder();
					for (@Pc(125) int local125 = 1; local125 < local119.length && Character.isLetterOrDigit((char) local119[local125]); local125++) {
						local123.append((char) local119[local125]);
					}
					@Pc(148) String local148 = local123.toString();
					if (local148.equals("kate")) {
						local97 = new Class3_Sub18_Sub2(local61);
					} else {
						local97 = new Class3_Sub18_Sub1(local61);
					}
				}
				this.aClass581_11.method33241(local97, (long) local23);
				return local97;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "()Lclient!agc;", line = 45)
	Class3_Sub18 method12244() throws IOException {
		if (this.aBoolean308) {
			throw new IllegalStateException();
		} else if (this.aBoolean310) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method12224(this.aByteArray24);
				if (local23 == -1) {
					this.aBoolean310 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray24, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(178) Class3_Sub18 local178 = (Class3_Sub18) this.aClass581_11.method33217((long) local23);
				if (!local178.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local178;
			}
			@Pc(61) OggStreamState local61 = new OggStreamState(local23);
			if (!local61.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local61.packetPeek(this.anOggPacket2) == 1) {
				@Pc(97) Class3_Sub18 local97;
				if (this.aClass3_Sub18_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub18_Sub3_2 = new Class3_Sub18_Sub3(local61);
					local97 = this.aClass3_Sub18_Sub3_2;
				} else if (this.aClass3_Sub18_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub18_Sub4_2 = new Class3_Sub18_Sub4(local61);
					local97 = this.aClass3_Sub18_Sub4_2;
				} else {
					@Pc(119) byte[] local119 = this.anOggPacket2.getData();
					@Pc(123) StringBuilder local123 = new StringBuilder();
					for (@Pc(125) int local125 = 1; local125 < local119.length && Character.isLetterOrDigit((char) local119[local125]); local125++) {
						local123.append((char) local119[local125]);
					}
					@Pc(148) String local148 = local123.toString();
					if (local148.equals("kate")) {
						local97 = new Class3_Sub18_Sub2(local61);
					} else {
						local97 = new Class3_Sub18_Sub1(local61);
					}
				}
				this.aClass581_11.method33241(local97, (long) local23);
				return local97;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Lclient!agc;", line = 45)
	Class3_Sub18 method12254() throws IOException {
		if (this.aBoolean308) {
			throw new IllegalStateException();
		} else if (this.aBoolean310) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method12224(this.aByteArray24);
				if (local23 == -1) {
					this.aBoolean310 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray24, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(178) Class3_Sub18 local178 = (Class3_Sub18) this.aClass581_11.method33217((long) local23);
				if (!local178.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local178;
			}
			@Pc(61) OggStreamState local61 = new OggStreamState(local23);
			if (!local61.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local61.packetPeek(this.anOggPacket2) == 1) {
				@Pc(97) Class3_Sub18 local97;
				if (this.aClass3_Sub18_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub18_Sub3_2 = new Class3_Sub18_Sub3(local61);
					local97 = this.aClass3_Sub18_Sub3_2;
				} else if (this.aClass3_Sub18_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub18_Sub4_2 = new Class3_Sub18_Sub4(local61);
					local97 = this.aClass3_Sub18_Sub4_2;
				} else {
					@Pc(119) byte[] local119 = this.anOggPacket2.getData();
					@Pc(123) StringBuilder local123 = new StringBuilder();
					for (@Pc(125) int local125 = 1; local125 < local119.length && Character.isLetterOrDigit((char) local119[local125]); local125++) {
						local123.append((char) local119[local125]);
					}
					@Pc(148) String local148 = local123.toString();
					if (local148.equals("kate")) {
						local97 = new Class3_Sub18_Sub2(local61);
					} else {
						local97 = new Class3_Sub18_Sub1(local61);
					}
				}
				this.aClass581_11.method33241(local97, (long) local23);
				return local97;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "(Lclient!de;IB)Lclient!co;", line = 83)
	public static Class6 method12276(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) Class528.aClass581_39.method33217((long) arg1);
		if (local5 != null) {
			@Pc(13) Class3_Sub18_Sub3 local13 = local5.aClass57_Sub1_1.method12234();
			local5.aBoolean330 = true;
			if (local13 != null) {
				Class528.aClass524_1.aClass21_12 = arg0;
				return (Class6) local13.method19393(Class528.aClass524_1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "()V", line = 98)
	public void method12227() throws IOException {
		if (this.aBoolean311) {
			return;
		}
		while (!this.aBoolean308) {
			@Pc(13) Class3_Sub18 local13;
			if (this.aBoolean309) {
				local13 = (Class3_Sub18) this.aClass581_11.method33217((long) this.anOggPage2.getSerialNumber());
			} else {
				local13 = this.method12254();
				if (local13 == null) {
					if (this.aBoolean310) {
						this.method12230();
					}
					return;
				}
				if (local13 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean309 = true;
			}
			if (local13 == this.aClass3_Sub18_Sub4_2) {
				if (this.aClass3_Sub18_Sub4_2.method19510() >= 50) {
					return;
				}
				while (this.aClass3_Sub18_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub18_Sub4_2.method19495(this.anOggPacket2);
					this.method12228();
					if (this.aClass3_Sub18_Sub3_2 != null) {
						@Pc(80) double local80 = this.aClass3_Sub18_Sub3_2.method19390();
						for (@Pc(82) int local82 = 0; local82 < 10 && this.method12262(); local82++) {
							this.method12239();
							if (this.aBoolean308) {
								return;
							}
						}
						if (local80 < this.aClass3_Sub18_Sub3_2.method19390()) {
							return;
						}
					}
					if (this.aClass3_Sub18_Sub4_2.method19510() >= 50) {
						return;
					}
				}
			} else if (local13 instanceof Class3_Sub18_Sub2) {
				this.method12228();
			} else if (this.aClass3_Sub18_Sub3_2 != local13) {
				while (local13.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local13.anInt2708 * -1552515449 == 1 && local13 instanceof Class3_Sub18_Sub2) {
						this.method12236(this.aString50);
					}
					local13.method19495(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub18_Sub4_2 == null && !this.aBoolean311) {
				for (@Pc(160) int local160 = 0; local160 < 10 && this.method12262(); local160++) {
					this.method12239();
					if (this.aBoolean308) {
						return;
					}
				}
				return;
			}
			this.aBoolean309 = false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(S)V", line = 98)
	public void method12229() throws IOException {
		if (this.aBoolean311) {
			return;
		}
		while (!this.aBoolean308) {
			@Pc(13) Class3_Sub18 local13;
			if (this.aBoolean309) {
				local13 = (Class3_Sub18) this.aClass581_11.method33217((long) this.anOggPage2.getSerialNumber());
			} else {
				local13 = this.method12254();
				if (local13 == null) {
					if (this.aBoolean310) {
						this.method12230();
					}
					return;
				}
				if (local13 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean309 = true;
			}
			if (local13 == this.aClass3_Sub18_Sub4_2) {
				if (this.aClass3_Sub18_Sub4_2.method19510() >= 50) {
					return;
				}
				while (this.aClass3_Sub18_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub18_Sub4_2.method19495(this.anOggPacket2);
					this.method12228();
					if (this.aClass3_Sub18_Sub3_2 != null) {
						@Pc(80) double local80 = this.aClass3_Sub18_Sub3_2.method19390();
						for (@Pc(82) int local82 = 0; local82 < 10 && this.method12262(); local82++) {
							this.method12239();
							if (this.aBoolean308) {
								return;
							}
						}
						if (local80 < this.aClass3_Sub18_Sub3_2.method19390()) {
							return;
						}
					}
					if (this.aClass3_Sub18_Sub4_2.method19510() >= 50) {
						return;
					}
				}
			} else if (local13 instanceof Class3_Sub18_Sub2) {
				this.method12228();
			} else if (this.aClass3_Sub18_Sub3_2 != local13) {
				while (local13.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local13.anInt2708 * -1552515449 == 1 && local13 instanceof Class3_Sub18_Sub2) {
						this.method12236(this.aString50);
					}
					local13.method19495(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub18_Sub4_2 == null && !this.aBoolean311) {
				for (@Pc(160) int local160 = 0; local160 < 10 && this.method12262(); local160++) {
					this.method12239();
					if (this.aBoolean308) {
						return;
					}
				}
				return;
			}
			this.aBoolean309 = false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "()V", line = 98)
	public void method12245() throws IOException {
		if (this.aBoolean311) {
			return;
		}
		while (!this.aBoolean308) {
			@Pc(13) Class3_Sub18 local13;
			if (this.aBoolean309) {
				local13 = (Class3_Sub18) this.aClass581_11.method33217((long) this.anOggPage2.getSerialNumber());
			} else {
				local13 = this.method12254();
				if (local13 == null) {
					if (this.aBoolean310) {
						this.method12230();
					}
					return;
				}
				if (local13 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean309 = true;
			}
			if (local13 == this.aClass3_Sub18_Sub4_2) {
				if (this.aClass3_Sub18_Sub4_2.method19510() >= 50) {
					return;
				}
				while (this.aClass3_Sub18_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub18_Sub4_2.method19495(this.anOggPacket2);
					this.method12228();
					if (this.aClass3_Sub18_Sub3_2 != null) {
						@Pc(80) double local80 = this.aClass3_Sub18_Sub3_2.method19390();
						for (@Pc(82) int local82 = 0; local82 < 10 && this.method12262(); local82++) {
							this.method12239();
							if (this.aBoolean308) {
								return;
							}
						}
						if (local80 < this.aClass3_Sub18_Sub3_2.method19390()) {
							return;
						}
					}
					if (this.aClass3_Sub18_Sub4_2.method19510() >= 50) {
						return;
					}
				}
			} else if (local13 instanceof Class3_Sub18_Sub2) {
				this.method12228();
			} else if (this.aClass3_Sub18_Sub3_2 != local13) {
				while (local13.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local13.anInt2708 * -1552515449 == 1 && local13 instanceof Class3_Sub18_Sub2) {
						this.method12236(this.aString50);
					}
					local13.method19495(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub18_Sub4_2 == null && !this.aBoolean311) {
				for (@Pc(160) int local160 = 0; local160 < 10 && this.method12262(); local160++) {
					this.method12239();
					if (this.aBoolean308) {
						return;
					}
				}
				return;
			}
			this.aBoolean309 = false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "()V", line = 98)
	public void method12246() throws IOException {
		if (this.aBoolean311) {
			return;
		}
		while (!this.aBoolean308) {
			@Pc(13) Class3_Sub18 local13;
			if (this.aBoolean309) {
				local13 = (Class3_Sub18) this.aClass581_11.method33217((long) this.anOggPage2.getSerialNumber());
			} else {
				local13 = this.method12254();
				if (local13 == null) {
					if (this.aBoolean310) {
						this.method12230();
					}
					return;
				}
				if (local13 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean309 = true;
			}
			if (local13 == this.aClass3_Sub18_Sub4_2) {
				if (this.aClass3_Sub18_Sub4_2.method19510() >= 50) {
					return;
				}
				while (this.aClass3_Sub18_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub18_Sub4_2.method19495(this.anOggPacket2);
					this.method12228();
					if (this.aClass3_Sub18_Sub3_2 != null) {
						@Pc(80) double local80 = this.aClass3_Sub18_Sub3_2.method19390();
						for (@Pc(82) int local82 = 0; local82 < 10 && this.method12262(); local82++) {
							this.method12239();
							if (this.aBoolean308) {
								return;
							}
						}
						if (local80 < this.aClass3_Sub18_Sub3_2.method19390()) {
							return;
						}
					}
					if (this.aClass3_Sub18_Sub4_2.method19510() >= 50) {
						return;
					}
				}
			} else if (local13 instanceof Class3_Sub18_Sub2) {
				this.method12228();
			} else if (this.aClass3_Sub18_Sub3_2 != local13) {
				while (local13.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local13.anInt2708 * -1552515449 == 1 && local13 instanceof Class3_Sub18_Sub2) {
						this.method12236(this.aString50);
					}
					local13.method19495(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub18_Sub4_2 == null && !this.aBoolean311) {
				for (@Pc(160) int local160 = 0; local160 < 10 && this.method12262(); local160++) {
					this.method12239();
					if (this.aBoolean308) {
						return;
					}
				}
				return;
			}
			this.aBoolean309 = false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "()V", line = 154)
	void method12225() throws IOException {
		while (this.aClass3_Sub18_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class3_Sub18 local11 = this.method12254();
			if (local11 == null) {
				if (this.aBoolean310) {
					this.method12230();
				}
				return;
			}
			if (local11 == this.aClass3_Sub18_Sub2_2) {
				this.method12228();
			}
		}
		this.aClass3_Sub18_Sub3_2.method19495(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "(S)V", line = 154)
	void method12239() throws IOException {
		while (this.aClass3_Sub18_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class3_Sub18 local11 = this.method12254();
			if (local11 == null) {
				if (this.aBoolean310) {
					this.method12230();
				}
				return;
			}
			if (local11 == this.aClass3_Sub18_Sub2_2) {
				this.method12228();
			}
		}
		this.aClass3_Sub18_Sub3_2.method19495(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "()V", line = 154)
	void method12249() throws IOException {
		while (this.aClass3_Sub18_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class3_Sub18 local11 = this.method12254();
			if (local11 == null) {
				if (this.aBoolean310) {
					this.method12230();
				}
				return;
			}
			if (local11 == this.aClass3_Sub18_Sub2_2) {
				this.method12228();
			}
		}
		this.aClass3_Sub18_Sub3_2.method19495(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V", line = 166)
	void method12228() {
		for (@Pc(5) Class3_Sub18 local5 = (Class3_Sub18) this.aClass581_11.method33221(); local5 != null; local5 = (Class3_Sub18) this.aClass581_11.method33231()) {
			if (local5 instanceof Class3_Sub18_Sub2) {
				@Pc(14) Class3_Sub18_Sub2 local14 = (Class3_Sub18_Sub2) local5;
				while ((local14.anInt2708 * -1552515449 <= 8 || this.method12237() > (double) local14.method18815()) && local14.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local14.method19495(this.anOggPacket2);
				}
			}
		}
		this.method12236(this.aString50);
	}

	@OriginalMember(owner = "client!qc", name = "at", descriptor = "()V", line = 166)
	void method12250() {
		for (@Pc(5) Class3_Sub18 local5 = (Class3_Sub18) this.aClass581_11.method33221(); local5 != null; local5 = (Class3_Sub18) this.aClass581_11.method33231()) {
			if (local5 instanceof Class3_Sub18_Sub2) {
				@Pc(14) Class3_Sub18_Sub2 local14 = (Class3_Sub18_Sub2) local5;
				while ((local14.anInt2708 * -1552515449 <= 8 || this.method12237() > (double) local14.method18815()) && local14.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local14.method19495(this.anOggPacket2);
				}
			}
		}
		this.method12236(this.aString50);
	}

	@OriginalMember(owner = "client!qc", name = "af", descriptor = "()V", line = 166)
	void method12272() {
		for (@Pc(5) Class3_Sub18 local5 = (Class3_Sub18) this.aClass581_11.method33221(); local5 != null; local5 = (Class3_Sub18) this.aClass581_11.method33231()) {
			if (local5 instanceof Class3_Sub18_Sub2) {
				@Pc(14) Class3_Sub18_Sub2 local14 = (Class3_Sub18_Sub2) local5;
				while ((local14.anInt2708 * -1552515449 <= 8 || this.method12237() > (double) local14.method18815()) && local14.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local14.method19495(this.anOggPacket2);
				}
			}
		}
		this.method12236(this.aString50);
	}

	@OriginalMember(owner = "client!qc", name = "aa", descriptor = "()Z", line = 180)
	boolean method12252() {
		if (this.aClass3_Sub18_Sub4_2 == null) {
			@Pc(26) double local26 = (double) this.aClass3_Sub18_Sub3_2.method19397();
			return local26 == 0.0D || (double) Class176.method23413() >= (double) this.aClass3_Sub18_Sub3_2.method19391() + 1000.0D / local26;
		} else {
			return !this.aClass3_Sub18_Sub3_2.method19392() || this.method12237() > this.aClass3_Sub18_Sub3_2.method19390();
		}
	}

	@OriginalMember(owner = "client!qc", name = "ah", descriptor = "()Z", line = 180)
	boolean method12253() {
		if (this.aClass3_Sub18_Sub4_2 == null) {
			@Pc(26) double local26 = (double) this.aClass3_Sub18_Sub3_2.method19397();
			return local26 == 0.0D || (double) Class176.method23413() >= (double) this.aClass3_Sub18_Sub3_2.method19391() + 1000.0D / local26;
		} else {
			return !this.aClass3_Sub18_Sub3_2.method19392() || this.method12237() > this.aClass3_Sub18_Sub3_2.method19390();
		}
	}

	@OriginalMember(owner = "client!qc", name = "ak", descriptor = "()Z", line = 180)
	boolean method12259() {
		if (this.aClass3_Sub18_Sub4_2 == null) {
			@Pc(26) double local26 = (double) this.aClass3_Sub18_Sub3_2.method19397();
			return local26 == 0.0D || (double) Class176.method23413() >= (double) this.aClass3_Sub18_Sub3_2.method19391() + 1000.0D / local26;
		} else {
			return !this.aClass3_Sub18_Sub3_2.method19392() || this.method12237() > this.aClass3_Sub18_Sub3_2.method19390();
		}
	}

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "(I)Z", line = 180)
	boolean method12262() {
		if (this.aClass3_Sub18_Sub4_2 == null) {
			@Pc(26) double local26 = (double) this.aClass3_Sub18_Sub3_2.method19397();
			return local26 == 0.0D || (double) Class176.method23413() >= (double) this.aClass3_Sub18_Sub3_2.method19391() + 1000.0D / local26;
		} else {
			return !this.aClass3_Sub18_Sub3_2.method19392() || this.method12237() > this.aClass3_Sub18_Sub3_2.method19390();
		}
	}

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "(I)V", line = 188)
	void method12230() {
		for (@Pc(5) Class3_Sub18 local5 = (Class3_Sub18) this.aClass581_11.method33221(); local5 != null; local5 = (Class3_Sub18) this.aClass581_11.method33231()) {
			if (this.aClass3_Sub18_Sub3_2 != local5) {
				while (local5.anOggStreamState5.packetOut() == 1) {
					local5.method19495(this.anOggPacket2);
				}
			}
		}
		if (this.aClass3_Sub18_Sub3_2 == null) {
			return;
		}
		for (@Pc(37) int local37 = 0; local37 < 10 && this.method12262(); local37++) {
			if (this.aClass3_Sub18_Sub3_2.anOggStreamState5.packetOut() != 1) {
				this.method12231();
				return;
			}
			this.aClass3_Sub18_Sub3_2.method19495(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "aj", descriptor = "()V", line = 188)
	void method12255() {
		for (@Pc(5) Class3_Sub18 local5 = (Class3_Sub18) this.aClass581_11.method33221(); local5 != null; local5 = (Class3_Sub18) this.aClass581_11.method33231()) {
			if (this.aClass3_Sub18_Sub3_2 != local5) {
				while (local5.anOggStreamState5.packetOut() == 1) {
					local5.method19495(this.anOggPacket2);
				}
			}
		}
		if (this.aClass3_Sub18_Sub3_2 == null) {
			return;
		}
		for (@Pc(37) int local37 = 0; local37 < 10 && this.method12262(); local37++) {
			if (this.aClass3_Sub18_Sub3_2.anOggStreamState5.packetOut() != 1) {
				this.method12231();
				return;
			}
			this.aClass3_Sub18_Sub3_2.method19495(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "an", descriptor = "()V", line = 188)
	void method12263() {
		for (@Pc(5) Class3_Sub18 local5 = (Class3_Sub18) this.aClass581_11.method33221(); local5 != null; local5 = (Class3_Sub18) this.aClass581_11.method33231()) {
			if (this.aClass3_Sub18_Sub3_2 != local5) {
				while (local5.anOggStreamState5.packetOut() == 1) {
					local5.method19495(this.anOggPacket2);
				}
			}
		}
		if (this.aClass3_Sub18_Sub3_2 == null) {
			return;
		}
		for (@Pc(37) int local37 = 0; local37 < 10 && this.method12262(); local37++) {
			if (this.aClass3_Sub18_Sub3_2.anOggStreamState5.packetOut() != 1) {
				this.method12231();
				return;
			}
			this.aClass3_Sub18_Sub3_2.method19495(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "(I)V", line = 205)
	public void method12231() {
		if (this.aBoolean308) {
			return;
		}
		for (@Pc(9) Class3_Sub18 local9 = (Class3_Sub18) this.aClass581_11.method33221(); local9 != null; local9 = (Class3_Sub18) this.aClass581_11.method33231()) {
			local9.method19499();
			local9.anOggStreamState5.method25193();
		}
		this.anOggPacket2.method25193();
		this.anOggPage2.method25193();
		this.anOggSyncState2.method25193();
		this.aBoolean308 = true;
	}

	@OriginalMember(owner = "client!qc", name = "as", descriptor = "()V", line = 205)
	public void method12256() {
		if (this.aBoolean308) {
			return;
		}
		for (@Pc(9) Class3_Sub18 local9 = (Class3_Sub18) this.aClass581_11.method33221(); local9 != null; local9 = (Class3_Sub18) this.aClass581_11.method33231()) {
			local9.method19499();
			local9.anOggStreamState5.method25193();
		}
		this.anOggPacket2.method25193();
		this.anOggPage2.method25193();
		this.anOggSyncState2.method25193();
		this.aBoolean308 = true;
	}

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "(B)Lclient!amv;", line = 217)
	public Class3_Sub18_Sub3 method12234() {
		return this.aClass3_Sub18_Sub3_2;
	}

	@OriginalMember(owner = "client!qc", name = "av", descriptor = "()Lclient!amv;", line = 217)
	public Class3_Sub18_Sub3 method12248() {
		return this.aClass3_Sub18_Sub3_2;
	}

	@OriginalMember(owner = "client!qc", name = "ai", descriptor = "()Lclient!amv;", line = 217)
	public Class3_Sub18_Sub3 method12257() {
		return this.aClass3_Sub18_Sub3_2;
	}

	@OriginalMember(owner = "client!qc", name = "aq", descriptor = "()Lclient!amv;", line = 217)
	public Class3_Sub18_Sub3 method12258() {
		return this.aClass3_Sub18_Sub3_2;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lclient!amz;", line = 221)
	public Class3_Sub18_Sub4 method12233() {
		return this.aClass3_Sub18_Sub4_2;
	}

	@OriginalMember(owner = "client!qc", name = "al", descriptor = "()Lclient!amz;", line = 221)
	public Class3_Sub18_Sub4 method12247() {
		return this.aClass3_Sub18_Sub4_2;
	}

	@OriginalMember(owner = "client!qc", name = "ax", descriptor = "()Lclient!amz;", line = 221)
	public Class3_Sub18_Sub4 method12260() {
		return this.aClass3_Sub18_Sub4_2;
	}

	@OriginalMember(owner = "client!qc", name = "az", descriptor = "()Lclient!amz;", line = 221)
	public Class3_Sub18_Sub4 method12261() {
		return this.aClass3_Sub18_Sub4_2;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Lclient!amf;", line = 225)
	public Class3_Sub18_Sub2 method12226() {
		return this.aClass3_Sub18_Sub2_2;
	}

	@OriginalMember(owner = "client!qc", name = "ao", descriptor = "()Lclient!amf;", line = 225)
	public Class3_Sub18_Sub2 method12251() {
		return this.aClass3_Sub18_Sub2_2;
	}

	@OriginalMember(owner = "client!qc", name = "ap", descriptor = "()Lclient!amf;", line = 225)
	public Class3_Sub18_Sub2 method12264() {
		return this.aClass3_Sub18_Sub2_2;
	}

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "()Lclient!amf;", line = 225)
	public Class3_Sub18_Sub2 method12265() {
		return this.aClass3_Sub18_Sub2_2;
	}

	@OriginalMember(owner = "client!qc", name = "au", descriptor = "()Lclient!amf;", line = 225)
	public Class3_Sub18_Sub2 method12266() {
		return this.aClass3_Sub18_Sub2_2;
	}

	@OriginalMember(owner = "client!qc", name = "ar", descriptor = "()Z", line = 229)
	public boolean method12223() {
		if (this.aBoolean308 || this.aBoolean310) {
			return this.aClass3_Sub18_Sub4_2 == null || this.aClass3_Sub18_Sub4_2.method19510() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "am", descriptor = "()Z", line = 229)
	public boolean method12232() {
		if (this.aBoolean308 || this.aBoolean310) {
			return this.aClass3_Sub18_Sub4_2 == null || this.aClass3_Sub18_Sub4_2.method19510() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "(I)Z", line = 229)
	public boolean method12235() {
		if (this.aBoolean308 || this.aBoolean310) {
			return this.aClass3_Sub18_Sub4_2 == null || this.aClass3_Sub18_Sub4_2.method19510() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "ay", descriptor = "()Z", line = 229)
	public boolean method12267() {
		if (this.aBoolean308 || this.aBoolean310) {
			return this.aClass3_Sub18_Sub4_2 == null || this.aClass3_Sub18_Sub4_2.method19510() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "ag", descriptor = "()Z", line = 229)
	public boolean method12268() {
		if (this.aBoolean308 || this.aBoolean310) {
			return this.aClass3_Sub18_Sub4_2 == null || this.aClass3_Sub18_Sub4_2.method19510() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "(Ljava/lang/String;I)V", line = 235)
	public void method12236(@OriginalArg(0) String arg0) {
		this.aString50 = arg0;
		if (this.aString50 == null) {
			this.aClass3_Sub18_Sub2_2 = null;
			return;
		}
		if (this.aClass3_Sub18_Sub2_2 != null && !this.aString50.equals(this.aClass3_Sub18_Sub2_2.method18808())) {
			this.aClass3_Sub18_Sub2_2 = null;
		}
		if (this.aClass3_Sub18_Sub2_2 != null) {
			return;
		}
		for (@Pc(32) Class3_Sub18 local32 = (Class3_Sub18) this.aClass581_11.method33221(); local32 != null; local32 = (Class3_Sub18) this.aClass581_11.method33231()) {
			if (local32 instanceof Class3_Sub18_Sub2) {
				@Pc(41) Class3_Sub18_Sub2 local41 = (Class3_Sub18_Sub2) local32;
				if (this.aString50.equals(local41.method18808())) {
					this.aClass3_Sub18_Sub2_2 = local41;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "ad", descriptor = "(Ljava/lang/String;)V", line = 235)
	public void method12270(@OriginalArg(0) String arg0) {
		this.aString50 = arg0;
		if (this.aString50 == null) {
			this.aClass3_Sub18_Sub2_2 = null;
			return;
		}
		if (this.aClass3_Sub18_Sub2_2 != null && !this.aString50.equals(this.aClass3_Sub18_Sub2_2.method18808())) {
			this.aClass3_Sub18_Sub2_2 = null;
		}
		if (this.aClass3_Sub18_Sub2_2 != null) {
			return;
		}
		for (@Pc(32) Class3_Sub18 local32 = (Class3_Sub18) this.aClass581_11.method33221(); local32 != null; local32 = (Class3_Sub18) this.aClass581_11.method33231()) {
			if (local32 instanceof Class3_Sub18_Sub2) {
				@Pc(41) Class3_Sub18_Sub2 local41 = (Class3_Sub18_Sub2) local32;
				if (this.aString50.equals(local41.method18808())) {
					this.aClass3_Sub18_Sub2_2 = local41;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "ae", descriptor = "(Ljava/lang/String;)V", line = 235)
	public void method12271(@OriginalArg(0) String arg0) {
		this.aString50 = arg0;
		if (this.aString50 == null) {
			this.aClass3_Sub18_Sub2_2 = null;
			return;
		}
		if (this.aClass3_Sub18_Sub2_2 != null && !this.aString50.equals(this.aClass3_Sub18_Sub2_2.method18808())) {
			this.aClass3_Sub18_Sub2_2 = null;
		}
		if (this.aClass3_Sub18_Sub2_2 != null) {
			return;
		}
		for (@Pc(32) Class3_Sub18 local32 = (Class3_Sub18) this.aClass581_11.method33221(); local32 != null; local32 = (Class3_Sub18) this.aClass581_11.method33231()) {
			if (local32 instanceof Class3_Sub18_Sub2) {
				@Pc(41) Class3_Sub18_Sub2 local41 = (Class3_Sub18_Sub2) local32;
				if (this.aString50.equals(local41.method18808())) {
					this.aClass3_Sub18_Sub2_2 = local41;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "aw", descriptor = "(Ljava/lang/String;)V", line = 235)
	public void method12273(@OriginalArg(0) String arg0) {
		this.aString50 = arg0;
		if (this.aString50 == null) {
			this.aClass3_Sub18_Sub2_2 = null;
			return;
		}
		if (this.aClass3_Sub18_Sub2_2 != null && !this.aString50.equals(this.aClass3_Sub18_Sub2_2.method18808())) {
			this.aClass3_Sub18_Sub2_2 = null;
		}
		if (this.aClass3_Sub18_Sub2_2 != null) {
			return;
		}
		for (@Pc(32) Class3_Sub18 local32 = (Class3_Sub18) this.aClass581_11.method33221(); local32 != null; local32 = (Class3_Sub18) this.aClass581_11.method33231()) {
			if (local32 instanceof Class3_Sub18_Sub2) {
				@Pc(41) Class3_Sub18_Sub2 local41 = (Class3_Sub18_Sub2) local32;
				if (this.aString50.equals(local41.method18808())) {
					this.aClass3_Sub18_Sub2_2 = local41;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "(I)D", line = 256)
	public double method12237() {
		if (this.aClass3_Sub18_Sub4_2 == null) {
			return this.aClass3_Sub18_Sub3_2 == null ? 0.0D : this.aClass3_Sub18_Sub3_2.method19390();
		} else {
			return this.aClass3_Sub18_Sub4_2.method19511();
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(ZI)V", line = 264)
	public void method12238(@OriginalArg(0) boolean arg0) {
		if (this.aClass3_Sub18_Sub4_2 != null) {
			@Pc(7) Class3_Sub35_Sub1 local7 = this.aClass3_Sub18_Sub4_2.method19508();
			if (local7 != null) {
				local7.method18848(arg0);
			}
		}
		this.aBoolean311 = !this.aBoolean311;
	}

	@OriginalMember(owner = "client!qc", name = "ac", descriptor = "(Z)V", line = 264)
	public void method12274(@OriginalArg(0) boolean arg0) {
		if (this.aClass3_Sub18_Sub4_2 != null) {
			@Pc(7) Class3_Sub35_Sub1 local7 = this.aClass3_Sub18_Sub4_2.method19508();
			if (local7 != null) {
				local7.method18848(arg0);
			}
		}
		this.aBoolean311 = !this.aBoolean311;
	}

	@OriginalMember(owner = "client!qc", name = "bw", descriptor = "(Z)V", line = 264)
	public void method12275(@OriginalArg(0) boolean arg0) {
		if (this.aClass3_Sub18_Sub4_2 != null) {
			@Pc(7) Class3_Sub35_Sub1 local7 = this.aClass3_Sub18_Sub4_2.method19508();
			if (local7 != null) {
				local7.method18848(arg0);
			}
		}
		this.aBoolean311 = !this.aBoolean311;
	}

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "([BI)I")
	abstract int method12224(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "([B)I")
	abstract int method12240(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "([B)I")
	abstract int method12241(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "([B)I")
	abstract int method12269(@OriginalArg(0) byte[] arg0) throws IOException;
}
