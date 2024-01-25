import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class Class326 {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class326() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local14[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Z)[I")
	public int[] method8067() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(14) int[] local14 = new int[local3.length << 2];
		for (@Pc(16) int local16 = 0; local16 < local3.length; local16++) {
			local14[local16 << 2] = local3[local16].getWidth();
			local14[(local16 << 2) + 1] = local3[local16].getHeight();
			local14[(local16 << 2) + 2] = local3[local16].getBitDepth();
			local14[(local16 << 2) + 3] = local3[local16].getRefreshRate();
		}
		return local14;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method8068(@OriginalArg(0) Frame arg0) {
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			;
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(IIILjava/awt/Frame;II)V")
	public void method8069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Frame arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg2.setUndecorated(true);
		arg2.enableInputMethods(false);
		this.method8068(arg2);
		if (arg1 == 0) {
			@Pc(39) int local39 = this.aDisplayMode1.getRefreshRate();
			@Pc(43) DisplayMode[] local43 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(45) boolean local45 = false;
			for (@Pc(47) int local47 = 0; local47 < local43.length; local47++) {
				if (local43[local47].getWidth() == arg3 && arg4 == local43[local47].getHeight() && arg0 == local43[local47].getBitDepth()) {
					@Pc(79) int local79 = local43[local47].getRefreshRate();
					if (!local45 || Math.abs(local79 - local39) < Math.abs(arg1 - local39)) {
						local45 = true;
						arg1 = local79;
					}
				}
			}
			if (!local45) {
				arg1 = local39;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg3, arg4, arg0, arg1));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(B)V")
	public void method8070() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method8068(null);
	}
}
