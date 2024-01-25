import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Class273 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class273() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method5807(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(28) Throwable local28) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(65) Field local65 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local65.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(72) Throwable local72) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Z)[I")
	public int[] method5808() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(B)V")
	public void method5809() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5807(null);
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IBLjava/awt/Frame;III)V")
	public void method5810(@OriginalArg(0) int arg0, @OriginalArg(2) Frame arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method5807(arg1);
		if (arg3 == 0) {
			@Pc(39) int local39 = this.aDisplayMode1.getRefreshRate();
			@Pc(43) DisplayMode[] local43 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(45) boolean local45 = false;
			for (@Pc(47) int local47 = 0; local47 < local43.length; local47++) {
				if (local43[local47].getWidth() == arg2 && arg0 == local43[local47].getHeight() && arg4 == local43[local47].getBitDepth()) {
					@Pc(74) int local74 = local43[local47].getRefreshRate();
					if (!local45 || Math.abs(local74 - local39) < Math.abs(arg3 - local39)) {
						arg3 = local74;
						local45 = true;
					}
				}
			}
			if (!local45) {
				arg3 = local39;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg2, arg0, arg4, arg3));
	}
}
