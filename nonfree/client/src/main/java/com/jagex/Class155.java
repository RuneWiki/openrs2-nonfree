package com.jagex;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
class Class155 implements Interface41 {

	@OriginalMember(owner = "client!ep", name = "bo", descriptor = "Ljava/awt/EventQueue;")
	static EventQueue anEventQueue1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ep", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "(I)V", line = 39)
	public static void method23174() {
		if (2 == 1115111877 * client.anInt3039 && (!Class146.method23084() && !Class239.method24624())) {
			Class166.method23342(4);
		}
	}

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "(Lclient!vs;I)V", line = 95)
	static void method23171(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray487 == null ? 0 : local15.anIntArray487.length;
	}

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!ft;)V", line = 114)
	Class155(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 116)
	@Override
	public void method23175(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(19) Class320 local19 = this.this$0.method23567();
		@Pc(23) Class320 local23 = Class320.method25928(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method25861();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat259 > local6.aFloat259 - local45 / 2.0F && local19.aFloat259 < local45 / 2.0F + local6.aFloat259 && local19.aFloat261 > local6.aFloat261 - local51 / 2.0F && local19.aFloat261 < local6.aFloat261 + local51 / 2.0F) {
				local102 = Math.abs(local19.aFloat259 - (local45 / 2.0F + local6.aFloat259));
				@Pc(113) float local113 = Math.abs(local19.aFloat259 - (local6.aFloat259 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat261 - (local6.aFloat259 + local51 / 2.0F));
				@Pc(135) float local135 = Math.abs(local19.aFloat261 - (local6.aFloat259 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = local143 * (1.0F / local139);
				@Pc(159) float local159 = local147 * (1.0F / local139);
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat259 != 0.0F || local23.aFloat261 != 0.0F) {
				@Pc(227) int local227;
				if (Class72.anInt2086 * 81180077 == 3) {
					local102 = Class80.aClass23_Sub1_1.method5836();
					if (local23.aFloat259 != 0.0F || local23.aFloat261 != 0.0F) {
						local227 = (int) ((double) (local102 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat259, (double) local23.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = local240 * local227 / 8192 + (16384 - local240 >> 1);
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class3_Sub35_Sub1.anInt2644 * -446514573) - (int) (Math.atan2((double) local23.aFloat259, (double) local23.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = (16384 - local227 >> 1) + local227 * local295 / 8192;
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V", line = 116)
	@Override
	public void method23178(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(19) Class320 local19 = this.this$0.method23567();
		@Pc(23) Class320 local23 = Class320.method25928(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method25861();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat259 > local6.aFloat259 - local45 / 2.0F && local19.aFloat259 < local45 / 2.0F + local6.aFloat259 && local19.aFloat261 > local6.aFloat261 - local51 / 2.0F && local19.aFloat261 < local6.aFloat261 + local51 / 2.0F) {
				local102 = Math.abs(local19.aFloat259 - (local45 / 2.0F + local6.aFloat259));
				@Pc(113) float local113 = Math.abs(local19.aFloat259 - (local6.aFloat259 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat261 - (local6.aFloat259 + local51 / 2.0F));
				@Pc(135) float local135 = Math.abs(local19.aFloat261 - (local6.aFloat259 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = local143 * (1.0F / local139);
				@Pc(159) float local159 = local147 * (1.0F / local139);
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat259 != 0.0F || local23.aFloat261 != 0.0F) {
				@Pc(227) int local227;
				if (Class72.anInt2086 * 81180077 == 3) {
					local102 = Class80.aClass23_Sub1_1.method5836();
					if (local23.aFloat259 != 0.0F || local23.aFloat261 != 0.0F) {
						local227 = (int) ((double) (local102 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat259, (double) local23.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = local240 * local227 / 8192 + (16384 - local240 >> 1);
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class3_Sub35_Sub1.anInt2644 * -446514573) - (int) (Math.atan2((double) local23.aFloat259, (double) local23.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = (16384 - local227 >> 1) + local227 * local295 / 8192;
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 116)
	@Override
	public void method23176(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(19) Class320 local19 = this.this$0.method23567();
		@Pc(23) Class320 local23 = Class320.method25928(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method25861();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat259 > local6.aFloat259 - local45 / 2.0F && local19.aFloat259 < local45 / 2.0F + local6.aFloat259 && local19.aFloat261 > local6.aFloat261 - local51 / 2.0F && local19.aFloat261 < local6.aFloat261 + local51 / 2.0F) {
				local102 = Math.abs(local19.aFloat259 - (local45 / 2.0F + local6.aFloat259));
				@Pc(113) float local113 = Math.abs(local19.aFloat259 - (local6.aFloat259 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat261 - (local6.aFloat259 + local51 / 2.0F));
				@Pc(135) float local135 = Math.abs(local19.aFloat261 - (local6.aFloat259 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = local143 * (1.0F / local139);
				@Pc(159) float local159 = local147 * (1.0F / local139);
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat259 != 0.0F || local23.aFloat261 != 0.0F) {
				@Pc(227) int local227;
				if (Class72.anInt2086 * 81180077 == 3) {
					local102 = Class80.aClass23_Sub1_1.method5836();
					if (local23.aFloat259 != 0.0F || local23.aFloat261 != 0.0F) {
						local227 = (int) ((double) (local102 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat259, (double) local23.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = local240 * local227 / 8192 + (16384 - local240 >> 1);
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class3_Sub35_Sub1.anInt2644 * -446514573) - (int) (Math.atan2((double) local23.aFloat259, (double) local23.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = (16384 - local227 >> 1) + local227 * local295 / 8192;
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 116)
	@Override
	public void method23177(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(19) Class320 local19 = this.this$0.method23567();
		@Pc(23) Class320 local23 = Class320.method25928(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method25861();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat259 > local6.aFloat259 - local45 / 2.0F && local19.aFloat259 < local45 / 2.0F + local6.aFloat259 && local19.aFloat261 > local6.aFloat261 - local51 / 2.0F && local19.aFloat261 < local6.aFloat261 + local51 / 2.0F) {
				local102 = Math.abs(local19.aFloat259 - (local45 / 2.0F + local6.aFloat259));
				@Pc(113) float local113 = Math.abs(local19.aFloat259 - (local6.aFloat259 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat261 - (local6.aFloat259 + local51 / 2.0F));
				@Pc(135) float local135 = Math.abs(local19.aFloat261 - (local6.aFloat259 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = local143 * (1.0F / local139);
				@Pc(159) float local159 = local147 * (1.0F / local139);
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat259 != 0.0F || local23.aFloat261 != 0.0F) {
				@Pc(227) int local227;
				if (Class72.anInt2086 * 81180077 == 3) {
					local102 = Class80.aClass23_Sub1_1.method5836();
					if (local23.aFloat259 != 0.0F || local23.aFloat261 != 0.0F) {
						local227 = (int) ((double) (local102 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat259, (double) local23.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = local240 * local227 / 8192 + (16384 - local240 >> 1);
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class3_Sub35_Sub1.anInt2644 * -446514573) - (int) (Math.atan2((double) local23.aFloat259, (double) local23.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = (16384 - local227 >> 1) + local227 * local295 / 8192;
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "(I)V", line = 319)
	public static void method23173() {
		if (Class231.anInterface18Array1 == null) {
			return;
		}
		@Pc(4) Interface18[] local4 = Class231.anInterface18Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface18 local14 = local4[local6];
			local14.method24483();
		}
	}

	@OriginalMember(owner = "client!ep", name = "aj", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V", line = 729)
	public static final void method23170(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Class106.aCanvas6.getGraphics();
			if (Class410.aFont2 == null) {
				Class410.aFont2 = new Font("Helvetica", 1, 13);
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
			@Pc(76) int local76;
			@Pc(84) int local84;
			try {
				if (Class160.anImage4 == null) {
					Class160.anImage4 = Class106.aCanvas6.createImage(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
				}
				@Pc(55) Graphics local55 = Class160.anImage4.getGraphics();
				local55.setColor(Color.black);
				local55.fillRect(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
				local76 = Class128.anInt3317 * 2037417253 / 2 - 152;
				local84 = Class575.anInt5428 * 1261116487 / 2 - 18;
				local55.setColor(arg3);
				local55.drawRect(local76, local84, 303, 33);
				local55.setColor(arg2);
				local55.fillRect(local76 + 2, local84 + 2, arg0 * 3, 30);
				local55.setColor(Color.black);
				local55.drawRect(local76 + 1, local84 + 1, 301, 31);
				local55.fillRect(arg0 * 3 + local76 + 2, local84 + 2, 300 - arg0 * 3, 30);
				local55.setFont(Class410.aFont2);
				local55.setColor(arg4);
				local55.drawString(arg1, local76 + (304 - arg1.length() * 6) / 2, local84 + 22);
				if (Class390.aString139 != null) {
					local55.setFont(Class410.aFont2);
					local55.setColor(arg4);
					local55.drawString(Class390.aString139, Class128.anInt3317 * 2037417253 / 2 - Class390.aString139.length() * 6 / 2, Class575.anInt5428 * 1261116487 / 2 - 26);
				}
				local2.drawImage(Class160.anImage4, 0, 0, null);
			} catch (@Pc(201) Exception local201) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
				local76 = Class128.anInt3317 * 2037417253 / 2 - 152;
				local84 = Class575.anInt5428 * 1261116487 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local76, local84, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local76 + 2, local84 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local76 + 1, local84 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + 2 + local76, local84 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class410.aFont2);
				local2.setColor(arg4);
				if (Class390.aString139 != null) {
					local2.setFont(Class410.aFont2);
					local2.setColor(arg4);
					local2.drawString(Class390.aString139, Class128.anInt3317 * 2037417253 / 2 - Class390.aString139.length() * 6 / 2, Class575.anInt5428 * 1261116487 / 2 - 26);
				}
				local2.drawString(arg1, local76 + (304 - arg1.length() * 6) / 2, local84 + 22);
			}
		} catch (@Pc(339) Exception local339) {
			Class106.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!ep", name = "zg", descriptor = "(Lclient!vs;I)V", line = 8697)
	static final void method23172(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = arg0.aClass3_Sub30_3.method11625()[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
	}
}
