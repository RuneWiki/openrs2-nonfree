import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class Class274 {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class274() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(30) GraphicsDevice local30 = local14[local18];
				if (local30 != null && local30.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local30;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(I)V")
	public void method5728() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5730(null);
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(B)[I")
	public int[] method5729() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(18) int local18 = 0; local18 < local3.length; local18++) {
			local9[local18 << 2] = local3[local18].getWidth();
			local9[(local18 << 2) + 1] = local3[local18].getHeight();
			local9[(local18 << 2) + 2] = local3[local18].getBitDepth();
			local9[(local18 << 2) + 3] = local3[local18].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method5730(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(12) Field local12 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local12.setAccessible(true);
			@Pc(22) boolean local22 = (Boolean) local12.get(this.aGraphicsDevice1);
			if (local22) {
				local1 = true;
				local12.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(63) Field local63 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local63.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(70) Throwable local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method5731(@OriginalArg(1) int arg0, @OriginalArg(2) Frame arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method5730(arg1);
		if (arg3 == 0) {
			@Pc(39) int local39 = this.aDisplayMode1.getRefreshRate();
			@Pc(43) DisplayMode[] local43 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(45) boolean local45 = false;
			for (@Pc(47) int local47 = 0; local47 < local43.length; local47++) {
				if (local43[local47].getWidth() == arg0 && arg4 == local43[local47].getHeight() && arg2 == local43[local47].getBitDepth()) {
					@Pc(74) int local74 = local43[local47].getRefreshRate();
					if (!local45 || Math.abs(local74 - local39) < Math.abs(arg3 - local39)) {
						local45 = true;
						arg3 = local74;
					}
				}
			}
			if (!local45) {
				arg3 = local39;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg0, arg4, arg2, arg3));
	}
}
